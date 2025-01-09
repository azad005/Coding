import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Enter category (general/women): ");
        String category = sc.next().toLowerCase();

        double tax = 0;
        double noTaxLimit = category.equals("women") ? 190000 : 180000;

        if (income <= noTaxLimit) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - noTaxLimit) * 0.10;
        } else if (income <= 800000) {
            tax = (500000 - noTaxLimit) * 0.10 + (income - 500000) * 0.20;
        } else {
            tax = (500000 - noTaxLimit) * 0.10 + (800000 - 500000) * 0.20 + (income - 800000) * 0.30;
        }

        System.out.println("The tax for an income of " + income + " in the category '" + category + "' is: " + tax);
    }
}
