package DAY_7_ARRAY_ASSIGNMENT.Q_Q2.com.demo.bean;

import java.util.Arrays;
import java.util.Date;

    public class FRIENDS {
        private int id;
        private String fName;
        private String lName;
        private String[] hobbies;
        private long mobNo;
        private String email;
        private Date bDate;
        private String address;

        static int counter;

        static {
            counter = 0;
        }

        public FRIENDS(String fName, String lName, String[] hobbies, long mobNo, String email, Date bDate,
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
                    + Arrays.toString(hobbies) + ", mobNo=" + mobNo + ", email='" + email + '\'' + ", DOB=" + bDate
                    + ", address='" + address + '\'';
        }

        public int getId() {
            return id;
        }

        public String getAddress() {
            return address;
        }

        public Date getbDate() {
            return bDate;
        }

        public long getMobNo() {
            return mobNo;
        }

        public String getEmail() {
            return email;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public String[] getHobbies() {
            return hobbies;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setbDate(Date bDate) {
            this.bDate = bDate;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setHobbies(String[] hobbies) {
            this.hobbies = hobbies;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public void setMobNo(long mobNo) {
            this.mobNo = mobNo;
        }
    }
