package DAY_24.MultithreadingDemo.com.demo.threads;
import DAY_24.MultithreadingDemo.com.demo.beans.Storage;


public class MyConsumer extends Thread{
	private Storage s;
	
	
	public MyConsumer(Storage s) {
		super();
		this.s = s;
	}


	public void run() {
		for(int i=1;i<=10;i++) {
			s.get();
		}
	}

}
