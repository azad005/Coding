#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main() {
    int matrix[9][9];
    int elements[9*9];

    create_matrix(matrix);

    // Display the original matrix
    print_matrix(matrix, "Original Matrix:");

    // Search for an element
    int search_value;
    printf("(i)Searching\n");
    printf("Enter the value to search in the matrix: ");
    scanf("%d", &search_value);
    search_element(matrix, search_value);

    // Traverse and print all elements in the matrix
    printf("\n(ii)Traversing:\n");
    traverse_matrix(matrix, elements);
    for (int i = 0; i < 9 * 9; i++) {
        printf("%d ", elements[i]);
        if ((i + 1) % 9== 0) {
            printf("\n");
        }
    }

    // Calculate and display the sum of elements
    printf("\n(iii)Sum of all elements: %d\n", sum_matrix(matrix));

    // Taking index for deletion from the user
    int delete_row, delete_col;
    printf("(iv)Deletion: Enter the index for deletion (row,col) (0-8,0-8): ");
    scanf("%d,%d", &delete_row, &delete_col);
    if (delete_row >= 0 && delete_row < 9 && delete_col >= 0 && delete_col < 9) {
        delete_element(matrix, delete_row, delete_col);
        print_matrix(matrix, "Matrix after deletion:");
    } else {
        printf("Invalid delete index.\n");
    }

    // Taking index and value for insertion from the user
    int insert_row, insert_col, new_value;
    printf("(v)Insertion: Enter the index for insertion (row,col) (0-8,0-8): ");
    scanf("%d,%d", &insert_row, &insert_col);
    printf("Enter the new value to insert: ");
    scanf("%d", &new_value);
    if (insert_row >= 0 && insert_row < 9 && insert_col >= 0 && insert_col < 9) {
        insert_element(matrix, insert_row, insert_col, new_value);
        print_matrix(matrix, "Matrix after insertion:");
    } else {
        printf("Invalid insert index.\n");
    }

    return 0;
}