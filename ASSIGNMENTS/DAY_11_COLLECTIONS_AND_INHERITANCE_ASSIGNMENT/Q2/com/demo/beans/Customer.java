package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans;

public abstract class Customer extends Person{
    private String creditClass;
    private float discount;
    private String plan;

    public Customer(String name, String email, String creditClass, float discount, String plan) {
        super(name, email);
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+ " creditClass= " + creditClass + ", discount= " + discount + ", plan= " + plan + "} "  ;
    }

    public String getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(String creditClass) {
        this.creditClass = creditClass;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
