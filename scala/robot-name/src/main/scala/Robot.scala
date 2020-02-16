import scala.util.Random

class Robot {
  private var _name: String = RobotNames.names.next

  def name(): String = _name

  def reset(): Unit = _name = RobotNames.names.next
}

object RobotNames {
  val names: Iterator[String] = Stream.continually(newUniqueName).distinct.iterator

  def newUniqueName(): String = {
    val alpha = Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase
    val numeric = Random.alphanumeric.filterNot(_.isLetter).take(3).mkString

    alpha + numeric
  }
}
