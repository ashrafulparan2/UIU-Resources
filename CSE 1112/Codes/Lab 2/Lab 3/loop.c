#include <stdio.h>

int main(int argc, char *argv[]) {
    // Print the total number of arguments passed
    printf("Total arguments (argc): %d\n", argc-1);

    // Loop through and print every argument
    for (int i = 1; i < argc; i++) {
        printf("argv[%d]: %s\n", i, argv[i]);
    }

    // Check if the user provided at least one extra argument
    if (argc > 1) {
        printf("\nHello, %s!\n", argv[1]);
    } else {
        printf("\nUsage: %s <your_name>\n", argv[0]);
    }

    return 0;
}