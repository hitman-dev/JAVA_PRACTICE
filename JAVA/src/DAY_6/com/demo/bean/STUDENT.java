package DAY_6.com.demo.bean;

public class STUDENT {
    private int sid;
    private String sname;
    private String address;
    //default constructor
    public STUDENT() {
        System.out.println("default constructor called");
        sid=0;
        sname=null;
        address=null;
    }

    public STUDENT(int s,String sname,String address) {
        System.out.println("parametrised constructor called");
        this.sid=s;
        this.sname=sname;
        this.address =address;
    }

    public void setSid(int id) {
        this.sid=id;
    }
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
//	public void display() {
//		System.out.println("Student id :"+this.sid);
//		System.out.println("Student name : "+this.sname);
//        System.out.println("Address :"+address);
//	}

    //@Override
    public String toString() {
        return "Student id : "+sid+"\n Name: "+sname+"\nAddress : "+address;

    }





}
