package DAY_26.MultithreadingDemo.com.demo.threads;

import DAY_26.MultithreadingDemo.com.demo.beans.MyUtilityfunctions;


public class PrintTriangleThread extends Thread{
	private MyUtilityfunctions ob;
	public PrintTriangleThread(MyUtilityfunctions ob) {
		super();
		this.ob = ob;
	}
      public void run() {
    	  ob.printTriangle(5);
      }
	
}
