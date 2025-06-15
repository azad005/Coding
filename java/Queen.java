import java.util.Scanner;

public class Queen {
    static int X [] = new   int [20];
    static boolean PLACE(int k, int i) {
        for (int j = 1; j < k; j++) {
            if (X[j] == i || Math.abs(X[j] - i) == Math.abs(j - k)) {
                return false;
            }
        }
        return true;
    }
    