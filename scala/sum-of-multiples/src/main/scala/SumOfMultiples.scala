object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val multipleOfAnyFactors = (x: Int) => factors.exists(factor => x % factor == 0)

    (1 until limit).filter(multipleOfAnyFactors).sum
  }
}

