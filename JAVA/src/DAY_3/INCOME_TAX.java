package DAY_3;

import java.util.Scanner;

public class INCOME_TAX {
    public static int taxCalculator(int income) {
        if (income > 500000) {
            return (int) (income + income * 0.3);
        } else if (income >= 150000) {
            return (int) (income + income * 0.1);
        } else {
            return income;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Income: ");
        int income = scanner.nextInt();
        int taxIncome = taxCalculator(income);
        System.out.println("Your taxIncome is: " + taxIncome);
        scanner.close();
    }
}
