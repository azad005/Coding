import java.util.Arrays;
import java.util.Scanner;

public class GreedyKnapsack {
    static class Item {
        int profit, weight;
        double ratio;
        int index;

        Item(int profit, int weight, int index) {
            this.profit = profit;
            this.weight = weight;
            this.index = index;
            this.ratio = (double) profit / weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of objects (n): ");
        int n = sc.nextInt();

        Item[] items = new Item[n];
        System.out.println("Enter the profit array:");
        for (int i = 0; i < n; i++) {
            int profit = sc.nextInt();
            items[i] = new Item(profit, 0, i);
        }

        System.out.println("Enter the weight array:");
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            items[i].weight = weight;
        }

        System.out.print("Enter the knapsack capacity (m): ");
        int capacity = sc.nextInt();

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double[] x = new double[n];
        double profitEarned = 0.0;
        int remainingCapacity = capacity;

        for (int i = 0; i < n; i++) {
            if (items[i].weight <= remainingCapacity) {
                x[items[i].index] = 1.0;
                profitEarned += items[i].profit;
                remainingCapacity -= items[i].weight;
            } else {
                x[items[i].index] = (double) remainingCapacity / items[i].weight;
                profitEarned += items[i].profit * x[items[i].index];
                break;
            }
        }

        System.out.print("The resultant x vector is: (");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println(")");
        System.out.println("Profit earned is: " + profitEarned);
    }
}
