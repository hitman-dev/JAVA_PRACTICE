package DAY_26.MultithreadingDemo.com.demo.test;
import DAY_26.MultithreadingDemo.com.demo.threads.MyDeamonThread;


public class TestDeamonThread {

	public static void main(String[] args) {
		MyDeamonThread t1=new MyDeamonThread();
		MyDeamonThread t2=new MyDeamonThread();
		MyDeamonThread t3=new MyDeamonThread();
		t1.setDaemon(true); //this setting need to be done before you start the thread
		t1.start();
		t2.start();
		t3.start();

	}

}
