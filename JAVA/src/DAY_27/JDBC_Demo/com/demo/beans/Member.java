package DAY_27.JDBC_Demo.com.demo.beans;

import java.util.Date;

public class Member {
	private String member_id,member_name,city,membership_status;
	private Date date_register,date_expire;
	public Member() {
		super();
	}
	public Member(String member_id, String member_name, String city, String membership_status, Date date_register,
			Date date_expire) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.city = city;
		this.membership_status = membership_status;
		this.date_register = date_register;
		this.date_expire = date_expire;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMembership_status() {
		return membership_status;
	}
	public void setMembership_status(String membership_status) {
		this.membership_status = membership_status;
	}
	public Date getDate_register() {
		return date_register;
	}
	public void setDate_register(Date date_register) {
		this.date_register = date_register;
	}
	public Date getDate_expire() {
		return date_expire;
	}
	public void setDate_expire(Date date_expire) {
		this.date_expire = date_expire;
	}
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_name=" + member_name + ", city=" + city
				+ ", membership_status=" + membership_status + ", date_register=" + date_register + ", date_expire="
				+ date_expire + "]";
	}
	

}
