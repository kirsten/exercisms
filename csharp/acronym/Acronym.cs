using System;
using System.Linq;

public static class Acronym
{
    private static char[] Delimiters = { ' ', '-', '_'  };
    public static string Abbreviate(string phrase)
    {
        string[] words = phrase.Split(Delimiters);
        string[] firstLetters = FirstLetters(words);
        return String.Join("", firstLetters).ToUpper();
    }

    private static string[] FirstLetters(string[] words)
    {
        return words.Select((word) => {
            if (word.Length == 0) return "";

            return word.Substring(0, 1);
        }).ToArray();
    }
}
