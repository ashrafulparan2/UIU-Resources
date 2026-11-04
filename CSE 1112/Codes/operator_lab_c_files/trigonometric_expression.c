#include <stdio.h>
#include <math.h>

int main(void) {
    double x, radian, result;
    const double PI = acos(-1.0);

    scanf("%lf", &x);
    radian = x * PI / 180.0;

    result = 2 * cos(radian) * cos(radian)
             - sqrt(3.0) * sin(radian)
             + sin(radian / 2.0);

    printf("%.10f\n", result);
    return 0;
}
