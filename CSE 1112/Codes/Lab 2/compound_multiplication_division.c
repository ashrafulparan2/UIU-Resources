#include <stdio.h>

int main(void) {
    int x, y, original;
    scanf("%d %d", &x, &y);

    original = x;
    x *= y;
    printf("Multiplication: %d\n", x);

    if (y != 0) {
        x = original;
        x /= y;
        printf("Division: %d\n", x);
    } else {
        printf("Division is not possible.\n");
    }

    return 0;
}
