package DAY_3_ASSIGNMENT_1;

//5. Accept Income from user and calculate tax
//        income            			tax
//< 1500000          			0
//        >=150000   and  < 500000     20%
//        otherwise                    30%

import java.util.Scanner;

public class Q5 {
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
