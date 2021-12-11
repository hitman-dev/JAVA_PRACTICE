package DAY_19.com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
    public static int divide(int a,int b) {
    	try {
    	   int c=a/b;     // ( throw new ArithmeticException("/zero error"))
    	   return c;
    	}catch(ArithmeticException e) {
    		System.out.println(e.getMessage());
    		throw e;
    	}
    	//return 0;
    	
    }
	public static void main(String[] args) {
		int[] arr= {12,3,4,34,56};
		String s="Welcome";
		Scanner sc=new Scanner(System.in);
		int i;
		for( i=0;i<3;i++) {
			try {
				System.out.println("enter a");
				int a=sc.nextInt();
				System.out.println("enter b");
				int b=sc.nextInt();
				int c=divide(a,b);
				//open files, sockets, database connctivity
				for(int j=0;j<arr.length;j++) {
				      System.out.println(j+"--->"+arr[j]);
			     }
				System.out.println(s+"--->"+s.length());
				System.out.println("after printing string");
				break;
			}catch(ArrayIndexOutOfBoundsException|ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("error occured");
				//e.printStackTrace();
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("pls enter string");
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("pls enterr number");
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
				
			}finally {
				///closing of database connection,closing of files, or sockets
				System.out.println("in finally block");
				
			}
		}
		if(i>=3) {
			System.exit(0);
		}
		System.out.println("reached to end of main");
	}

}
