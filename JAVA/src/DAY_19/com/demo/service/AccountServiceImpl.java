package DAY_19.com.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.beans.DmatAccount;
import com.demo.beans.SavingAccount;
import com.demo.exceptions.BlockSystemException;
import com.demo.exceptions.InsufficientException;
import com.demo.exceptions.WrongBalanceException;

public class AccountServiceImpl implements AccountService{
	static Map<Integer,Account> hm;
	static{
		hm=new HashMap<>();
		hm.put(111,new SavingAccount(111,"Rajan","235543",20000.00,"111111"));
		hm.put(112,new SavingAccount(112,"Revati","235533",30000.00,"111122"));
		hm.put(113,new SavingAccount(113,"Anil","235543",200000.00,"1111133"));
		hm.put(114,new DmatAccount(114,"Veena","235543",50000.00,0.04));
		hm.put(115,new DmatAccount(115,"Radhika","235543",60000.00,0.04));
	}

	@Override
	public void addNewAccount(int ch) throws BlockSystemException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enetr mobile");
		String mobile=sc.next();
		int i=0;
		for(i=0;i<3;i++) {
			try {
				System.out.println("enetr balance");
				double b=sc.nextDouble();
				if(b<1000) { //if balance is < 1000 while opening account
					throw new WrongBalanceException("balance should be > 1000");
					
				}
				else {
						switch(ch) {
						case 1:
							System.out.println("enetr checquebook number");
							String cno=sc.next();
							hm.put(id,new SavingAccount(id,nm,mobile,b,cno) );
							break;
						case 2:	
							System.out.println("enetr brokerage");
							double br=sc.nextDouble();
							hm.put(id,new DmatAccount(id,nm,mobile,b,br) );
							break;
						}
				}
				break;
			}catch(WrongBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
		if(i>=3) { //  if we enter wrong balance 3 times
   		 throw new BlockSystemException("you have completed 3 attempts pls contact administrator");
   	    }
		
		
	}

	@Override
	public boolean withdrawamount(int accid, double amt) throws InsufficientException{ //, WrongAccountId{
		Account ac=hm.get(accid);
		if(ac==null) {
			return false;
			//throw new WrongIdException("pls check accountid");
		}
		else {
			return ac.withdraw(amt);
			
		}
	}

	@Override
	public void displayAll() {
		Set<Map.Entry<Integer,Account>> ks=hm.entrySet();
		for(Map.Entry<Integer,Account> e:ks) {
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		
	}

}
