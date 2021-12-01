package DAY_6.matrix.demo.service;

import java.util.Scanner;


public class Array2DService {
    public static int[][] acceptData(){
        Scanner sc= new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length;j++){
                System.out.println("Enter Data for row "+i+" and column "+j+":");
                arr[i][j] =sc.nextInt();

            }
        }
        return arr;
    }
    public static int adddiagonal(int[][] arr){
        int sum=0;
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr.length;j++){
                if(i==j)
                    sum=sum+arr[i][j];
            }
        }
        return sum;
    }

    public static void displayData(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }


    public static boolean isprimeNumber(int num){
        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int addprimes(int[][] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            for (int j = 0; j < arr.length;j++){
                if(isprimeNumber(arr[i][j]))
                    sum=sum+arr[i][j];
            }
        }
        return sum;
    }

}
