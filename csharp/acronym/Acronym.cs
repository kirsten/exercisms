using System;
using System.Linq;

public static class Acronym
{
    public static string Abbreviate(string phrase)
    {
        char[] delimiters = { ' ', '-' };
        string[] words = phrase.Split(delimiters);
        string[] firstLetters = words.Select((word) => {
            if (word.Length == 0) return "";

            return word.Substring(0, 1);
        }).ToArray();
        string acronym = String.Join("", firstLetters).ToUpper();

        return acronym;
    }
}
