package DAY_12.com.demo.bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Student {
	
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

    public Student(int sid, String xxx, String dddd, Date date) {
    }
    ////implicit this   ob
	/*public boolean equals(Object ob) {
		System.out.println("in equals of student :"+this.sid+"----->"+((Student)ob).sid);
		return this.sid==((Student)ob).sid;
	}*/
	
	
	public int getSid() {
		return sid;
	}
	
	@Override
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
	}
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
	

}
