package DAY_26.MultithreadingDemo.com.demo.test;
import DAY_26.MultithreadingDemo.com.demo.threads.MyThreadGroup;


public class TestThreadGroup {

	public static void main(String[] args) {
		ThreadGroup tg1=new ThreadGroup("group1");
		MyThreadGroup t1=new MyThreadGroup();
		Thread th1=new Thread(tg1,t1,"Thread1");
		Thread th2=new Thread(tg1,t1,"Thread2");
		Thread th3=new Thread(tg1,t1,"Thread3");
		th1.start();
		th2.start();
		th3.start();
		System.out.println(tg1.getName());
		tg1.list();
		System.out.println(tg1.activeCount());
		
	}

}
