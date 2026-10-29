#include <stdio.h>
#include <limits.h>

int main(void) {
    printf("The unsigned int maximum: %u\n", UINT_MAX);
    printf("The unsigned long int maximum: %lu\n", ULONG_MAX);
    printf("The unsigned long long int maximum: %llu\n", ULLONG_MAX);
    printf("The unsigned short int maximum: %hu\n", USHRT_MAX);
    return 0;
}
