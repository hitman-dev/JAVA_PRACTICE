package DAY_9.INTERFACE_DEMO.com.demo.beans;

import DAY_9.INTERFACE_DEMO.com.demo.intefaces.I1;
import DAY_9.INTERFACE_DEMO.com.demo.intefaces.I2;

public class MyClass extends MyParent implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("in m1");
		
	}

	@Override
	public void m2() {
		System.out.println("in m2");
		
	}

	@Override
	public int m21() {
		System.out.println("in m21");
		System.out.println(I2.i);
		return I2.i;
	}

	@Override
	public void m22() {
		System.out.println("in m22");
		
		
	}

	@Override
	public void m4() {
		I1.super.m4();
		I2.super.m4();
		System.out.println("in myclass m4");
	}

	
	

	
	

}
