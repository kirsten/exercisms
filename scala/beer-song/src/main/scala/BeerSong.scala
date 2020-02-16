object BeerSong {
  def recite(start: Int, numberOfVerses: Int): String = {
    val finalVerse = start - numberOfVerses + 1

    (finalVerse to start).reverse.map(currentBottleCount => {
      s"${numberOfBottles(currentBottleCount)} ${container(currentBottleCount)} of beer on the wall, ".capitalize +
      s"${numberOfBottles(currentBottleCount)} ${container(currentBottleCount)} of beer.\n" +
      s"${action(currentBottleCount)}, ".capitalize +
      s"${numberOfBottles(remainingBottles(currentBottleCount))} ${container(remainingBottles(currentBottleCount))} of beer on the wall.\n"
    }).reduce((left, right) => s"$left\n$right")
  }

  private def remainingBottles(count: Int): Int = {
    if (count == 0) 99 else count - 1
  }

  private def numberOfBottles(count: Int): String = {
    if (count == 0) "no more" else count.toString
  }

  private def container(count: Int): String = {
    if (count == 1) "bottle" else "bottles"
  }

  private def pronoun(count: Int): String = {
    if (count == 1) "it" else "one"
  }

  private def action(count: Int): String = {
    if (count == 0) {
      "go to the store and buy some more"
    } else {
      s"take ${pronoun(count)} down and pass it around"
    }
  }
}
