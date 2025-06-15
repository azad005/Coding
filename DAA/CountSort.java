import java.util.Scanner;

public class CountSort {
    public static void countSort(int[] A, int[] B, int[] C, int n, int k) {
        int count = 0;

        // Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            count++;
            C[A[i]] = C[A[i]] + 1;
            count++;
        }

        // Update the count array to store cumulative sums
        for (int i = 1; i <= k; i++) {
            count++;
            C[i] = C[i] + C[i - 1];
            count++;
        }

        // Build the sorted output array
        for (int j = n - 1; j >= 0; j--) {
            count++;
            B[C[A[j]] - 1] = A[j];
            count++;
            C[A[j]] = C[A[j]] - 1;
            count++;
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Print the operation count
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        // Input the elements of the array
        System.out.print("Enter the elements of the array: ");
        int max = 0;
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            if (A[i] > max) {
                max = A[i];
            }
        }

        // Allocate memory for the sorted array and count array
        int[] B = new int[n];
        int[] C = new int[max + 1];

        // Perform Count Sort
        countSort(A, B, C, n, max);

        scanner.close();
    }
}
