package DAY_17.NESTED_CLASS_DEMO.com.demo.interfaces;
import DAY_17.NESTED_CLASS_DEMO.com.demo.beans.Person;


@FunctionalInterface
public interface MyCompare<T,F> {
	F testcompare(T a,T b); 
	default void m2() {
		System.out.println("in default method");
	}
	
}

/*@FunctionalInterface
public interface MyCompare1 {
	int compare(String a,String b); 
	default void m2() {
		System.out.println("in default method");
	}
	
}*/

/*class MyClass implements MyCompare{
	
	public int compare(int a,int b) {
		return a-b;
	}
} */

//class TestMyClass{
//	public static void main() {
//		MyClass ob=new MyClass();
//		ob.compare(23,45);
//
//		MyCompare<Integer> ob1=new MyCompare() {
//			public int compare(Integer a,Integer b) {
//				return a-b;
//			}
//		};
//
//		ob1.compare(23,45);
//
//
//		MyCompare<Integer,Integer> ob2=(a,b)->a-b;
//		System.out.println(ob2.testcompare(23,56));
//
//		MyCompare<String,String> ob3=(a,b)->{int n=a.compareTo(b);
//		                                     return  n<0? a: b;
//
//		                                    };
//		System.out.println(ob3.testcompare("hello","welcome"));
//
//		MyCompare<Person,Integer> ob4=(a, b)-> a.getId() - b.getId();
//
//		ob4.testcompare(new Person(123,"sdjks","3333","kjsdfhjkh@skdh"),new Person(234,"Rjasi","333","sdhfjh@hsdjk"));
//
//	}
//}