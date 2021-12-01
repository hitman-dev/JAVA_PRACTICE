package DAY_1;

import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "N";
        do {
            System.out.println("Enter the number which you want to check if odd/even");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
            System.out.println("Do you want to continue(y/n)");
            ans = sc.next();
        } while (ans.equals("y"));
    }
}
