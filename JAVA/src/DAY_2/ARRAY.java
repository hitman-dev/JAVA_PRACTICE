package DAY_2;

import java.util.Scanner;

public class ARRAY {
    public static void acceptData(int[] arr) {
        Scanner sc=new Scanner(System.in);
        //accept data
        for(int i=0;i<arr.length;i++) {
            System.out.println("enter data");
            arr[i]=sc.nextInt();

        }

    }
    public static void displayData(int[] arr) {
        ///display array
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static int changeNum(int num) {
        num=num+10;
        System.out.println("inside function"+num);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int[] a=arr;
        ARRAY.acceptData(arr);  //call by reference
        ARRAY.displayData(arr);
        System.out.println("enetr number");
        int num=sc.nextInt();   ///7
        int x=num;
        int n=changeNum(num); //call by value
        System.out.println("original num: "+num);
        System.out.println("returned value:"+n);
        sc.close();

    }

}
