package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.services;
import DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans.Company;
import DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans.Customer;
import DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans.Individual_Customer;
import DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.beans.Vendor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ABC_Tel_service {
    public static ArrayList<Customer> customerList = new ArrayList<>();
    public static ArrayList<Vendor> vendorList = new ArrayList<>();

    public static void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1. Add new Vendor
                2. Add Individual Customer
                3. Add Company
                Enter a Choice:\s""");
        int choice = sc.nextInt();
        if (choice == 1) {
            addVendor();
        } else if (choice == 2) {
            addIndividualCustomer();
        } else if (choice == 3) {
            addCompanyCustomer();
        } else {
            System.out.println("Wrong Choice!!");
        }
    }

    public static void addVendor() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Vendor Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            long mobNum = sc.nextLong();

            String[] products = acceptProducts();

            vendorList.add(new Vendor(name, email, mobNum, List.of(products)));
            System.out.print("\nWant to add another Vendor? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static void addIndividualCustomer() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Individual Customer's Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Credit class: ");
            String creditClass = sc.nextLine();

            System.out.print("Enter discount: ");
            float discount = sc.nextFloat();

            System.out.print("Enter a plan from(p1,p2,p3,p4): ");
            String plan = sc.nextLine();

            System.out.print("Enter phone number: ");
            long phoneNum = sc.nextLong();

            customerList.add(new Individual_Customer(name, email, creditClass, discount, plan, phoneNum));
            System.out.print("\nWant to add another Individual Customer? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static void addCompanyCustomer() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Company Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Credit class: ");
            String creditClass = sc.nextLine();

            System.out.print("Enter discount: ");
            float discount = sc.nextFloat();

            System.out.print("Enter a plan from(p1,p2,p3,p4): ");
            String plan = sc.nextLine();

            System.out.print("Enter relationship manager name: ");
            String rmName = sc.nextLine();

            System.out.print("Enter credit line number: ");
            int creditLine = sc.nextInt();

            System.out.print("Enter number of extensions");
            int extensions = sc.nextInt();

            HashSet<Long> numbers = acceptNumbers();

            customerList.add(new Company(name, email, creditClass, discount, plan, rmName, creditLine, extensions,numbers));
            System.out.print("\nWant to add another Company? y/n: ");
            choice = sc.nextLine();
            choice = choice.toLowerCase();
        } while (!"n".equals(choice));
    }

    public static String[] acceptProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter products separated by space: ");
        return sc.nextLine().split(" ");
    }

    public static HashSet<Long> acceptNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by space");
        String[] stringList = sc.nextLine().split(" ");

        HashSet<Long> numList = new HashSet<>();
        for (String s : stringList) {
            numList.add(Long.valueOf(s));
        }
        return numList;
    }

    public static void deletePerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1. Delete Vendor
                2. Delete Customer
                Enter a Choice:\s""");
        int choice = sc.nextInt();
        if (choice == 1) {
            deleteVendor(choice);
        } else if (choice == 2) {
            deleteCustomer(choice);
        } else {
            System.out.println("Wrong Choice!!");
        }
    }

    public static void deleteVendor(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vendor ID: ");
        int id = sc.nextInt();
        if (checkIdExist(vendorList,customerList, id, choice)) {
            vendorList.removeIf(vendor -> vendor.getId() == id);
            System.out.println("Vendor Deleted Successfully");
        } else {
            System.out.println("Vendor not found!!");
        }
    }

    public static void deleteCustomer(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        if (checkIdExist(vendorList,customerList, id,choice)) {
            customerList.removeIf(customer -> customer.getId() == id);
            System.out.println("Customer Deleted Successfully");
        } else {
            System.out.println("Customer not found!!");
        }
    }

    public static boolean checkIdExist(ArrayList<Vendor> vendorList, ArrayList<Customer> customerList,int id, int choice) {
        if (choice == 1) {
            for (Vendor vendor : vendorList) {
                if (vendor.getId() == (id)) {
                    return true;
                }
            }
        } else{
            for (Customer customer : customerList) {
                if (customer.getId() == (id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void searchCustomerByPlan(String plan){
        for(Customer customer: customerList){
            if(customer.getPlan().equals(plan)){
                System.out.println(customer);
            }
        }
    }

    public static void findById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                1. Find the Vendor
                2. Find the Customer
                Enter a Choice:\s""");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Vendor ID: ");
            int id = sc.nextInt();
            for (Vendor vendor : vendorList) {
                if (vendor.getId() == (id)) {
                    System.out.println(vendor);;
                }else {
                    System.out.println("Vendor not found!!");
                }
            }
        } else if (choice == 2) {
            System.out.print("Enter Customer ID: ");
            int id = sc.nextInt();
            for (Customer customer : customerList) {
                if (customer.getId() == (id)) {
                    System.out.println(customer);
                }else{
                    System.out.println("Customer not found!!");
                }
            }
        } else {
            System.out.println("Wrong Choice!!");
        }
    }

    public static void findCustomerByRelationshipManager(String relationshipManager){
        for(Customer customer: customerList){
            if(Company.getRmName().equals(relationshipManager)){
                System.out.println(customer);
            }
        }
    }


}
