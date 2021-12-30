package DAY_9_INHERITANCE_ASSIGNMENTS.Q1.com.demo.beans;

public class PERSON {
    protected int id;
    protected String name;
    static int counter;

    static {
        counter = 0;
    }

    public PERSON(String name) {
        counter++;
        this.id = counter;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + " id= " + id + ", name= " + name + '}';
    }
}
