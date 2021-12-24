package DAY_23.MultithreadingDemo.com.demo.threads;
import DAY_23.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;



public class FactorialThread extends Thread{
	private MyUtilityfunctions ob;
	public FactorialThread(MyUtilityfunctions ob) {
		super();
		this.ob = ob;
	}
	public void run() {
		int ans=ob.factorial(5);
		System.out.println("Factorial :"+ans);
    }
	
	
}
