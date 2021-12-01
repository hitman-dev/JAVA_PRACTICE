package DAY_2;

import java.util.Scanner;

public class ARRAY_SQUARED {
    public static void acceptData(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
    }
    public static void displayData(int[] arr){
        for (int j : arr) {
            System.out.print(j*j+" ");
        }
        System.out.println(" <-These are the squared values");
    }

    public static void main(String[] args) {
        System.out.println("Enter the 10 array elements: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        ARRAY_SQUARED.acceptData(arr);
        ARRAY_SQUARED.displayData(arr);
    }
}
