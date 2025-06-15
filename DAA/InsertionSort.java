import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] p = new int[50];
        int n;

        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter the number of elements (max 50): ");
        n = scanner.nextInt();

        if (n <= 0 || n > 50) {
            System.out.println("Invalid number of elements! Please enter a value between 1 and 50.");
            return;
        }

        // Taking input for the array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }

        // Insertion Sort algorithm
        int count = 0; // To count the number of operations
        for (int k = 1; k < n; k++) {
            count++;
            int temp = p[k];
            count++;
            int ptr = k - 1;
            count++;
            while (ptr >= 0 && temp < p[ptr]) {
                count++;
                p[ptr + 1] = p[ptr];
                count++;
                ptr--;
                count++;
            }
            count++;
            p[ptr + 1] = temp;
            count++;
        }
        count++;

        // Printing the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }

        // Printing the count of operations
        System.out.println("\nThe count of operations is: " + count);
    }
}
