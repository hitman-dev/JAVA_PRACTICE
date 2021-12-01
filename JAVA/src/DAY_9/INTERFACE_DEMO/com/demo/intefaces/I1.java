package DAY_9.INTERFACE_DEMO.com.demo.intefaces;

public interface I1 {
	void m1();
	void m2();
	default void m4() {
		System.out.println("in I1M4");
	}
	default void m3() {
		System.out.println("in I1 m3 method");
	}
	
}
