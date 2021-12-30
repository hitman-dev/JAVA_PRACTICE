package DAY_6_JAVA_ASSIGNMENT_3.Q3.com.demo.bean;

import java.util.Arrays;

public class FRIENDS {
    private int id;
    private String fName;
    private String lName;
    private String[] hobbies;
    private long mobNo;
    private String email;
    private String bDate;
    private String address;

    static int counter;
    static {
        counter=0;
    }

    public FRIENDS( String fName, String lName, String[] hobbies, long mobNo, String email, String bDate,
                    String address) {
        counter++;
        this.id = counter;
        this.fName = fName;
        this.lName = lName;
        this.hobbies = hobbies;
        this.mobNo = mobNo;
        this.email = email;
        this.bDate = bDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "id=" + id + ", firstName='" + fName + '\'' + ", lastName='" + lName + '\'' + ", hobbies="
                + Arrays.toString(hobbies) + ", mobNo=" + mobNo + ", email='" + email + '\'' + ", bDate=" + bDate
                + ", address='" + address + '\'';
    }
}
