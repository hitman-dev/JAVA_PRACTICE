package DAY_4;

import java.util.Scanner;

public class WHILE_SUM {
    //Sum of digits of numbers
    public static int additionDigits(int num) {
        int sum=0;
        while(num!=0) {
            int digit=num%10;
            sum=sum+digit;
            num=(int)(num/10);
        }
        return sum;
    }

    public static void main(String[] args) {
        ///find addition of digits of a number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=additionDigits(num);
        System.out.println("Addition :"+sum);
    }

}
