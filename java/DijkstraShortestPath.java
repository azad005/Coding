import java.util.*;

public class DijkstraShortestPath {
    static final int INF = Integer.MAX_VALUE;

    static void dijkstra(int[][] cost, int source) {
        int n = cost.length;
        int[] dist = new int[n];
        boolean[] s = new boolean[n];

        Arrays.fill(dist, INF);
        dist[source] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = findMinDistanceVertex(dist, s, n);
            s[u] = true;

            for (int v = 0; v < n; v++) {
                if (!s[v] && cost[u][v] != 0 && dist[u] != INF && dist[u] + cost[u][v] < dist[v]) {
                    dist[v] = dist[u] + cost[u][v];
                }
            }
        }

        printSolution(dist, source);
    }

    static int findMinDistanceVertex(int[] dist, boolean[] s, int n) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < n; v++) {
            if (!s[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    static void printSolution(int[] dist, int source) {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int n = scanner.nextInt();

        int[][] cost = new int[n][n];

        System.out.println("Enter the cost matrix (use 0 for no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the source vertex: ");
        int source = scanner.nextInt();

        dijkstra(cost, source);
    }
}
