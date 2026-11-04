#include <stdio.h>

int main(void) {
    int i, converted_int;
    float f, converted_float;

    scanf("%d %f", &i, &f);

    converted_int = f;
    printf("Assignment: %.3f assigned to an int produces %d\n",
           f, converted_int);

    converted_float = i;
    printf("Assignment: %d assigned to a float produces %f\n",
           i, converted_float);

    printf("Type Casting: (float) %d produces %f\n",
           i, (float)i);

    printf("Type Casting: (int) %.3f produces %d\n",
           f, (int)f);

    return 0;
}
