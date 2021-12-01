package DAY_1;

import java.util.Scanner;

public class MATHS {
    public static void main(String[] args) {

        int num1, num2, sum, substractions, mulplication, division, modulus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number, a= : ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number, b= : ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        substractions = num1 - num2;
        mulplication= num1*num2;
        division=num1/num2;
        modulus=num1%num2;
        System.out.println("Sum a + b = "+sum);
        System.out.println("Subtractions a - b = "+substractions);
        System.out.println("Multiplication a x b = "+mulplication);
        System.out.println("Division a / b = "+division);
        System.out.println("Modulus a % b = "+modulus);

    }

}
