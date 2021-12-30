package DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.beans;

import java.util.Date;

public class Salaried_Employee extends Employee {

    private float basicSalary;

    public Salaried_Employee(String name, long mobNum, String email, String department, String designation, Date joinDate, float basicSalary) {
        super(name, mobNum, email, department, designation, joinDate);
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                "basicSalary=" + basicSalary +
                "} ";
    }

    @Override
    public float calculateSalary() {
        return (float) (basicSalary + basicSalary * 0.1 + basicSalary * 0.15 - basicSalary * 0.12);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }
}
