import java.util.*;

public class Knapsack {
    public static int knapsack(int n, int M, int[] W, int[] V) {
        int[][] dp = new int[n + 1][M + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                if (W[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i - 1]] + V[i - 1]);
                }
            }
        }

        List<Integer> selectedItems = new ArrayList<>();
        int i = n, j = M;
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                selectedItems.add(i - 1);
                j -= W[i - 1];
            }
            i--;
        }

        System.out.println("Maximum Value: " + dp[n][M]);
        System.out.print("Items Taken (0-based index): ");
        Collections.reverse(selectedItems);
        for (int item : selectedItems) {
            System.out.print(item + " ");
        }
        System.out.println();

        return dp[n][M];
    }

    public static void main(String[] args) {
        int n = 4;
        int M = 10;
        int[] W = {5, 4, 6, 3};
        int[] V = {10, 40, 30, 50};

        knapsack(n, M, W, V);
    }
}
