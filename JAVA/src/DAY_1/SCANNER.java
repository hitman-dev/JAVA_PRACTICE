package DAY_1;

import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age<=18){
            System.out.println("Your age a teen");
        }
        else if (age<=50){
            System.out.println("Your age adult");
        }
        else {
            System.out.println("Your are a boomer");
        }
    }
}
