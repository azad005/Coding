import java.util.PriorityQueue;
import java.util.Scanner;

class Item {
    int weight, value, index;
    double bound;
    
    Item(int weight, int value, int index) {
        this.weight = weight;
        this.value = value;
        this.index = index;
    }
}

public class KnapsackBB {
    static int[] weights = {4, 7, 5, 3};
    static int[] values = {40, 42, 25, 12};
    static int capacity = 10;
    static int maxProfit = 0;
    static boolean[] bestItems = new boolean[4];
    
    static double getUpperBound(int index, int weight, int profit) {
        double bound = profit;
        int i = index;
        int remainingCapacity = capacity - weight;
        while (i < weights.length && weights[i] <= remainingCapacity) {
            remainingCapacity -= weights[i];
            bound += values[i];
            i++;
        }
        if (i < weights.length)
            bound += (remainingCapacity * ((double) values[i] / weights[i]));
        return bound;
    }
    
    static void knapsackBB() {
        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> Double.compare(b.bound, a.bound));
        pq.add(new Item(0, 0, -1));
        
        while (!pq.isEmpty()) {
            Item node = pq.poll();
            if (node.index == weights.length - 1) continue;
            
            int nextIndex = node.index + 1;
            int newWeight = node.weight + weights[nextIndex];
            int newProfit = node.value + values[nextIndex];
            
            if (newWeight <= capacity && newProfit > maxProfit) {
                maxProfit = newProfit;
                bestItems[nextIndex] = true;
            }
            
            double upperBound = getUpperBound(nextIndex + 1, newWeight, newProfit);
            if (upperBound > maxProfit) {
                pq.add(new Item(newWeight, newProfit, nextIndex));
            }
            
            upperBound = getUpperBound(nextIndex + 1, node.weight, node.value);
            if (upperBound > maxProfit) {
                pq.add(new Item(node.weight, node.value, nextIndex));
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: Capacity of Knapsack W=");
        capacity = scanner.nextInt();
        
        System.out.println("\nItem   Weight   Value   Value/Weight");
        for (int i = 0; i < weights.length; i++) {
            System.out.printf("%d      %d       $%d      %.2f\n", i + 1, weights[i], values[i], (double) values[i] / weights[i]);
        }
        
        knapsackBB();
        
        System.out.print("\nOutput: Optimal Solution is { ");
        for (int i = 0; i < bestItems.length; i++) {
            if (bestItems[i]) System.out.print((i + 1) + " ");
        }
        System.out.println("} with Weight = " + capacity + ", Value = $" + maxProfit);
        
        scanner.close();
    }
}
