package DAY_9.INTERFACE_DEMO.com.demo.intefaces;

public interface I2 {
	int m21();
	void m22();
	int i=10;
	default void m4() {
		System.out.println("in I2 M4");
	}

}
