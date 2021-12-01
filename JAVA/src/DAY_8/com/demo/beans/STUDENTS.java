package DAY_8.com.demo.beans;


public class STUDENTS extends PERSON {
	private String degree;
	protected float m1,m2,m3;
	public STUDENTS() {
		this(0,null,null,0,0,0);
		/*degree=null;
		m1=0;
		m2=0;
		m3=0;*/
		System.out.println("in student default constructor");
	}
	public STUDENTS(int id, String nm, String degree, float m1, float m2, float m3) {
		super(id,nm);
		System.out.println("in student parametrised constructor");
		this.degree = degree;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}


	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public float getM1() {
		return m1;
	}
	public void setM1(float m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public float getM3() {
		return m3;
	}
	public void setM3(float m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [degree=" + degree + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}



}
