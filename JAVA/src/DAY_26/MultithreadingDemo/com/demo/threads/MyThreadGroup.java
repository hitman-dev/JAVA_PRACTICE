package DAY_26.MultithreadingDemo.com.demo.threads;

public class MyThreadGroup implements Runnable{
	
	public void run() {
		for(int i=0;i<2000;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getId());
	}

}
