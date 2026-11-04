#include <stdio.h>

int value = 10; /* Global variable */

int main(void) {

    printf("A. Global: %d\n", value);
    {
        int value = 20; /* Local variable shadows the global */
        printf("B. Local: %d\n", value);
    }
    return 0;
}
