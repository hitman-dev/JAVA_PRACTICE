package DAY_3;

import java.util.Scanner;

public class ARRAY_MAX {
    public static void acceptData(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            System.out.println(arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the 10 array elements: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        acceptData(arr);
        int max = findMax(arr);
        System.out.println("Maximum of 10 number is:"+max);
        scanner.close();
    }
}
