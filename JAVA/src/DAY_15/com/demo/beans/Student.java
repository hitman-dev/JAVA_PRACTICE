package DAY_15.com.demo.beans;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Student implements Comparable<Student> {
	
	private int sid;  //read only
	private String sname;
	private String address;
	private LocalDate bdate;
	public Student() {
		super();
	}
	public Student(int id) {
		this.sid=id;
		sname=null;
		address=null;
		bdate=null;
	}
	public Student(int sid, String sname, String address, LocalDate bdate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.bdate = bdate;
	}
	/*public int hashCode() {
		System.out.println("student hashcode called"+this.sid);
		return sid;
	}
	
	@Override
	public boolean equals(Object s) {
		System.out.println("in student equals methods");
		return this.sid==((Student)s).sid;
	} */
	////implicit this   ob
	/*public boolean equals(Object ob) {
		System.out.println("in equals of student :"+this.sid+"----->"+((Student)ob).sid);
		return this.sid==((Student)ob).sid;
	}*/
	
	
	public int getSid() {
		return sid;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sid != other.sid)
			return false;
		return true;
	}*/
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", bdate=" + bdate + "]";
	}
	
	public int compareTo(Student s1) {
		System.out.println("in compareTo method of comparable "+this.sid+"----->"+s1.sid);
		return this.sid-s1.sid;
		/*if (this.sid<s1.sid)
			return -1;
		else
			if(this.sid==s1.sid) 
				//return  this.sname.compareTo(s1.sname);
				return 0;
			else
				return 1;*/
		//return this.sname.compareTo(s1.sname);
		
	}
	

}
