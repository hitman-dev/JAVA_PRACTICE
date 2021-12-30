package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q1.com.demo.beans;

import java.util.Date;

public abstract class Employee extends Person {

    protected String department;
    protected String designation;
    protected Date joinDate;

    public Employee(String name, long mobNum, String email, String department, String designation, Date joinDate) {
        super(name, mobNum, email);
        this.department = department;
        this.designation = designation;
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", department= " + department +
                ", designation= " + designation +
                ", joinDate= " + joinDate +
                "} ";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public abstract float calculateSalary();
}
