package DAY_21_SERIALIZATION_ASSIGNMENT.com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
    private int studentId;
    private String studentName;
    private String degree;
    private String email;

    public Student(int studentId, String studentName, String degree, String email) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.degree = degree;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId= " + studentId +
                ", studentName= " + studentName +
                ", degree= " + degree +
                ", email= " + email +
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
