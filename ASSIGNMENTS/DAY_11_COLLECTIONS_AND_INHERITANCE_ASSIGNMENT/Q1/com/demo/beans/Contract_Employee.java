package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q1.com.demo.beans;

import java.util.Date;

public class Contract_Employee extends Employee {
    private float hoursWorked;
    private float perHourRate;

    public Contract_Employee(String name, long mobNum, String email, String department, String designation, Date joinDate, float hoursWorked, float perHourRate) {
        super(name, mobNum, email, department, designation, joinDate);
        this.hoursWorked = hoursWorked;
        this.perHourRate = perHourRate;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                super.toString() +
                ", hoursWorked= " + hoursWorked +
                ", perHourRate= " + perHourRate +
                "} ";
    }

    @Override
    public float calculateSalary() {
        return hoursWorked*perHourRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPerHourRate() {
        return perHourRate;
    }

    public void setPerHourRate(float perHourRate) {
        this.perHourRate = perHourRate;
    }
}
