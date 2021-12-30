package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans;

import java.util.HashSet;

public class Company extends Customer {

    private static String rmName;
    private int creditLine;
    private int extensions;
    private HashSet<Long> numbers;

    public Company(String name, String email, String creditClass, float discount, String plan, String rmName, int creditLine, int extensions, HashSet<Long> numbers) {
        super(name, email, creditClass, discount, plan);
        Company.rmName = rmName;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Company{" + super.toString() + ", rmName= " + rmName + ", creditLine= " + creditLine + ", extensions= " + extensions + ", numbers= " + numbers + "} ";
    }

    public static String getRmName() {
        return rmName;
    }

    public void setRmName(String rmName) {
        Company.rmName = rmName;
    }

    public int getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(int creditLine) {
        this.creditLine = creditLine;
    }

    public int getExtensions() {
        return extensions;
    }

    public void setExtensions(int extensions) {
        this.extensions = extensions;
    }

    public HashSet<Long> getNumbers() {
        return numbers;
    }

    public void setNumbers(HashSet<Long> numbers) {
        this.numbers = numbers;
    }
}
