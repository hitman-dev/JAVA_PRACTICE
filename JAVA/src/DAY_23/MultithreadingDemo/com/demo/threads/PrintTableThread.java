package DAY_23.MultithreadingDemo.com.demo.threads;

import DAY_23.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;


public class PrintTableThread extends Thread{
	private MyUtilityfunctions ob;
	public PrintTableThread(MyUtilityfunctions ob) {
		super();
		this.ob = ob;
	}
	public void run() {
		
		ob.printTable(7);
	}

}
