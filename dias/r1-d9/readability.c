#include <cs50.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <math.h>

int countLetters(string text);
int countWords(string text);
int countSentences(string text);

int main(void)
{
    //Get Input text
    string text = get_string("Text: ");

    //Get total num of Words and average num of letters and sentences per 100 words
    double per100Words = 100.0 / countWords(text);

    double L = countLetters(text) * per100Words;
    double S = countSentences(text) * per100Words;

    double index = (0.0588 * L) - (0.296 * S) - 15.8;
    index = nearbyint(index);

    if (index < 1)
    {
        printf("Before Grade 1\n");
    }
    else if (index < 16)
    {
        printf("Grade %i\n", (int) index);
    }
    else
    {
        printf("Grade 16+\n");
    }
}




int countLetters(string text)
{
    // Initialize total num of letters
    int total = 0;

    //Loop through the text counting only letters
    for (int i = 0, len = strlen(text); i < len; i++)
    {
        if (isupper(text[i]) || islower(text[i]))
        {
            total ++;
        }
    }
    return total;
}

int countWords(string text)
{
    // Initialize total num of words
    int total = 1;

    //Loop through the text to count the number of spaces(words)
    for (int i = 0, len = strlen(text); i < len; i++)
    {
        if (isspace(text[i]))
        {
            total ++;
        }
    }
    return total;
}

int countSentences(string text)
{
    // Initialize total num of sentences
    int total = 0;

    //Loop through the text to count the number of ".", "!" and "?"(words)
    for (int i = 0, len = strlen(text); i < len; i++)
    {
        if (text[i] == '.' || text[i] == '?' || text[i] == '!')
        {
            total ++;
        }
    }
    return total;
}