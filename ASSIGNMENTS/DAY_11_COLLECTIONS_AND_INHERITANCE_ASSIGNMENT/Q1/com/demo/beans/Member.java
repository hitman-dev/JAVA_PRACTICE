package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q1.com.demo.beans;

public class Member extends Person {

    private String membership;
    private long amountPaid;

    public Member(String name, long mobNum, String email, String membership, long amountPaid) {
        super(name, mobNum, email);
        this.membership = membership;
        this.amountPaid = amountPaid;
    }

    @Override
    public String toString() {
        return "Members{" +
                super.toString() +
                ", membership= " + membership +
                ", amountPaid= " + amountPaid + "} ";
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public long getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(long amountPaid) {
        this.amountPaid = amountPaid;
    }
}
