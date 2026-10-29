#include <stdio.h>
#include <float.h>
#include <limits.h>

int main(void) {
    printf("The long int maximum: %ld\n", LONG_MAX);
    printf("The long long int maximum: %lld\n", LLONG_MAX);
    printf("The short int maximum: %hd\n", SHRT_MAX);
    printf("The long double maximum: %LE\n", LDBL_MAX);
    printf("The long double minimum positive value: %LE\n", LDBL_MIN);
    return 0;
}
