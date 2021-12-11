package DAY_19.com.demo.test;

import DAY_19.com.demo.exceptions.BlockSystemException;
import DAY_19.com.demo.service.AgeAcceptService;

public class TestCustomException {
	public static void main(String[] args) {
		AgeAcceptService ob=new AgeAcceptService();
		int age=ob.acceptAge();
		System.out.println(age);
		System.out.println("Reached to end of main");
		
		
	}

}
