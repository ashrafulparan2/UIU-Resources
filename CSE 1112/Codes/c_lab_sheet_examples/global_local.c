#include <stdio.h>

int value = 10; /* Global variable */

int main(void) {
    int *global_value = &value; /* Save the global variable's address */

    printf("A. Global: %d\n", value);
    {
        int value = 20; /* Local variable shadows the global */
        printf("B. Local: %d\n", value);
        printf("C. Global: %d\n", *global_value);
    }
    return 0;
}
