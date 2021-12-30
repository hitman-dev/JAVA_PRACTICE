package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans;

import java.util.Arrays;

public class Friend {
	private int id;
	private String fname;
	private String lname;
	private String mob;
	private String email;
	private String bdate;
	private String address;
	private String[] hobbies;
	private static int cnt;
	static {
		cnt=100;
	}
	public Friend() {
		this.id = cnt+1;
		this.fname = null;
		this.lname = null;
		this.mob = null;
		this.email = null;
		this.bdate = null;
		this.address = null;
		this.hobbies = null;
	}
	
	public Friend(String fname, String lname, String mob, String email, String bdate, String address,
			String[] hobbies) {
		super();
		this.id = cnt+1;
		this.fname = fname;
		this.lname = lname;
		this.mob = mob;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
		this.hobbies = hobbies;
		cnt++;
	}


	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getMob() {
		return mob;
	}

	public String getEmail() {
		return email;
	}

	public String getBdate() {
		return bdate;
	}

	public String getAddress() {
		return address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mob=" + mob + ", email=" + email
				+ ", bdate=" + bdate + ", address=" + address + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}


	
		
}
