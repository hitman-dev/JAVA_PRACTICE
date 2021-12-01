package DAY_4;

import java.util.Scanner;

public class PRIME_NUMBER {
    public static int PrimeNumber(int num) {
        if(num < 2) {
            return 0;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        String choice;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The number you To Check for even/odd: ");
            int num = sc.nextInt();

            int flag = PrimeNumber(num);
            if (flag == 0) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Y for yes or N for no: ");
            choice = s.next();
        }while (choice.equals("y"));
    }
}
