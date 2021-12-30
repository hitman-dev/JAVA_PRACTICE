package DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.beans;

public class Person {
    protected int id;
    protected String name;
    protected long mobNum;
    protected String email;
    static int counter;
    static {
        counter = 0;
    }

    public Person(String name, long mobNum, String email) {
        counter++;
        this.id = counter;
        this.name = name;
        this.mobNum = mobNum;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                " id= " + id +
                ", name= " + name +
                ", mobNum= " + mobNum +
                ", email= " + email + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobNum() {
        return mobNum;
    }

    public void setMobNum(long mobNum) {
        this.mobNum = mobNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }
}