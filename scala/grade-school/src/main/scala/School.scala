import scala.collection.immutable.TreeMap

class School {
  type DB = Map[Int, Seq[String]]

  private var gradeDB: DB = Map[Int, Seq[String]]()

  def add(name: String, g: Int) = {
    val names: Seq[String] = gradeDB.get(g) match {
      case Some(n) => n :+ name
      case None => Seq(name)
    }

    gradeDB = gradeDB.updated(g, names)
  }

  def db: DB = gradeDB

  def grade(g: Int): Seq[String] =
    gradeDB.getOrElse(g, Seq())

  def sorted: DB = {
    val sortedNames = gradeDB.map { case (key, value) => (key, value.sorted) }
    TreeMap(sortedNames.toSeq:_*)
  }
}
