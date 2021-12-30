package DAY_7_ARRAY_ASSIGNMENT.Q1.com.demo.test;
import DAY_7_ARRAY_ASSIGNMENT.Q1.com.demo.bean.ARRAY_UTIL;


public class TEST_ARRAY_SUM {
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers separated by space: ");
        int[] arr = new int[10];
        ARRAY_UTIL.acceptData(arr);
        int max = ARRAY_UTIL.findMax(arr);
        int min = ARRAY_UTIL.findMin(arr);
        System.out.println("Sum of Max and minimum number: "+(max+min));
    }


}
