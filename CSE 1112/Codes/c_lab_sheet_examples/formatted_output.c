#include <stdio.h>

int main(void) {
    double value;
    scanf("%lf", &value);

    /* (a) Minimum field width of 10; right-aligned by default */
    printf("(a) Val: %10f\n", value);

    /* (b) Width 2 is a minimum, not a maximum */
    printf("(b) Val:%2f\n", value);

    /* (c) Two digits after the decimal point */
    printf("(c) Val:%.2f\n", value);

    /* (d) Print with zero digits after the decimal point */
    printf("(d) Val:%.0f\n", value);

    /* (e) Scientific notation */
    printf("(e) Val: %e\n", value);

    return 0;
}
