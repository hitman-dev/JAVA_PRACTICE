package DAY_7_ARRAY_ASSIGNMENT.Q2.com.demo.test;

import DAY_7_ARRAY_ASSIGNMENT.Q2.com.demo.bean.ARRAY_UTIL;

import java.util.Scanner;

public class TEST_EXIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers separated by space: ");
        int[] arr = new int[10];
        ARRAY_UTIL.acceptData(arr);

        System.out.print("Enter a number to check if it exist in array: ");
        int num = sc.nextInt();
        boolean flag = ARRAY_UTIL.checkExist(num, arr);
        if (flag) {
            System.out.println("The number "+num+" Exists in the array");
        } else {
            System.out.println("The number "+num+"doesn't exist in the array");
        }
    }
}
