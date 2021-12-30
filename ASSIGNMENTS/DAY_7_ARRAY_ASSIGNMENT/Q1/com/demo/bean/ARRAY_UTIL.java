package DAY_7_ARRAY_ASSIGNMENT.Q1.com.demo.bean;
import java.util.Scanner;


public class ARRAY_UTIL {
    public static void acceptData(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
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
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int j: arr){
            if (j<=min){
                min = j;
            }
        }
        return min;
    }
    public static void main(String[] args) {

    }
}
