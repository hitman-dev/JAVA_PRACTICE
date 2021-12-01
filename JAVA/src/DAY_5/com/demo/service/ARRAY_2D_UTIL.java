package DAY_5.com.demo.service;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_2D_UTIL {
    public static void acceptData(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            System.out.print("Enter data "+i+"-->");
            arr[i] = scanner.nextInt();
        }
    }

    public static void displayData(int[] arr) {
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(arr));
        //Arrays.stream(arr).forEach(x->{System.out.println(x);});
    }

    public static int factorial(int num){
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static boolean primeNumber(int num){
        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

}
