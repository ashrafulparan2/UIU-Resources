#include <stdio.h>

int main(void) {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    printf("%d\n", (a + b) <= 80 && b >= 0);
    printf("%d\n", (a - b) == 0 || c != 0);
    printf("%d\n", a != b || (b < a) && c > 0);

    return 0;
}
