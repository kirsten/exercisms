using System;

public static class Leap
{
    public static bool IsLeapYear(int year)
    {
        return year % 4 == 0;
    }
}