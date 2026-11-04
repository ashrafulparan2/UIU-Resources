#include <stdio.h>
#include <math.h>

int main(void) {
    double x, absolute_value;
    scanf("%lf", &x);

    absolute_value = fabs(x);

    printf("A = %.0f, B = %.0f, C = %.1f\n",
           ceil(absolute_value),
           floor(absolute_value),
           absolute_value);

    return 0;
}
