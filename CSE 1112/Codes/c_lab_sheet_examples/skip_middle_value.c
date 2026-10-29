#include <stdio.h>

int main(void) {
    int first, last;

    scanf("%d %*d %d", &first, &last);
    printf("First Value = %d, Last Value = %d\n", first, last);
    return 0;
}
