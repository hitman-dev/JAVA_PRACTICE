package DAY_17.NESTED_CLASS_DEMO.com.demo.test;
import DAY_17.NESTED_CLASS_DEMO.com.demo.beans.Person;
import DAY_17.NESTED_CLASS_DEMO.com.demo.interfaces.MyCompare;


public class TestMyCompare{
	public static void main(String[] args) {
		/*MyClass ob=new MyClass();
		ob.compare(23,45);
		
		MyCompare<Integer> ob1=new MyCompare() {
			public int compare(Integer a,Integer b) {
				return a-b;
			}
		};
		
		ob1.compare(23,45);*/
		
		
		MyCompare<Integer,Integer> ob2=(a, b)-> a - b;
		System.out.println(ob2.testcompare(23,56));
		
		MyCompare<String,String> ob3=(a,b)->{int n=a.compareTo(b);
		                                     return  n<0? a: b;
		 
		                                    };
		System.out.println(ob3.testcompare("hello","welcome"));
		
		MyCompare<Person,Integer> ob4=(a, b)-> a.getId() - b.getId();
		
		System.out.println(ob4.testcompare(new Person(123,"sdjks","3333","kjsdfhjkh@skdh"),new Person(234,"Rjasi","333","sdhfjh@hsdjk")));		
		
	}
}
