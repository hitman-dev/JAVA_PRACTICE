package DAY_16_MAP_ASSIGNMENT.Q2.com.demo.beans;

import java.util.Date;

public class Student {
    private int studentId;
    private String studentName;
    private Date bDate;
    private String degree;
    private float marks;

    public Student(int studentId, String studentName, Date bDate, String degree, float marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.bDate = bDate;
        this.degree = degree;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId= " + studentId +
                ", studentName= " + studentName +
                ", bDate= " + bDate +
                ", degree= " + degree +
                ", marks= " + marks +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
