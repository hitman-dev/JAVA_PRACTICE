package DAY_13.COLLECTION_CLASS_DEMO.com.demo.test;
import java.util.List;
import java.util.Vector;




public class VectorDemo {
	public void f1(List<Integer> x){
		
		
	}
	public static void main(String[] args) {
		List<Integer> ob=new Vector<>(20);  ///generic classes
		ob.add(20);  //Integer
		ob.add(210); 
		ob.add(50);
		ob.add(20); 
		//ob.add(":asd");   //String
		System.out.println(ob.size());
		//System.out.println(ob.capacity());
		for(int i=10;i<20;i++) {
			ob.add(i);
		}
		System.out.println(ob);
		System.out.println(ob.size());
		//System.out.println(ob.capacity());
		for(int i=111;i<120;i++) {
			ob.add(i);
		}
		System.out.println(ob);
		System.out.println(ob.size());
		//System.out.println(ob.capacity());
	}

}
