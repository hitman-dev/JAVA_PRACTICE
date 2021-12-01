package DAY_4;

import java.util.Scanner;

public class MAX_OF_THREE {
    public static int maxNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do {
            System.out.println("Enter three numbers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int max = maxNumber(num1, num2, num3);
            System.out.println("The maximum of three number is: " + max);
            System.out.println("Want to check again: y/n?");
            choice = scanner.next();
        } while (choice.equals("y"));
        scanner.close();
    }
}
