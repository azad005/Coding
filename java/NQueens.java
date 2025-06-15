import java.util.Scanner;

public class NQueens {
    static int[] X = new int[20];

    static boolean PLACE(int k, int i) {
        for (int j = 1; j < k; j++) {
            if (X[j] == i || Math.abs(X[j] - i) == Math.abs(j - k)) {
                return false;
            }
        }
        return true;
    }

    static void N_QUEENS(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (PLACE(k, i)) {
                X[k] = i;
                if (k == n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print(X[j] + " ");
                    }
                    System.out.println();
                } else {
                    N_QUEENS(k + 1, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of queens: ");
        int n = scanner.nextInt();
        System.out.println("Positions of queens are: ");
        N_QUEENS(1, n);
        scanner.close();
    }
}
