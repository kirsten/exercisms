using System;
using System.Linq;

public static class Acronym
{
    public static string Abbreviate(string phrase)
    {
        string[] words = phrase.Split(" ");
        string[] firstLetters = words.Select((word) => word.Substring(0, 1)).ToArray();
        string acronym = String.Join("", firstLetters).ToUpper();

        return acronym;
    }
}
