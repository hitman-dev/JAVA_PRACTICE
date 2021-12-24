package DAY_23.MultithreadingDemo.com.demo.beans;


public class MyUtilityfunctions {
	public int factorial(int num) {
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
	
	public void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
	public void printTriangle(int num) {
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
