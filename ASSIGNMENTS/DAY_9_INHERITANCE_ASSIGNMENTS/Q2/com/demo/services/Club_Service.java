package DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.services;
import DAY_9_INHERITANCE_ASSIGNMENTS.Q2.com.demo.beans.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Club_Service {
    public static ArrayList<Employee> employeeList = new ArrayList<>();
    public static ArrayList<Member> memberList = new ArrayList<>();

    public static void dataset() {
        Salaried_Employee se1 = new Salaried_Employee("Striker", 929292929, "Striker@marvel.com", "football", "President", new Date(12 - 2 - 1997), 100000f);
        Salaried_Employee se2 = new Salaried_Employee("Wanda", 1542126541, "Wanda@marvel.com", "table tennis", "vice president", new Date(11 - 5 - 1998), 90000f);
        Salaried_Employee se3 = new Salaried_Employee("Natasha", 262151221, "Natasha@marvel.com", "cricket", "coordinator", new Date(10 - 3 - 1996), 90000f);
        Contract_Employee ce1 = new Contract_Employee("Happy", 939392929, "Happy@marvel.com", "football", "coordinator", new Date(10 - 3 - 1996), 40, 5000);
        Contract_Employee ce2 = new Contract_Employee("Mandarin", 522255462, "Mandarin@marvel.com", "cricket", "manager", new Date(8 - 7 - 1996), 35, 4500);
        Vendor v1 = new Vendor("Thor", 939583394, "thor@gmail.com", "cricket", "manager", new Date(8 - 1 - 1990), 200, 1020000f);
        Vendor v2 = new Vendor("Loki", 254125638, "loki@gmail.com", "table tennis", "coach", new Date(8 - 11 - 1995), 186, 1035410f);
        Member m1 = new Member("Jonny", 838392938, "jonny@gmail.com", "temporary", 20000);
        Member m2 = new Member("Thanos", 895632147, "thanos@gmail.com", "permanent", 25000);
        Member m3 = new Member("Hacker", 895632147, "hacker@gmail.com", "temporary", 20000);
        employeeList.add(se1);
        employeeList.add(se2);
        employeeList.add(se3);
        employeeList.add(ce1);
        employeeList.add(ce2);
        employeeList.add(v1);
        employeeList.add(v2);
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
    }

    public static void addPerson() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1. Add a Salaried Employee
                2. Add a Contract Employee
                3. Add a Vendor
                4. Add a Member
                Enter a Choice:\s""");
        int choice = sc.nextInt();
        if (choice == 1) {
            addSalariedEmployee();
        } else if (choice == 2) {
            addContractEmployee();
        } else if (choice == 3) {
            addVendor();
        } else if (choice == 4) {
            addMember();
        } else {
            System.out.println("Wrong input!!");
        }
    }

    public static void addSalariedEmployee() throws ParseException {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNum = sc.nextLong();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Date of Joining as DD-MM-YYYY: ");
            String string = sc.nextLine();
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date joinDate = format.parse(string);
            System.out.print("Enter Basic salary: ");
            float basicSalary = sc.nextFloat();
            employeeList.add(new Salaried_Employee(name, mobNum, email, department, designation, joinDate, basicSalary));
            System.out.print("\nWant to add another Salaried Employee? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    private static void addContractEmployee() throws ParseException {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNum = sc.nextLong();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Date of Joining as DD-MM-YYYY: ");
            String string = sc.nextLine();
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date joinDate = format.parse(string);
            System.out.print("Enter Hours Worked: ");
            float hoursWorked = sc.nextFloat();
            System.out.print("Enter per hour rate: ");
            float perHourRate = sc.nextFloat();
            employeeList.add(new Contract_Employee(name, mobNum, email, department, designation, joinDate, hoursWorked, perHourRate));
            System.out.print("\nWant to add another Contract Employee? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    private static void addVendor() throws ParseException {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNum = sc.nextLong();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter Date of Joining as DD-MM-YYYY: ");
            String string = sc.nextLine();
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date joinDate = format.parse(string);
            System.out.print("Enter Number of Employees: ");
            long numOfEmp = sc.nextLong();
            System.out.print("Enter Amount: ");
            float amount = sc.nextFloat();
            employeeList.add(new Vendor(name, mobNum, email, department, designation, joinDate, numOfEmp, amount));
            System.out.print("\nWant to add another Vendor? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static void addMember() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNum = sc.nextLong();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Membership Type: ");
            String membership = sc.nextLine();
            System.out.print("Amount Paid: ");
            long amount = sc.nextLong();
            memberList.add(new Member(name, mobNum, email, membership, amount));
            System.out.print("\nWant to add another Member? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));

    }

    public static void displayEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1. Display Salaried Employees
                2. Display Contract Employees
                3. Display Vendors
                Enter a Choice:\s""");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (Employee employee : employeeList) {
                if (employee instanceof Salaried_Employee) {
                    System.out.println(employee);
                }
            }
        } else if (choice == 2) {
            for (Employee employee : employeeList) {
                if (employee instanceof Contract_Employee) {
                    System.out.println(employee);
                }
            }
        } else if (choice == 3) {
            for (Employee employee : employeeList) {
                if (employee instanceof Vendor) {
                    System.out.println(employee);
                }
            }
        } else {
            System.out.println("Wrong input!!");
        }
    }

    public static void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Search Employee by ID\n2. Search Member by ID\nEnter a choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            if (checkIdExistEmployee(employeeList, id)) {
                System.out.println(employeeList.get(id - 1));
            } else {
                System.out.println("Employee not found!!");
            }
        } else if (choice == 2) {
            System.out.print("Enter Member ID: ");
            int id = sc.nextInt();
            if (checkIdExistMember(memberList, id)) {
                for (Member member : memberList) {
                    if (member.getId() == id) {
                        System.out.println(member);
                    }
                }
            } else {
                System.out.println("Member not found!!");
            }
        } else {
            System.out.println("Wrong  Choice!!!");
        }
    }

    public static void searchByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Search Employee by Name\n2. Search Member by Name\nEnter a choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            if (checkNameExistEmployee(employeeList, name)) {
                for (Employee employee : employeeList) {
                    if (name.equals(employee.getName())) {
                        System.out.println(employee);
                    }
                }
            } else {
                System.out.println("Employee Not Found!!");
            }
        } else if (choice == 2) {
            sc.nextLine();
            System.out.print("Enter Member Name: ");
            String name = sc.nextLine();
            if (checkNameExistMember(memberList, name)) {
                for (Member member : memberList) {
                    if (name.equals(member.getName())) {
                        System.out.println(member);
                    }
                }
            } else {
                System.out.println("Member Not Found!!");
            }
        }
    }

    public static void displayAllEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void salaryByDesignation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a designation: ");
        String designation = sc.nextLine();
        if (checkDesignationExist(employeeList, designation)) {
            for (Employee employee : employeeList) {
                if (designation.equals(employee.getDesignation())) {
                    System.out.print(employee.getName() + ": " + employee.calculateSalary()+"\n");
                }
            }
        } else {
            System.out.println("Not Found!!");
        }
    }

    public static void employeeByDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Department: ");
        String department = sc.nextLine();
        if (checkDepartmentExist(employeeList, department)) {
            for (Employee employee : employeeList) {
                if (department.equals(employee.getDepartment())) {
                    System.out.println(employee);
                }
            }
        } else {
            System.out.println("Not Found!!");
        }
    }

    public static boolean checkDepartmentExist(ArrayList<Employee> employeeList, String department) {
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(department)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDesignationExist(ArrayList<Employee> employeeList, String designation) {
        for (Employee employee : employeeList) {
            if (employee.getDesignation().equals(designation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNameExistEmployee(ArrayList<Employee> employeeList, String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNameExistMember(ArrayList<Member> memberList, String name) {
        for (Member member : memberList) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdExistEmployee(ArrayList<Employee> employeeList, int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == (id)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIdExistMember(ArrayList<Member> memberList, int id) {
        for (Member member : memberList) {
            if (member.getId() == (id)) {
                return true;
            }
        }
        return false;
    }
}