import java.util.Scanner;

class SparseMatrixArray {
    public static void main(String[] args) {
        int sparseMatrix[][] = {
            {0, 0, 0, 0},
            {0, 0, 1, 0},
            {2, 0, 0, 3}
        };

        // Printing sparse matrix
        System.out.println("Sparse Matrix");
        for (int i = 0; i < sparseMatrix.length; i++) {
            for (int j = 0; j < sparseMatrix[i].length; j++) {
                System.out.print(sparseMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Counting non-zero elements
        int count = 0;
        for (int i = 0; i < sparseMatrix.length; i++) {
            for (int j = 0; j < sparseMatrix[i].length; j++) {
                if (sparseMatrix[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("Number of non-zero elements in sparse matrix is " + count);

        // Creating new matrix with non-zero elements
        int newMatrix[][] = new int[3][count];
        int k = 0;
        for (int i = 0; i < sparseMatrix.length; i++) {
            for (int j = 0; j < sparseMatrix[i].length; j++) {
                if (sparseMatrix[i][j] != 0) {
                    newMatrix[0][k] = i;
                    newMatrix[1][k] = j;
                    newMatrix[2][k] = sparseMatrix[i][j];
                    k++;
                }
            }
        }

        // Printing non-zero matrix
        System.out.println("Non-zero elements of sparse matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class Node {
    int value;
    int row_position;
    int column_position;
    Node next;

    public Node(int value, int row_position, int column_position) {
        this.value = value;
        this.row_position = row_position;
        this.column_position = column_position;
        this.next = null;
    }
}

class SparseMatrixLinkedList {
    Node start;

    public void createNewNode(int non_zero_element, int row_index, int column_index) {
        Node temp = start;
        if (temp == null) {
            start = new Node(non_zero_element, row_index, column_index);
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(non_zero_element, row_index, column_index);
        }
    }

    public void printList() {
        Node temp = start;

        System.out.print("Row: ");
        while (temp != null) {
            System.out.print(temp.row_position + " ");
            temp = temp.next;
        }
        System.out.println();

        temp = start;
        System.out.print("Column: ");
        while (temp != null) {
            System.out.print(temp.column_position + " ");
            temp = temp.next;
        }
        System.out.println();

        temp = start;
        System.out.print("Value: ");
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SparseMatrixDemo {
    public static void main(String[] args) {
        int sparseMatrix[][] = {
            {0, 0, 3, 0, 4},
            {0, 0, 5, 7, 0},
            {0, 0, 0, 0, 0},
            {0, 2, 6, 0, 0}
        };

        // Printing sparse matrix
        System.out.println("Sparse Matrix: ");
        for (int i = 0; i < sparseMatrix.length; i++) {
            for (int j = 0; j < sparseMatrix[i].length; j++) {
                System.out.print(sparseMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        SparseMatrixLinkedList list = new SparseMatrixLinkedList();

        for (int i = 0; i < sparseMatrix.length; i++) {
            for (int j = 0; j < sparseMatrix[i].length; j++) {
                if (sparseMatrix[i][j] != 0) {
                    list.createNewNode(sparseMatrix[i][j], i, j);
                }
            }
        }

        list.printList();
    }
}
