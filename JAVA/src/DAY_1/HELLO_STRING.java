package DAY_1;

import java.util.Scanner;

public class HELLO_STRING {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your name");

        String username = myobj.nextLine();
        System.out.println("Hello "+ username + " how are you!!");
    }

}
