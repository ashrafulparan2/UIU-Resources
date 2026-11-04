#include <stdio.h>
#include <math.h>

int main(void) {
    double x, y;

    scanf("%lf %lf", &x, &y);

    printf("Addition: %.2f\n", x + y);
    printf("Subtraction: %.2f\n", x - y);
    printf("Multiplication: %.2f\n", x * y);

    if (y != 0) {
        printf("Quotient: %.0f\n", trunc(x / y));
        printf("Remainder: %.2f\n", fmod(x, y));
    } else {
        printf("Division is not possible.\n");
    }

    return 0;
}
