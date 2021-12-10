package DAY_17.NESTED_CLASS_DEMO.com.demo.beans;

public  class Person {   ///by default Object
	private int id;
	private String name,mobile,email;
	
	
	
	public Person() {
		System.out.println("In Person default constructor");
		this.id=0;
		this.name=null;
		this.mobile=null;
		this.email=null;
	}
	
	public Person(int id,String name,String mob,String email) {
		System.out.println("In Person parametrised constructor");
		this.id=id;
		this.name=name;
		this.mobile=mob;
		this.email=email;
	}
	public Person(int id) {
		this.id=id;
		this.name=null;
		this.mobile=null;
		this.email=null;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String nm) {
		this.name=nm;
	}
	public void setMobile(String m) {
		this.mobile=m;
	}
	public void setEmail(String em) {
		this.email=em;
	}
	
	public int hashCode() {
		System.out.println("in hashcode method: "+this.id);
		return id;
	}
	            //// 1 implicit--->this  1 explicit
	public boolean equals(Object ob) {
		System.out.println("equals person called "+this.id+"-----"+((Person)ob).id);
		if(this.id==((Person)ob).id) {
			return true;
		}
		return false;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String getEmail() {
		return this.email;
	}
	public void method1() {
		System.out.println("In person method1");
	}
	
	
	
	public String toString() {
		//System.out.println("In Person toString");
		return "Id : "+this.id+"\nName : "+this .name+"\nMobile : "+this.mobile+"\nEmail: " +this.email;
	}
	
	
}
