#include <stdio.h>

int main(void) {
    int x, y, maximum;
    scanf("%d %d", &x, &y);

    maximum = (x > y) ? x : y;
    printf("Max: %d\n", maximum);

    return 0;
}
