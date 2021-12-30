package DAY_3_ASSIGNMENT_1;

//1. Accept 10 numbers from user find maximum number

import java.util.Scanner;

public class Q1 {
    public static void acceptData(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the 10 array elements: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        acceptData(arr);
        int max = findMax(arr);
        System.out.println(max);
        scanner.close();
    }
}
