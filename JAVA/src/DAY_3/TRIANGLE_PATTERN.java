package DAY_3;

import java.util.Scanner;

public class TRIANGLE_PATTERN {
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
