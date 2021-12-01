package DAY_6.matrix.demo.test;

import DAY_6.matrix.demo.service.Array2DService;;

public class TestMatrix2DArray {
    public static void main(String[] args){
        int[][] arr= Array2DService.acceptData();
        Array2DService.displayData(arr);
        int sum=Array2DService.adddiagonal(arr);
        System.out.println("Sum of Diagonal elements is : "+sum);
        sum=Array2DService.addprimes(arr);
        System.out.println("Sum of prime elements is : "+sum);
    }
}
