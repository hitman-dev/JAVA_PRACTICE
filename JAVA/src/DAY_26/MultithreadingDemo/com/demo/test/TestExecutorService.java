package DAY_26.MultithreadingDemo.com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import DAY_26.MultithreadingDemo.com.demo.threads.MyTask;


public class TestExecutorService {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		List<Future<Integer>> flist=new ArrayList<>();
		//ExecutorService es=Executors.newCachedThreadPool();
		for(int i=1;i<=91;i=i+10) {
			MyTask t1=new MyTask(i,i+9);
			Future<Integer> f=es.submit(t1);
			flist.add(f);
		}
		int sum=0;
		for(Future<Integer> f:flist) {
			try {
				sum=sum+f.get();
				
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("sum : "+sum);
		es.shutdown();
	}

}
