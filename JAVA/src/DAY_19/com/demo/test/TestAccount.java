package DAY_19.com.demo.test;

import java.util.Scanner;

import DAY_19.com.demo.exceptions.BlockSystemException;
import DAY_19.com.demo.exceptions.InsufficientException;
import DAY_19.com.demo.exceptions.WrongBalanceException;
import DAY_19.com.demo.service.AccountService;
import DAY_19.com.demo.service.AccountServiceImpl;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountService aservice=new AccountServiceImpl();
		int choice=0;
		
		do{
			System.out.println("1.	Add new account \n2.	close the account\n3.	Display account details by id\n");
			System.out.println("4.	withdraw amt\n5.	deposit amt\n6.	check balance\n\n7.	transfer funds within bank\n");
			System.out.println("8.	display all\n9.	Exit\n choice :");
            choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. Saving\n 2. Dmat\n");
				int ch=sc.nextInt();
				aservice.addNewAccount(ch);
				break;
			case 2:
				break;
			case 4:
				System.out.println("enter account number");
				int accid=sc.nextInt();
				double amt=0;
				int i=0;
				for( i=0;i<3;i++) {
						try {
						     System.out.println("enetr amt to withdraw");
						     amt=sc.nextDouble();
						     if(amt<0 ) {
						    	 throw new WrongBalanceException("amount should be > 0");
						     }
						     break;
						}catch(WrongBalanceException e) { // user enter -ve amt while withdrawal
							System.out.println(e.getMessage());
						}
				}
				if(i>=3) {// user enters -ve  amt for withdrwal 3 times
					System.out.println("your 3 attempts are over pls contact administrator");
					System.exit(0);
				}
				boolean status;
				status = aservice.withdrawamount(accid,amt);
				if(status) {
					System.out.println("withdraw successful");
				}


				break;
			case 8:
				aservice.displayAll();
				break;
			case 9:
				sc.close(); 
				System.out.println("Thank you for visitng.....");
				break;
			default:
				System.out.println("wrong choice");
			}
			
		}while(choice!=9);

	}

}
