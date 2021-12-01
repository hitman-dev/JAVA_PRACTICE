package DAY_4;

import java.util.Scanner;

public class FOR_TABLE {
    public static void printTable(int num) {
        for(int i=1;i<=10;i++) {
            System.out.println(i+"*"+num+"="+(i*num));
            //System.out.format("%d * %d = %d\n",i,num,(i*num));
            //System.out.printf("%d * %d = %d\n",i,num,(i*num));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();  //5
        printTable(num);


    }
}
