
enum Direction:
  case Up, Down, Left, Right, Forward, Backward


case class Pos3d(x: Int, y: Int, z: Int)



class Position3D(var x: Int, var y: Int, var z: Int) :
  /*
 * Move the position in the given direction
 * @param move the direction to move
 * @return the new position
 */
  def move(direction: Direction): Position3D = {
    direction match {
      case Direction.Up => Position3D(x, y + 1, z)
      case Direction.Down => Position3D(x, y - 1, z)
      case Direction.Left => Position3D(x - 1, y, z)
      case Direction.Right => Position3D(x + 1, y, z)
      case Direction.Forward => Position3D(x, y, z + 1)
      case Direction.Backward => Position3D(x, y, z - 1)
    }
  }

  override def equals(obj: Any): Boolean =
    obj match {
      case p: Position3D => return (p.x==x && p.y ==y && p.z == z)
      case _ => false
    }

  override def toString: String = ""+x+","+y+","+z


trait MazeElement:
  def position: Position3D

class Wall(val position3D: Position3D) extends MazeElement:
  def position: Position3D = position3D


class Exit(val position3D: Position3D) extends MazeElement:
  def position: Position3D = position3D


class Player(var pos: Position3D) extends MazeElement {
  def position: Position3D = pos
  def move(direction: Direction): Unit = {
    pos = pos.move(direction)
  }

}

class Maze {
  var elements: List[MazeElement] = List()
  var playerPosition: Option[Position3D] = None

  def addMazeElement(element: MazeElement): Maze = {
    elements = element :: elements
    return this
  }

  /*
   * Check if the game is over
   * @param element the element to check
   * @return true if the game is over, false otherwise
   */
  def isGameOver: Boolean = {
    playerPosition.exists(pos => elements.exists(elem => elem.isInstanceOf[Exit] && elem.position == pos))
  }

  def movePlayer(direction: Direction): Maze = {
    val player = elements.collectFirst {
      case p: Player => p }
    player.foreach { p =>
      p.move(direction)
      playerPosition = Some(p.position)
    }
    this
  }
}

def equalsApprox(a: Float, b: Float): Unit = {
 Math.abs(a-b) < 0.00000001
}

object Apple {
  @main
  def helloWorld() =
    println("Hello, world!")
    val myPlayer = Player(Position3D(0, 0, 0))
    val maze = new Maze()
      .addMazeElement(Wall(Position3D(1, 0, 0)))
      .addMazeElement(Wall(Position3D(0, 1, 0)))
      .addMazeElement(Exit(Position3D(2, 0, 0)))
      .addMazeElement(myPlayer)



    maze.movePlayer(Direction.Forward)
    assert(myPlayer.pos.equals(Position3D(0,0,1)))
    maze.movePlayer(Direction.Backward)
    assert(myPlayer.pos.equals(Position3D(0,0,0)))

    

    maze.movePlayer(Direction.Right)
    maze.movePlayer(Direction.Forward)
    println("Game Over: " + maze.isGameOver)
}
