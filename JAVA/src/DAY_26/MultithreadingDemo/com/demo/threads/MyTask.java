package DAY_26.MultithreadingDemo.com.demo.threads;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer> {
	
	private int start,end;
	
	public MyTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public Integer call() {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println("id :"+Thread.currentThread().getId()+"--->start : "+start+"end : "+end);
		return sum;
	}

}
