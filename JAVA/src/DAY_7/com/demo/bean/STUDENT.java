package DAY_7.com.demo.bean;

public class STUDENT {
	static int cnt;
	static {
		cnt=10;
	}
	
	private int sid;  //read only
	private String sname;
	private String address;
	//default constructor
	public STUDENT() {
		System.out.println("default constructor called");
		cnt++;
		sid=cnt; 
		sname=null;
		address=null;
	}
	//parammetrized consructor
	//1 implicit this    3 will explicit
	public STUDENT(String sname, String address) {
		System.out.println("parametrised constructor called");
		cnt++;
		this.sid=cnt;
		this.sname=sname;
		this.address =address;
	}
	
	/*public void setSid(int id) {
		this.sid=id;
	}*/
	public void setSname(String nm) {
		this.sname=nm;
	}
	public void setaddress(String addr) {
		this.address=addr;
	}
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getAddress() {
		return address;
	}
	/*public void display() {
		System.out.println("Student id :"+this.sid);
		System.out.println("Student name : "+sname);
        System.out.println("Address :"+address);		
	}*/
	
	//@Override
	public String toString() {
		return "Student id : "+sid+"\n Name: "+sname+"\nAddress : "+address;
		
	}
	
	
	

}
