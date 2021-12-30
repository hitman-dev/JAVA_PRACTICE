package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans;

public class Person {

    private int pid;
    private String pname;
    private String email;
    static int counter;
    static {
        counter = 0;
    }

    public Person( String pname, String email) {
        counter++;
        this.pid = counter;
        this.pname = pname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +" id= " + pid + ", name= " + pname + ", email=" + email +'}';
    }

    public int getId() {
        return pid;
    }

    public void setId(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
