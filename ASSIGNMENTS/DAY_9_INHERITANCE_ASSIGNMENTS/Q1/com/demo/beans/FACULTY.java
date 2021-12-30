package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans;

import java.util.Arrays;

public class FACULTY extends PERSON {
    private String spSub;
    private String[] skills;
    private float salary;

    public FACULTY(String name, String spSub, String[] skills, float salary) {
        super(name);
        this.spSub = spSub;
        this.skills = skills;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                super.toString() +
                ", spSub= " + spSub +
                ", skills= " + Arrays.toString(skills) +
                ", salary= " + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSpSub() {
        return spSub;
    }

    public void setSpSub(String spSub) {
        this.spSub = spSub;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateSalary() {
        return (float) (salary + salary * 0.10 + salary * 0.15 - salary * 0.08);
    }
}
