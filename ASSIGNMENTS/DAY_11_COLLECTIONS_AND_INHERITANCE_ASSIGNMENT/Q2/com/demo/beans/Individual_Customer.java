package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans;

public class Individual_Customer extends Customer{

    private long phoneNum;

    public Individual_Customer(String name, String email, String creditClass, float discount, String plan, long phoneNum) {
        super(name, email, creditClass, discount, plan);
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" + super.toString()+ ", phoneNum= " + phoneNum + "} " ;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
}