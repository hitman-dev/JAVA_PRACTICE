package DAY_18.ENUM_DEMO.com.demo.beans;

public class Student {
	private int sid;
	private String sname;
	private double marks;
	private Grade result;
    public enum Grade{
    	Distinction,first,second, third;
    }
    
	public Student() {
		super();
	}
	public Student(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		
		Grade g;
		if(marks>=70) {
			 this.result=Grade.Distinction;
		}else {
			if(marks>=60) {
				 g=Grade.first;
			}
			else {
				 g=Grade.second;
			}
		}
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", result=" + result + "]";
	}
    
    
}
