# Compressing and decompressing strings
This program has methods for compressing and decompressing strings.
## Compressing
Compresses a string by reducing sequences of repeating characters into the character followed by the number of times it repeats consecutively.
- "aaabb" → "a3b2"
- "abc" → "a1b1c1"
- "" → ""
## Decompressing
Reconstructs the original string.
- "a3b2" → "aaabb"
- "a1b1c1" → "abc"
- "" → ""
