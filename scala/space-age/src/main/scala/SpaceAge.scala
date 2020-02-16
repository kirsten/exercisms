object SpaceAge {
  def onEarth(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 1
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onMercury(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 0.2408467
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onVenus(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 0.61519726
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onMars(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 1.8808158
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onJupiter(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 11.862615
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onSaturn(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 29.447498
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onUranus(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 84.016846
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  def onNeptune(ageInSeconds: Double): Double = {
    val orbitalPeriodInEarthYears: Double = 164.79132
    calculateAgeInYears(ageInSeconds, orbitalPeriodInEarthYears)
  }

  private def calculateAgeInYears(ageInSeconds: Double, pctOfEarthYear: Double): Double = {
    val earthYearInSeconds: Double = 31557600
    ageInSeconds / (earthYearInSeconds * pctOfEarthYear)
  }
}
