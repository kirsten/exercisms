using System;
using System.Linq;
using System.Text.RegularExpressions;

public static class Isogram
{
    public static bool IsIsogram(string word)
    {
        string letters = Regex.Replace(word.ToLower(), @"[^a-z]+", String.Empty);
        return letters.Distinct().Count() == letters.Length;
    }
}
