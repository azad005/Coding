import java.util.Scanner;

public class LongestCommonSubsequence {

    public static void lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] C = new int[m + 1][n + 1]; // Table to store lengths of LCS
        char[][] B = new char[m + 1][n + 1]; // Table to store directions ('D', 'U', 'L')

        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    C[i][j] = C[i - 1][j - 1] + 1;
                    B[i][j] = 'D'; // Diagonal
                } else if (C[i - 1][j] >= C[i][j - 1]) {
                    C[i][j] = C[i - 1][j];
                    B[i][j] = 'U'; // Up
                } else {
                    C[i][j] = C[i][j - 1];
                    B[i][j] = 'L'; // Left
                }
            }
        }

        // Print LCS
        System.out.println("Length of LCS: " + C[m][n]);
        System.out.print("LCS: ");
        printLCS(B, X, m, n);
    }

    private static void printLCS(char[][] B, String X, int i, int j) {
        if (i == 0 || j == 0) return;
        if (B[i][j] == 'D') { // Move diagonally
            printLCS(B, X, i - 1, j - 1);
            System.out.print(X.charAt(i - 1));
        } else if (B[i][j] == 'U') { // Move up
            printLCS(B, X, i - 1, j);
        } else { // Move left
            printLCS(B, X, i, j - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first sequence: ");
        String X = scanner.nextLine();

        System.out.print("Enter the second sequence: ");
        String Y = scanner.nextLine();

        lcs(X, Y);
    }
}
