using System;
using System.Linq;
using System.Text.RegularExpressions;

public static class Pangram
{
    public static bool IsPangram(string input)
    {
        string alphabet = "abcdefghijklmnopqrstuvwxyz";

        string inputLetters = Regex.Replace(input.ToLower(), @"[^a-z]+", String.Empty);

        return inputLetters.Distinct().Count() == alphabet.Length;
    }
}
