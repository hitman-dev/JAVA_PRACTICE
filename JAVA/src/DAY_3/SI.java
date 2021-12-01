package DAY_3;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        double p = sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double r = sc.nextDouble();
        System.out.println("Enter years:");
        int n = sc.nextInt();

        System.out.println("Simple Interest on " +p+ " for "+n+" with rate of interest "+r+" is " +(p*r*n)/100);
    }

}
