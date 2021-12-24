package DAY_26.ClonableDemo.com.demo.beans;

public class Student implements Cloneable{
	private int sid;
	private String name;
	public Student() {
		super();
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	

}
