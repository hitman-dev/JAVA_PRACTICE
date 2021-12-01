package DAY_10.com.demo.bean;
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
	public Student(int sid, String sname, String address, LocalDate bdate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.bdate = bdate;
	}

	public Student(int sid, String xxx, String dddd, Date date) {
	}

	public int getSid() {
		return sid;
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
