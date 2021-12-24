package DAY_24.MultithreadingDemo.com.demo.test;
import DAY_24.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;
import DAY_24.MultithreadingDemo.com.demo.threads.FactorialThread;
import DAY_24.MultithreadingDemo.com.demo.threads.PrintTableThread;
import DAY_24.MultithreadingDemo.com.demo.threads.PrintTriangleThread;

public class TestUtility {

	public static void main(String[] args) {
		MyUtilityfunctions ob=new MyUtilityfunctions();
		MyUtilityfunctions ob1=new MyUtilityfunctions();
		MyUtilityfunctions ob3=new MyUtilityfunctions();
		FactorialThread fth=new FactorialThread(ob);
		PrintTableThread pth=new PrintTableThread(ob1);
		Thread th=new Thread(pth);
		th.start();
		PrintTriangleThread ptrth=new PrintTriangleThread(ob3);
		//fth.setPriority(Thread.MAX_PRIORITY);
		//fth.setDaemon(true);
		fth.start();
		
		ptrth.start();
		
		try {
			fth.join(300);
			th.join();
			ptrth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ptrth.start();

		System.out.println("This is main method code");
		System.out.println("end of main");
		
		

	}

}
