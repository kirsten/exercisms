//
// This is only a SKELETON file for the 'Scrabble Score' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const score = (word) => {
    const letters = word.toLowerCase().split('');

    const values = {
        'a': 1,
        'e': 1,
        'f': 4,
        'i': 1,
        'k': 5,
        'o': 1,
        'q': 10,
        'r': 1,
        's': 1,
        't': 1,
        'u': 1,
        'y': 4,
        'z': 10
    };

    return letters.reduce((score, letter) => (
        score + values[letter]
    ), 0);
};
