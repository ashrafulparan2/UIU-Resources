#include <stdio.h>

int main(void) {
    int uninitialized;          /* Declared, not initialized */
    int score = 10;             /* Declare and initialize */
    int x = 1, y = 2, z = 3;   /* Different values */
    int a = 7, b = 7, c = 7;   /* Same value */

    uninitialized = 5;          /* Assign before reading */

    printf("uninitialized = %d\n", uninitialized);
    printf("score = %d\n", score);
    printf("x = %d, y = %d, z = %d\n", x, y, z);
    printf("a = %d, b = %d, c = %d\n", a, b, c);
    return 0;
}
