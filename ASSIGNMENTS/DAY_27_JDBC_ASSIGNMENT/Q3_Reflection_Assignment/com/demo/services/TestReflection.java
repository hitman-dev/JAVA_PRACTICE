package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.services;
import DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans.Friend;
import DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans.MyClass;
import DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans.Rectangle;
import DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans.Student;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestReflection {

	public static void main(String[] args) {
		Class student = new Student().getClass();
		Class friend = new Friend().getClass();
		Class rectangle = new Rectangle().getClass();
		Class myclass = new MyClass().getClass();
		// get name of class
		System.out.println("-----name of the classes-----");
		System.out.println(student.getName());
		System.out.println(friend.getName());
		System.out.println(rectangle.getName());
		System.out.println(myclass.getName());
		
		//get name of method
		System.out.println("-----name of the methods-----");
		Method[] smeth = student.getMethods();
		System.out.println("student class--->");
		for(Method m:smeth) {
			System.out.println("name of method: "+m.getName()+",parameter count : "+m.getParameterCount());
			//System.out.println("parameter type & name-->");
			Parameter[] par =m.getParameters();
			for(int i=0;i<par.length;i++) {
				if(par[i]!=null) {
					System.out.println("parameter type & name: "+par[0]+",");
				}
				else
					break;
			}
			
		}
		Method[] fmeth = friend.getMethods();
		System.out.println("\nfriend class--->");
		for(Method m:fmeth) {
			System.out.println("name of method: "+m.getName()+",parameter count : "+m.getParameterCount());
			Parameter[] par =m.getParameters();
			for(int i=0;i<par.length;i++) {
				if(par[i]!=null) {
					System.out.println("parameter type & name: "+par[0]+",");
				}
				else
					break;
			}
		}
		Method[] cmeth = rectangle.getMethods();
		System.out.println("\nrectangle class--->");
		for(Method m:cmeth) {
			System.out.println("name of method: "+m.getName()+",parameter count : "+m.getParameterCount());
			Parameter[] par =m.getParameters();
			for(int i=0;i<par.length;i++) {
				if(par[i]!=null) {
					System.out.println("parameter type & name: "+par[0]+",");
				}
				else
					break;
			}
		}
		Method[] myclassmeth = myclass.getMethods();
		System.out.println("\nmyclass class--->");
		for(Method m:myclassmeth) {
			System.out.println("name of method: "+m.getName()+",parameter count : "+m.getParameterCount());
			Parameter[] par =m.getParameters();
			for(int i=0;i<par.length;i++) {
				if(par[i]!=null) {
					System.out.println("parameter type & name: "+par[0]+",");
				}
				else
					break;
			}
			if(m.getParameterCount()>=3) {
				try {
					m.invoke(myclass, 1,2,3,4);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
