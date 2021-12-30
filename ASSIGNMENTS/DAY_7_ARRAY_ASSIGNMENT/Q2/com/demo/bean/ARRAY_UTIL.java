package DAY_7_ARRAY_ASSIGNMENT.Q2.com.demo.bean;

import java.util.Scanner;

public class ARRAY_UTIL {
    public static void acceptData(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean checkExist(int num, int[] arr) {
        for (int x : arr) {
            if (x == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
