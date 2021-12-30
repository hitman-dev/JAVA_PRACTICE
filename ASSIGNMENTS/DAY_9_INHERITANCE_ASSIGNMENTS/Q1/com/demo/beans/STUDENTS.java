package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans;

public abstract class STUDENTS extends PERSON {
    private String degree;
    protected float m1, m2, m3;

    public STUDENTS(String name, String degree, float m1, float m2, float m3){
        super(name);
        this.degree = degree;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public abstract float calculatePercentage();

    @Override
    public String toString() {
        return "Student{ " +
                super.toString()+ ", degree= " + degree  + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + '}';
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
}
