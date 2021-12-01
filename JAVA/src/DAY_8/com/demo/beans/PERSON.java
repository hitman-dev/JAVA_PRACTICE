package DAY_8.com.demo.beans;


public class PERSON {
	private int id;
	private String name;
	public PERSON() {
		//this(0,null);
		id=0;
		name=null;
		System.out.println("in person default constructor");
	}
	public PERSON(int id, String name) {
		System.out.println("in person parametrised constructor");
		this.id = id;
		this.name = name;
	}
	public  float calculatePercentage() {
		return 0.0f;
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
	@Override
	public String toString() {
		System.out.println("in person tostring method");
		return "Person [id=" + id + ", name=" + name + "]";
	}




}
