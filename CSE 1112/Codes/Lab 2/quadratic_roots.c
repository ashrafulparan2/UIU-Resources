#include <stdio.h>
#include <math.h>

int main(void) {
    double a, b, c, discriminant;
    scanf("%lf %lf %lf", &a, &b, &c);

    discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
        printf("Imaginary\n");
    } else {
        double root1 = (-b + sqrt(discriminant)) / (2 * a);
        double root2 = (-b - sqrt(discriminant)) / (2 * a);

        printf("%.2f    %.2f\n", root1, root2);
    }

    return 0;
}
