package DAY_8.com.demo.beans;

public class BACHELOR_STUDENTS extends STUDENTS {
    private String interncname;
    private String spsub;
    float spsubmks;
    public BACHELOR_STUDENTS() {
        super();
        System.out.println("in bachelor default constructor");
    }

    public BACHELOR_STUDENTS(int id, String nm, String degree, float m1, float m2, float m3, String interncname, String spsub, float spsubmks) {
        super(id,nm,degree,m1,m2,m3);
        this.interncname = interncname;
        this.spsub = spsub;
        this.spsubmks = spsubmks;
    }

    public float getSpsubmks() {
        return spsubmks;
    }

    public void setSpsubmks(float spsubmks) {
        this.spsubmks = spsubmks;
    }

    public String getInterncname() {
        return interncname;
    }
    public void setInterncname(String interncname) {
        this.interncname = interncname;
    }
    public String getSpsub() {
        return spsub;
    }
    public void setSpsub(String spsub) {
        this.spsub = spsub;
    }

    public float calculatePercentage() {
        return (m1+m2+m3+spsubmks)/4;
    }
    public void  m2() {
        System.out.println("in m2 method");
    }
    @Override
    public String toString() {
        return super.toString()+"BachleorStudent [interncname=" + interncname + ", spsub=" + spsub + ", spsubmks=" + spsubmks + "]";
    }



}

