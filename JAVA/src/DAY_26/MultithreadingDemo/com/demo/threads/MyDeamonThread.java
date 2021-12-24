package DAY_26.MultithreadingDemo.com.demo.threads;

public class MyDeamonThread extends Thread{
      public void run() {
    	  if(Thread.currentThread().isDaemon()) {
    		   System.out.println("It is a demon thread");
    	  }
    	  else {
    		  System.out.println("It is user thread");
    	  }
      }
}
