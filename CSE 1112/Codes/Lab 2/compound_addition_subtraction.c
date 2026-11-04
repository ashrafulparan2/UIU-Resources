#include <stdio.h>

int main(void) {
    int x, y, original;
    scanf("%d %d", &x, &y);

    original = x;
    x += y;
    printf("Incremented Value: %d\n", x);

    x = original;
    x -= y;
    printf("Decremented Value: %d\n", x);

    return 0;
}
