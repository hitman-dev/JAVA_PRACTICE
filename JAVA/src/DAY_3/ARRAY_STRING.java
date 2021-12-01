package DAY_3;

import java.util.Scanner;

public class ARRAY_STRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int num = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        sc.nextLine();
        System.out.println("Enter new line");
        String s11 = sc.nextLine();
        System.out.println(s1 + "," + s2 + "," + s3);
        System.out.println(s11);
        System.out.println("Hello success");
        System.err.println("Error message");
        sc.close();
    }
}