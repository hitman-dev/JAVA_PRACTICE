package DAY_17.NESTED_CLASS_DEMO.com.demo.model;

public class OuterClass {
	private int i;
	static int si;
	private static int psi;
	public static class NestedClass{
		public void method() {
			si=23;
			
			System.out.println("in nested class method");
			System.out.println("si : "+si+"psi :"+psi);
			
		}
	}

}
