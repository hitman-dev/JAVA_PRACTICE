package DAY_24.MultithreadingDemo.com.demo.beans;


public class MyUtilityfunctions extends DAY_23.MultithreadingDemo.com.demo.beans.MyUtilityfunctions {
	
	synchronized public int factorial(int num) {
		int f=1;
		for(int i=1;i<num;i++) {
			f=f*i;
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return f;
	}
	
	///it will lock ----> this object
	synchronized public void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	synchronized public void printTriangle(int num) {
		for(int i=1 ;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				try {
					Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
			}
			System.out.println();
		}
	}

}
