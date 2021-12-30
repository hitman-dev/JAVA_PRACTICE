package DAY_27_JDBC_ASSIGNMENT.Q3_Reflection_Assignment.com.demo.beans;


public class Student{
	private int sid;
	private String sname;
	private int m1;
	private int m2;
	private int m3;
	private float gpa;
	public Student()
	{
		sid=0;
		sname=null;
		m1=0;
		m2=0;
		m3=0;
		gpa=0;
	}
	public Student(int sid,String sname,int m1,int m2,int m3)
	{
		this.sid=sid;
		this.sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	    gpa=calculateGpa();
	}
	public void setSid(int id) 
	{
		this.sid=id;
	}
	public void setSname(String sname) 
	{
		this.sname=sname;
	}
	public void setM1(int m1) 
	{
		this.m1=m1;
	}
	public void setM2(int m2) 
	{
		this.m2=m2;
	}
	public void setM3(int m3) 
	{
		this.m3=m3;
	}
	public void setGpa(float gpa) 
	{
		this.gpa=gpa;
	}
	public int getSid()
	{
		return sid;
	}
	public String getSname()
	{
		return sname;
	}
	public int getM1()
	{
		return m1;
	}
	public int getM2()
	{
		return m2;
	}
	public int getM3()
	{
		return m3;
	}
	public float getGpa()
	{
		return gpa;
	}
	////1 implicit this
	public float calculateGpa() {
		return (1/3f)*this.m1+(1/2f)*this.m2+(1/4f)*this.m3;
		
	}
	public String toString()
	{
		return "Student id : "+this.sid+"\n Name : "+sname+"\n M1 : "+m1+"\n M2 : "+m2+"\n M3 : "+m3+"GPA :"+calculateGpa();
	}
}

	