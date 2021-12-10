package DAY_18.EXCEPTION_DEMO.com.demo.test;

public class TestException {
    public static int divide(int a,int b) {
    	try {
    	int c=a/b;
    	return c;
    	}catch(ArithmeticException e) {
    		System.out.println(e.getMessage());
    		throw e;
    	}
    	//return 0;
    	
    }
	public static void main(String[] args) {
		int[] arr= {12,3,4,34,56};
		String s=null;
		try {
			int a=5;
			int b=0;
			int c=divide(a,b);
			//open files, sockets, database connctivity
			for(int i=0;i<arr.length;i++) {
			      System.out.println(i+"--->"+arr[i]);
		     }
			System.out.println(s+"--->"+s.length());
			System.out.println("after printing string");
			
		}catch(ArrayIndexOutOfBoundsException|ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("error occured");
			//e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("pls enter string");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			///closing of database connection,closing of files, or sockets
			System.out.println("in finally block");
		}
	}

}
