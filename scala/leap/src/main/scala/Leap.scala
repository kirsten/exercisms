object Leap {
  def leapYear(year: Int): Boolean = {
    divisibleBy(year, 4) && !divisibleBy(year, 100) || divisibleBy(year, 400)
  }

  private def divisibleBy(dividend: Int, divisor: Int): Boolean = {
    dividend % divisor == 0
  }
}
