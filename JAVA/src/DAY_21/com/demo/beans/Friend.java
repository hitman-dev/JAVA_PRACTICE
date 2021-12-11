package DAY_21.com.demo.beans;

import java.io.Serializable;
//serializable is marker interface
public class Friend implements Serializable{
	private int id;
	private String name;
	//transient private String mobile;
	private String mobile;
	public Friend() {
		super();
	}
	
	public Friend(int id) {
		super();
		this.id = id;
		this.name=null;
		this.mobile=null;
	}

	public Friend(int id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	public boolean equals(Object ob) {
		return this.id==((Friend)ob).id;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	

}
