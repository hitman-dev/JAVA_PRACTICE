package DAY_18.JAVA_8_FEATURES.com.demo.beans;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	private String status;
	
	public enum Gender{MALE,FEMALE}
	
	public Person(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		status="Registered";
	}
	public boolean isMale() {
		return gender==Gender.MALE;
	}
	   
	///one implicit this
	public String getName() {
		return name;
	}
	//implicit this , explicit name
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	};
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", status=" + status + "]";
	}

}
