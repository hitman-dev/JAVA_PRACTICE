package DAY_25.ReflectionDemo.com.demo.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import DAY_25.ReflectionDemo.com.demo.beans.MyClass;


public class TestReflection {

	public static void main(String[] args) {
		//Class.forName("MyClass");
		MyClass ob=new MyClass(12,"Rajan");
		Class c=ob.getClass();
		///to get name of the class
		System.out.println(c.getName());
		Method[] marr=c.getMethods();
		for(Method m:marr) {
			System.out.println(m.getName());
		}
		
		Constructor[] carr=c.getConstructors();
		for(Constructor c1:carr) {
			System.out.println("constructor name :"+c1.getName());
			System.out.println("parameter count: "+c1.getParameterCount());
		}
		//ob.m2(12);
		try {
			Method m=c.getDeclaredMethod("m2",int.class);
			try {
				m.invoke(ob,34);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//getList of all member fields
		Field[] farr=c.getDeclaredFields();
		System.out.println("length :"+farr.length);
		for(Field f:farr) {
			System.out.println("Name :" +f.getName());
			System.out.println("type : "+f.getType().getName());
		}
		//make private members accessible
		farr[0].setAccessible(true);
		farr[1].setAccessible(true);
		
		//change the value of private members
		try {
			farr[0].set(ob,23);
			farr[1].set(ob,"Kedar");
			System.out.println(ob);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
