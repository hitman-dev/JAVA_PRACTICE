package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans;

public class Phd_STUDENTS extends STUDENTS {
    private String thesisName;
    private float thMarks;
    private String guide;

    public Phd_STUDENTS(String name, String degree, float m1, float m2, float m3, String thesisName, float thMarks, String guide){
        super(name,degree, m1,m2,m3);
        this.thesisName = thesisName;
        this.thMarks = thMarks;
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "PhdStudent{" + super.toString()+ ", thesisName= " + thesisName  + ", thesisMarks= " + thMarks  + ", guide= " + guide +" } ";
    }

    public float calculatePercentage(){
        return (float) (((m1+m2+m3)/3)*0.10+thMarks*0.90);
    }
}
