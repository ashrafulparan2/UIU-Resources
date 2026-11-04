#include <stdio.h>

int main(void) {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    printf("%d\n", (a + b) <= 80);
    printf("%d\n", !(a + c));
    printf("%d\n", a != 0);

    return 0;
}
