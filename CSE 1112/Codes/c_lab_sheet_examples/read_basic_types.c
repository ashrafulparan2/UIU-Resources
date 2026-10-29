#include <stdio.h>

int main(void) {
    int number;
    float value;
    char letter;

    scanf("%d %f %c", &number, &value, &letter);

    printf("The integer value: %d\n", number);
    printf("The floating point value: %f\n", value);
    printf("The character value: %c\n", letter);
    return 0;
}
