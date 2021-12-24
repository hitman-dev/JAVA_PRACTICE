package DAY_25.ReflectionDemo.com.demo.beans;

public class MyClass {
     private int id;
     private String name;
	public MyClass() {
		super();
	}
	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void m1() {
		System.out.println("in m1 method");
	}
	public void m2(int i) {
		System.out.println("in m2 method"+i);
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
     
}
