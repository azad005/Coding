import java.util.Arrays;

public class MatrixChainMultiplication {
    static final int MAX = 100;
    static int count = 0;

    public static void matrixChainOrder(int[] p, int n, int[][] m, int[][] s) {
        count++;
        for (int i = 1; i <= n; i++) {
            count++;
            m[i][i] = 0;
            count++;
        }
        count++;
        for (int l = 2; l <= n; l++) {
            count++;
            for (int i = 1; i <= n - l + 1; i++) { // Fixed minus operator
                count++;
                int j = i + l - 1; // Fixed typo
                count++;
                m[i][j] = Integer.MAX_VALUE;
                count++;
                for (int k = i; k < j; k++) { // Fixed typo
                    count++;
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]; // Fixed typo
                    count++;
                    if (q < m[i][j]) {
                        count++;
                        m[i][j] = q;

                        count++;
                        s[i][j] = k;
                        count++;
                    }
                    count++;
                }
                count++;
            }
            count++;
        }
        count++;
    }

    public static void parenthesization(int[][] s, int i, int j) {
        count++;
        if (i == j) {
            count++;
            System.out.print("A" + i);
            count++;
        } else {
            count++;
            System.out.print("(");
            count++;
            parenthesization(s, i, s[i][j]);
            count++;
            parenthesization(s, s[i][j] + 1, j);
            count++;
            System.out.print(")");
            count++;
        }
    }

    public static void main(String[] args) {
        int[] p = {3, 5, 6, 9, 10, 30, 29};
        int n = p.length - 1; // Fixed minus operator
        int[][] m = new int[MAX][MAX];
        int[][] s = new int[MAX][MAX];
        System.out.print("Input Dimensions: ");
        for (int i = 0; i < p.length; i++) { // Fixed typo
            System.out.print(p[i] + (i < p.length - 1 ? " x " : ""));
        }
        System.out.println();
        matrixChainOrder(p, n, m, s);
        System.out.println("Min. multiplications (m):");
        for (int i = 1; i <= n; i++) { // Fixed typo
            for (int j = 1; j <= n; j++) {
                if (m[i][j] != 0) {
                    System.out.printf("%5d ", m[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("Split points (s):");
        for (int i = 1; i <= n; i++) { // Fixed typo
            for (int j = 1; j <= n; j++) {
                if (s[i][j] != 0) {
                    System.out.printf("%5d ", s[i][j]);
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.print("Optimal Parenthesization: ");
        parenthesization(s, 1, n);
        System.out.println();
        System.out.println("Number of comparisons: " + count);
    }
}
