package DAY_1;

import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add separated by space: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        for (String number : numbers) {
            sum = sum + Integer.parseInt(number);
        }
        System.out.println("total sum is: "+sum);
    }
}
