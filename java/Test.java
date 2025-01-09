import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);  // Pass the message to the Exception class
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // User inputs their age
        
        try {
            vote(age);  // Call the vote method with the user's input
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());  // Print the custom exception message
        } finally {
            System.out.println("Thank you for using the voting eligibility checker.");
        }
        
        scanner.close();
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
