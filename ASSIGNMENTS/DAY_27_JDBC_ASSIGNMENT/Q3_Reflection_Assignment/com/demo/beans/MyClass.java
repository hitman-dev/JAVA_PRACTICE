package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans;
//Adding 2 methods method 5 and method6 which accepts 4 parameters.
//If number of parameters to a method >= 3 then invoke that method.
public class MyClass {
	public static void method1(int i,int j){
		int ans = i+j;
		System.out.println("in method1--> result:"+ans);
	}
	public static void method2(int i,int j){
		int ans = i+j;
		System.out.println("in method2--> result:"+ans);
	}
	public static void method5(int i,int j,int k,int l){
		int ans = i+j+k+l;
		System.out.println("in method5--> result:"+ans);
	}
	public static void method6(int i,int j,int k,int l){
		int ans = i+j+k+l;
		System.out.println("in method6--> result:"+ans);
	}
}
