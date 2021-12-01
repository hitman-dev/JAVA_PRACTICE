package DAY_4;

import java.util.Scanner;

public class SWITCH_CASE_MENU {
    public static void starTrianglePattern(int num) {
        for(int i=1;i<num;i++) {
            for(int j=0;j<i;j++) {
                System.out.print('*');

            }System.out.println();
        }
    }
    public static int factorial(int num){
        int i,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
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
        Scanner sc=new Scanner(System.in);

        System.out.println("1.factorial\n2.check Prime\n3. print Triangle\n4.exit");
        System.out.println("Choose what operation you want to perform");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int fact=factorial(num);
                System.out.println("Factorial of "+num+" is: "+fact);
                break;
            case 2:
                System.out.println("Enter the number");
                num=sc.nextInt();
                int flag = PrimeNumber(num);
                if (flag == 0) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
                break;
            case 3:
                System.out.println("Enter the number");
                num=sc.nextInt();
                starTrianglePattern(num);

                break;
            case 4:
                System.out.println("Thank you for visiting.....");
                System.exit(0);
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
