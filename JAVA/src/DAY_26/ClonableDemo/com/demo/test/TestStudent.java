package DAY_26.ClonableDemo.com.demo.test;
import DAY_26.ClonableDemo.com.demo.beans.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student(100,"Rajan");
		try {
			Student s2=(Student) s.clone();
			System.out.println(s2);
			System.out.println(s);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
