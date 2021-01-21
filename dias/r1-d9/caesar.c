#include <cs50.h>
#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>


int main(int argc, string argv[])
{
    if (argc != 2)
    {
        printf("Usage: ./caesar (int) key\n");
        return 1;
    }

    for (int i = 0, len = strlen(argv[1]); i < len; i++)
    {
        if (isdigit(argv[1][i]) == 0)
        {
            printf("Usage: ./caesar (int) key\n");
            return 1;
        }
    }

    int key = atoi(argv[1]);

    while (key > 26)
    {
        key -= 26;
    }


    string plaintext = get_string("plaintext: ");

    printf("ciphertext: ");
    for (int i = 0, len = strlen(plaintext); i < len; i++)
    {
        if (isalpha(plaintext[i]))
        {
            //check if its uppercase
            if (isupper(plaintext[i]))
            {
                char letter = plaintext[i] + key;
                if (letter > 'Z')
                {
                    letter = (char)('A' - 1) + (int)(letter - 'Z');
                }
                printf("%c", letter);
            }

            else
            {
                char letter = '\0';
                int ascii = plaintext[i] + key;
                if (ascii > 122)
                {
                    letter = (char)('a' - 1)  + (ascii - 122);
                }
                else
                {
                    letter = ascii;
                }
                printf("%c", letter);
            }
        }
        else
        {
            printf("%c", plaintext[i]);
        }
    }
    printf("\n");

    return 0;

}