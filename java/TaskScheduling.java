import java.util.Scanner;
import java.util.Arrays;

public class TaskScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of jobs: ");
        int n = sc.nextInt();
        
        int[] deadlines = new int[n + 1]; 
        deadlines[0] = 0; 


        System.out.println("Enter the deadlines of the jobs:");
        for (int i = 1; i <= n; i++) {
            deadlines[i] = sc.nextInt();
        }

        
        int[] jobSchedule = new int[n + 1];
        jobSchedule[0] = 0;
        jobSchedule[1] = 1; 
        int k = 1;

        
        for (int i = 2; i <= n; i++) {
            int r = k;
            while (r > 0 && deadlines[jobSchedule[r]] > deadlines[i]) {
                r--;
            }
            if (deadlines[jobSchedule[r]] <= deadlines[i] && deadlines[i] > r) {
                for (int m = k; m >= r + 1; m--) {
                    jobSchedule[m + 1] = jobSchedule[m];
                }
                jobSchedule[r + 1] = i;
                k++;
            }
        }

        
        System.out.print("Jobs in the optimal solution are: ");
        for (int i = 1; i <= k; i++) {
            System.out.print(jobSchedule[i] + " ");
        }
    }
}
