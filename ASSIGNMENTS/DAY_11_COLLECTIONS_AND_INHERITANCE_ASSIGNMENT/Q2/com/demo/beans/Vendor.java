package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans;

import java.util.List;

public class Vendor extends Person {

    private long phoneNum;
    private List<String> products;

    public Vendor(String name, String email, long phoneNum, List<String> products) {
        super(name, email);
        this.phoneNum = phoneNum;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Vendor{" + super.toString() + ", phoneNum= " + phoneNum + ", products=" + products + "} ";
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
