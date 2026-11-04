#include <stdio.h>

int main(void) {
    double r;
    const double PI = 3.14;

    scanf("%lf", &r);

    printf("Circumference: %.2f\n", 2 * PI * r);
    return 0;
}
