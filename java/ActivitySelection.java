import java.util.Scanner;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of activities: ");
        int n = sc.nextInt();

        int[] activities = new int[n];
        System.out.println("Enter array of activities:");
        for (int i = 0; i < n; i++) {
            activities[i] = sc.nextInt();
        }

        int[] start = new int[n];
        System.out.println("Enter start time of activities:");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        int[] finish = new int[n];
        System.out.println("Enter finish time of activities:");
        for (int i = 0; i < n; i++) {
            finish[i] = sc.nextInt();
        }

        System.out.print("Activities in solution are: ");
        
        System.out.print(activities[0] + " ");
        int lastSelected = 0;

        for (int i = 1; i < n; i++) {
            if (start[i] >= finish[lastSelected]) {
                System.out.print(activities[i] + " ");
                lastSelected = i;
            }
        }
    }
}
