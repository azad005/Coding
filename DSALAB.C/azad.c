#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() { 
    srand(time(0)); 

    int matrix[9][9];

    // Fill and print the matrix
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            matrix[i][j] = rand() % 100; 
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    // Traverse and print the matrix
    printf("\nTraversal of the matrix: \n");
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            printf("matrix[%d][%d] = %d\n", i, j, matrix[i][j]);
        }
    }

    // Calculate the sum of the last column
    int sum = 0;
    for (int i = 0; i < 9; i++) {
        sum+= matrix[i][8];
    }
    printf("Sum of all elements of the last column is: %d\n", sum);

    // Delete a specified value from the matrix
    int deleteValue;
    printf("Enter the value you want to be deleted: ");
    scanf("%d", &deleteValue);

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (matrix[i][j] == deleteValue) {
                matrix[i][j] = 0;
            }
        }
    }

    // Print the new matrix
    printf("New Matrix: \n");
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}
