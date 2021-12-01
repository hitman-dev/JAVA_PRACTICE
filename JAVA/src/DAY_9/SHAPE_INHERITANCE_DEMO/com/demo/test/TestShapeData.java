package DAY_9.SHAPE_INHERITANCE_DEMO.com.demo.test;
import java.util.Scanner;
import DAY_9.SHAPE_INHERITANCE_DEMO.com.demo.bean.Shape;
import DAY_9.SHAPE_INHERITANCE_DEMO.com.demo.bean.*;


public class TestShapeData {

	public static void main(String[] args) {
		Shape[] s=new Shape[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
				System.out.println("1. Triangle\n2. Circle\n 3. Rectangle\n 4.exit\n");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("enetr color");
					String c=sc.next();
					System.out.println("enter base");
					float b=sc.nextFloat();
					s[i]=new Triangle(c,b,3,5,6);
					break;
				case 2:
					s[i]=new Circle("yellow",5);
					break;
					
				
				}
		}
		int cntt=0,cntc=0,cntr=0;
		for(int i=0;i<s.length;i++) {
				if (s[i] instanceof Triangle) {
					((Triangle)s[i]).m1();
					cntt++;
				}else {
					cntc++;
				}
				
				
				System.out.println(s[i]);
				System.out.println(s[i].calculateArea());
		        System.out.println(s[i].calculatePerimeter());
	    }
		System.out.println("Triangle cnt : "+cntt);
		System.out.println("Circle cnt : "+cntc);
}

}
