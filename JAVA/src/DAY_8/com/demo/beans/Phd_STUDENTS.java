package DAY_8.com.demo.beans;

public class Phd_STUDENTS extends STUDENTS {
	private String thesisname;
	private float thmarks;
	private String guide;
	public Phd_STUDENTS() {
		super();
	}

	public Phd_STUDENTS(int id,String nm,String degree, float m1, float m2, float m3,String thesisname, float thmarks, String guide) {
		super(id,nm,degree,m1,m2,m3);
		this.thesisname = thesisname;
		this.thmarks = thmarks;
		this.guide = guide;
	}

	public String getThesisname() {
		return thesisname;
	}

	public void setThesisname(String thesisname) {
		this.thesisname = thesisname;
	}

	public float getThmarks() {
		return thmarks;
	}

	public void setThmarks(float thmarks) {
		this.thmarks = thmarks;
	}

	public String getGuide() {
		return guide;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}
	public float calculatePercentage() {
		return ((m1+m2+m3)/3)*0.10f+thmarks*0.90f;
	}
	public void  m1() {
		System.out.println("in m1 method");
	}
	@Override
	public String toString() {
		return super.toString()+"PhdStudent [thesisname=" + thesisname + ", thmarks=" + thmarks + ", guide=" + guide + "]";
	}





}
