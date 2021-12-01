package DAY_5;

import java.util.Scanner;

public class SWITCH_CASE_REVIEW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color");
        String color = sc.nextLine();
        switch (color) {
            case "Red":
                System.out.println("Apple");
                break;
            case "Black":
                System.out.println("Black T-shirt");
                break;
            case "Yellow":
                System.out.println("Lemon");
                break;
            default:
                System.out.println("Unknown Color");

        }
    }
}
