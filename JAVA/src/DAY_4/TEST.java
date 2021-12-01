package DAY_4;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        for(int i=1; i<=num;i++) {
            if((i>=5) && (i<=7)) {
                continue;
            }
            System.out.println(i);
        }

    }


}
