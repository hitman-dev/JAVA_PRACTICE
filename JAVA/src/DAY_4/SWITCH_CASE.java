package DAY_4;

import java.util.Scanner;

public class SWITCH_CASE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        char ch=str.charAt(0);
        if(ch=='A') {
            System.out.println("Apple");
        }else  if(ch=='B') {
            System.out.println("Best");

        }else  if (ch=='C') {
            System.out.println("Charity");
        }
        //ch can be of type int , char, String
        switch(ch){
            case 'A':
                System.out.println("this is line 1");
                System.out.println("Apple");
                break;
            case 'b':
            case 'B':
                System.out.println("Best");
                break;
            case 'C':
                System.out.println("Charity");
                break;
            default:
                System.out.println("no matches");

        }



        System.out.println("enetr day of week");
        String day=sc.next();
        //day.equalsIgnoreCase("monday");
        if(day.equals("mndy")  || day.equals("Monday") || day.equals("Mon") ) {
            System.out.println("this is day  1");

        }else {
            System.out.println("This is wrong input");
        }


        switch(day) {
            case "mndy":
            case "Monday":
                System.out.println("this is day 1");
                break;
            case "Tuesday":
                System.out.println("this is day 2");
                break;
            default:
                System.out.println("this is default case");

        }

    }
}
