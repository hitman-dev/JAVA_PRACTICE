package DAY_23.MultithreadingDemo.com.demo.test;


import DAY_23.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;
import DAY_23.MultithreadingDemo.com.demo.threads.FactorialThread;
import DAY_23.MultithreadingDemo.com.demo.threads.PrintTableThread;
import DAY_23.MultithreadingDemo.com.demo.threads.PrintTriangleThread;

public class TestUtility {

	public static void main(String[] args) {
		MyUtilityfunctions ob=new MyUtilityfunctions();
		FactorialThread fth=new FactorialThread(ob);
		PrintTableThread pth=new PrintTableThread(ob);
		PrintTriangleThread ptrth=new PrintTriangleThread(ob);
		fth.start();
		pth.start();
		ptrth.start();
		try {
			fth.join();
			pth.join();
			ptrth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("This is main method code");
		System.out.println("end of main");
		
		

	}

}
