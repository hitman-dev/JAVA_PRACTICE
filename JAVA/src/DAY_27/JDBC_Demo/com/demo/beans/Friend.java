package DAY_27.JDBC_Demo.com.demo.beans;

import java.time.LocalDate;
import java.util.List;

public class Friend {
	private String name;
	private String mobile,addr;
	private LocalDate bdate;
	List<String> hobbies;
	public Friend() {
		super();
	}
	public Friend(String name, String mobile, String addr, LocalDate bdate, List<String> hobbies) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.addr = addr;
		this.bdate = bdate;
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", mobile=" + mobile + ", addr=" + addr + ", bdate=" + bdate + ", hobbies="
				+ hobbies + "]";
	}

}
