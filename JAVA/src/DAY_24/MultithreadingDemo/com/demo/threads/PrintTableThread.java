package DAY_24.MultithreadingDemo.com.demo.threads;
import DAY_24.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;


public class PrintTableThread implements Runnable{
	private MyUtilityfunctions ob;
	public PrintTableThread(MyUtilityfunctions ob) {
		super();
		this.ob = ob;
	}
	public void run() {
		
		ob.printTable(7);
	}

}
