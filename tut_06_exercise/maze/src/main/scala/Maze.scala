
enum Direction:
  case Up, Down, Left, Right, Forward, Backward


class Position3D(x: Int, y: Int, z: Int):
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


trait MazeElement:
  def position: Position3D

class Wall(val position3D: Position3D) extends MazeElement:
  def position: Position3D = position3D


class Exit(val position3D: Position3D) extends MazeElement:
  def position: Position3D = position3D


class Player(var position3D: Position3D) extends MazeElement {
  def position: Position3D = position3D
  def move(direction: Direction): Unit = {
    position3D = position3D.move(direction)
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

@main
def main() =
  println("Hello, world!")
  val maze = new Maze()
    .addMazeElement(Wall(Position3D(1, 0, 0)))
    .addMazeElement(Wall(Position3D(0, 1, 0)))
    .addMazeElement(Exit(Position3D(2, 0, 0)))
    .addMazeElement(Player(Position3D(0, 0, 0)))

  maze.movePlayer(Direction.Forward)
  maze.movePlayer(Direction.Right)
  maze.movePlayer(Direction.Forward)
  println("Game Over: " + maze.isGameOver)