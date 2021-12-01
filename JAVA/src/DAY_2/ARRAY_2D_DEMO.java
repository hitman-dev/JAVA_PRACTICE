package DAY_2;

import java.util.Scanner;

public class ARRAY_2D_DEMO {
    public static void acceptData(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter data " + i + "-->" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void displayData(int[][] arr) {
        System.out.println("Your array is: ");
        /*
         * System.out.println(Arrays.deepToString(arr));
         * Arrays.stream(arr).forEach(System.out::println);
         */
        for (int[] row : arr) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int[][] arr1, int[][] arr) {
        System.out.println("Sum of arr and arr1: ");
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        return arr2;
    }

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr) {
        System.out.println("Multiplication of arr and arr1: ");
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr[i][j] * arr1[i][j];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        acceptData(arr);
        displayData(arr);

        // accept data, display matrix, add arr1, arr2
        int[][] arr1 = new int[3][3];
        acceptData(arr1);
        displayData(arr1);
        int[][] arr2 = addMatrix(arr1, arr);
        displayData(arr2);

        // multiply arr and arr1;
        int[][] arr3 = multiplyMatrix(arr1, arr);
        displayData(arr3);

        scanner.close();
    }
}
