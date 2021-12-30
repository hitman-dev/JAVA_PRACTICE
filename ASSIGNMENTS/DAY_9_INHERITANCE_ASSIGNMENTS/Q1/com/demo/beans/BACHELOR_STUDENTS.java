package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans;

public class BACHELOR_STUDENTS extends STUDENTS {
    private String internshipCompany;
    private String spSubject;
    private float marksSpSubject;

    public BACHELOR_STUDENTS(String name, String degree, float m1, float m2, float m3, String internshipCompany, String spSubject, float marksSpSubject) {
        super(name, degree, m1, m2, m3);
        this.internshipCompany = internshipCompany;
        this.spSubject = spSubject;
        this.marksSpSubject = marksSpSubject;
    }

    @Override
    public String toString() {
        return "BachelorStudent{" + super.toString()+ ", internshipCompany= " + internshipCompany + ", spSubject= " + spSubject +
                ", marksSpSubject= " + marksSpSubject + "} ";
    }
    public float calculatePercentage(){
        return ((m1+m2+m3+marksSpSubject)/4);
    }
}
