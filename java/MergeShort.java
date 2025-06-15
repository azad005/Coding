import java.util.Arrays;

public class MergeShort{
    static int count = 0;

    public static void merge(int[] A, int s, int m, int l) {
        count++;
        int i = s, j = m + 1, p = 0;
        count++;
        int[] B = new int[l - s + 1];
        count++;

        while (i <= m && j <= l) {
            count++;
            if (A[i] <= A[j]) {
                count++;
                B[p++] = A[i++];
                count++;
            } else {
                count++;
                B[p++] = A[j++];
                count++;
            }
            count++;
        }
        count++;

        while (i <= m) {
            count++;
            B[p++] = A[i++];
            count++;
        }
        count++;

        while (j <= l) {
            count++;
            B[p++] = A[j++];
            count++;
        }
        count++;

        for (i = s, p = 0; i <= l; i++, p++) {
            count++;
            A[i] = B[p];
            count++;
        }
        count++;
    }

    public static void mergeSort(int[] A, int s, int l) {
        if (s < l) {
            count++;
            int m = (s + l) / 2;
            count++;
            mergeSort(A, s, m);
            count++;
            mergeSort(A, m + 1, l);
            count++;
            merge(A, s, m, l);
            count++;
        }
        count++;
    }

    public static void main(String[] args) {
        int[] A = {20, 50, 1, 30, 10, 9, 88, 70, 100};
        System.out.println("Original array: " + Arrays.toString(A));
        mergeSort(A, 0, A.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(A));
        System.out.println("Total number of comparisons: " + count);
    }
}
