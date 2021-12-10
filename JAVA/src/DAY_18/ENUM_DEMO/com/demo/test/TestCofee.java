package DAY_18.ENUM_DEMO.com.demo.test;
import java.util.Scanner;
import DAY_18.ENUM_DEMO.com.demo.enums.Cofee;


public class TestCofee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Large \nmedium \n small");
		String s=sc.next();
		//System.out.println("value : "+Cofee.valueOf(s));
		Cofee num=Cofee.valueOf(s);   //String converted into enum object
		switch(num) {
		case Large:
			System.out.println("large selected"+num.getSize()+"---->"+num.getPrice());
			break;
		case medium:
			System.out.println("medium selected"+num.getSize()+"---->"+num.getPrice());
			break;
		case small:
			System.out.println("small selected"+num.getSize()+"---->"+num.getPrice());
			break;
		}

	}

}
