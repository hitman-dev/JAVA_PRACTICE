package DAY_27_JDBC_ASSIGNMENT.Q2.com.demo.beans;

public class User {
    private String username;
    private String address;
    private long mobileno;
    private String email;

    public User(String username, String address, long mobileno, String email) {
        this.username = username;
        this.address = address;
        this.mobileno = mobileno;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Server{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
