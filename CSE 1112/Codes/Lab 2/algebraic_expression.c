#include <stdio.h>

int main(void) {
    double a, b, x;
    scanf("%lf %lf", &a, &b);

    double numerator = 3.31 * a * a + 2.01 * b * b * b;
    double denominator = 7.16 * b * b + 2.01 * a * a * a;

    if (denominator != 0) {
        x = numerator / denominator;
        printf("X = %.6f\n", x);
    } else {
        printf("The expression is undefined.\n");
    }

    return 0;
}
