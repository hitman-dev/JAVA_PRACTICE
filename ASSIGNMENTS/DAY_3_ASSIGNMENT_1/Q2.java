package DAY_3_ASSIGNMENT_1;

//2. Accept a number  n from user and display n lines of following triangle
//        *
//        **
//        ***
//
//        1
//        12
//        123
//        1234

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
         *   *
         *   **
         *   ***
         *   ****
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines");
        int num=sc.nextInt();
        for(int row=1;row<=num;row++) {
            for(int i=0;i<row;i++) {
                System.out.print("*");
            }
            System.out.println();
        }

		/*1
		  12
		  123
		  1234*/

        for(int row=1;row<=num;row++) {
            for(int i=1;i<=row;i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }


}
