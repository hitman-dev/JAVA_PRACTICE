package DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.test;

import DAY_11_COLLECTIONS_AND_INHERITANCE_ASSIGNMENT.Q2.com.demo.services.ABC_Tel_service;

import java.util.Scanner;

public class ABC_Tel_test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.print("""
                    1. Add a new Vendor/Customer            
                    2. Delete a Vendor/Customer                
                    3. Find all customer with specific plan  
                    4. Find by Id                            
                    5. Find Customer by Relationship Manager 
                    6. Exit                                 
                    Enter a choice:\s""");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    ABC_Tel_service.addPerson();
                    break;
                case 2:
                    ABC_Tel_service.deletePerson();
                    break;
                case 3:
                    System.out.println("Enter a plan: ");
                    String plan = sc.nextLine();
                    ABC_Tel_service.searchCustomerByPlan(plan);
                    break;
                case 4:
                    ABC_Tel_service.findById();
                    break;
                case 5:
                    System.out.println("Enter name of Relationship Manager: ");
                    String relationshipManager = sc.nextLine();;
                    ABC_Tel_service.findCustomerByRelationshipManager(relationshipManager);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Input!!!");
            }
        }while(true);
    }
}
