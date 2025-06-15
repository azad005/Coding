import java.util.*;

class Item {
    int weight, value;
    double ratio;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
}

public class GreedyKnapsack {
    public static double fractionalKnapsack(int M, int[] W, int[] V) {
        int n = W.length;
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(new Item(W[i], V[i]));
        }

        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double maxValue = 0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= M) {
                maxValue += item.value;
                currentWeight += item.weight;
            } else {
                double fraction = (double) (M - currentWeight) / item.weight;
                maxValue += item.value * fraction;
                break;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] W = {10, 20, 30, 40, 50};
        int[] V = {60, 100, 120, 140, 200};
        int M = 50;

        double maxValue = fractionalKnapsack(M, W, V);
        System.out.println("Maximum Value: " + maxValue);
    }
}
