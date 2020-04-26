public static class Leap
{
    public static bool IsLeapYear(int year)
    {
        return DivisibleBy(year, 4) &&
            (!DivisibleBy(year, 100) || DivisibleBy(year, 400));
    }

    private static bool DivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}