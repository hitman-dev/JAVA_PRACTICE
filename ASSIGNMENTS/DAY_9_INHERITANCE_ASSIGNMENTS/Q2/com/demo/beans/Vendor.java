package DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.beans;

import java.util.Date;

public class Vendor extends Employee {
    private long numOfEmp;
    private float amount;

    public Vendor(String name, long mobNum, String email, String department, String designation, Date joinDate, long numOfEmp, float amount) {
        super(name, mobNum, email, department, designation, joinDate);
        this.numOfEmp = numOfEmp;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Vendors{" +
                super.toString() +
                ", numOfEmp= " + numOfEmp +
                ", amount= " + amount +
                "} ";
    }

    @Override
    public float calculateSalary() {
        return (float) (amount + amount * 0.18);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public long getNumOfEmp() {
        return numOfEmp;
    }

    public void setNumOfEmp(long numOfEmp) {
        this.numOfEmp = numOfEmp;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
