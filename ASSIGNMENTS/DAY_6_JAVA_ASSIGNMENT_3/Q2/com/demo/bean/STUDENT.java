package DAY_6_JAVA_ASSIGNMENT_3.Q2.com.demo.bean;

public class STUDENT {
    private int sid;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    static int counter;
    static {
        counter=0;
    }


    public STUDENT( String name, int m1, int m2, int m3) {
        counter++;
        this.sid = counter;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    @Override
    public String toString() {
        return "Student ID: " + sid + "\n" + "Name: " + name + "\n" + "M1: " + m1 + "\n" + "M2: " + m2 + "\n" + "M3: " + m3;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }
}
