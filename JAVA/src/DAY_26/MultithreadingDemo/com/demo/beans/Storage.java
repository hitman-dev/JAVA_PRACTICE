package DAY_26.MultithreadingDemo.com.demo.beans;

public class Storage {
	private int n;
	private boolean valueFlag;
	
	public Storage() {
		super();
		valueFlag=false;
	}

	synchronized public void put(int n) {
		if(valueFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("Put :"+n);
		valueFlag=true;
		notify();
	}
	
	synchronized public void get() {
		if(!valueFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("got : "+n);
		valueFlag=false;
		notify();
	}

}
