#include <stdio.h>

int main(void) {
    int x, original;
    scanf("%d", &original);

    x = original;
    printf("X++ : %d\n", x++);

    x = original;
    printf("++X : %d\n", ++x);

    x = original;
    printf("X-- : %d\n", x--);

    x = original;
    printf("--X : %d\n", --x);

    return 0;
}
