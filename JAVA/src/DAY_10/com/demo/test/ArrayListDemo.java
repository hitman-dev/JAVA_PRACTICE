package DAY_10.com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> ob=new ArrayList<>();
		ob.add(20);
		ob.add(20);
		ob.add(10);
		ob.add(1);
		System.out.println(ob);
		ob.add(1,100);
		System.out.println(ob);
		System.out.println(ob.get(3));
		System.out.println("position :" +ob.indexOf(100));
		System.out.println("position :" +ob.indexOf(200));
		System.out.println("to remove "+ob.remove(new Integer(20)));
		ob.removeIf(x->x>15);
		
	}

}
