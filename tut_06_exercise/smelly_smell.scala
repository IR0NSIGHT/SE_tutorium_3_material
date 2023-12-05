import scala.io.Source
import scala.collection.mutable

def printHistogram(filename: String): Unit = {
  val lines: List[String] = Source.fromFile(filename).getLines.toList
  var gradeCounter: mutable.HashMap[String, Int] = mutable.HashMap()
  var grade: String = ""
  /*
  *
  */

  lines.foreach { line =>
    grade = line.split(",")(1) // grade is stored in second column
    if (gradeCounter.contains(grade)) {
      gradeCounter.update(grade, gradeCounter(grade) + 1)
    } else {
      gradeCounter.update(grade, 1)
    }
  }
  val possibleGrades = List("mit auszeichnung", "bestanden", "nicht bestanden")
  var count: Int = 0
  possibleGrades.foreach { g =>
    grade = g
    if (gradeCounter.contains(grade)) {
      count = gradeCounter(grade)
    }
    println(grade + ":" + "|".repeat(count))
    count = 0
  }
}

@main
def main(filename: String): Unit = {
  printHistogram(filename)
}