package DAY_5.com.demo.test;
/*
		 * 1. write code to display factorial of a number from the given array if number is

		prime number otherwise display table of that number

		2. Write code to accept a number  from user
		and find addition of all numbers which are divisible by given number

		3. accept a number from user and check whether the number exists in the array

		*/
import DAY_5.com.demo.service.ARRAY_2D_UTIL;

import java.util.Scanner;

public class TEST_ARRAY_2D_DEMO {
    public static void primeOfArrayNum(int[] arr){
        for (int x : arr) {
            if (ARRAY_2D_UTIL.primeNumber(x)) {
                System.out.println("The number"+x+"is prime therefore");
                System.out.printf("Factorial of %d is: %d\n",x,ARRAY_2D_UTIL.factorial(x));
            }
            else {
                System.out.println("The number"+x+"is not prime therefore");
                System.out.println("Table of number: "+x);
                for (int i = 1;i<=x;i++){
                    System.out.printf("%d x %d : %d\n",x,i,x*i);
                }
            }
        }
    }

    public static int addDivNum(int num,int[] arr){
        int sum = 0;
        for(int x: arr){
            if (x%num==0){
                sum = sum+x;
            }
        }
        return sum;
    }

    public static boolean numExists(int num,int[] arr){
        for(int x: arr){
            if (x==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];///initialization of the array

        ARRAY_2D_UTIL.acceptData(arr);
        ARRAY_2D_UTIL.displayData(arr);

        primeOfArrayNum(arr);

        System.out.print("Addition of all numbers which are divisible by given number\nEnter the number: ");
        int num1 = sc.nextInt();
        int sum = addDivNum(num1,arr);
        System.out.printf("Sum of all number divisible by %d is: %d\n",num1,sum);

        System.out.print("Enter a number to check if it exists in array: ");
        int num2 = sc.nextInt();
        boolean flag = numExists(num2,arr);
        if (flag){
            System.out.println("The number"+num1+"Exists in the array");
        }
        else {
            System.out.println("The number"+num1+" Dose not Exists in the array");
        }
    }

}
