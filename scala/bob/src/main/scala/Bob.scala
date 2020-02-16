object Bob {
  def response(statement: String): String = {
    def isQuestion(statement: String): Boolean = {
      statement.endsWith("?")
    }

    def isShouting(statement: String): Boolean = {
      statement.exists(_.isLetter) && !statement.exists(_.isLower)
    }

    statement.trim match {
      case statement if statement.isEmpty => "Fine. Be that way!"
      case statement if isShouting(statement) && isQuestion(statement) => "Calm down, I know what I'm doing!"
      case statement if isShouting(statement) => "Whoa, chill out!"
      case statement if isQuestion(statement) => "Sure."
      case _ => "Whatever."
    }
  }
}
