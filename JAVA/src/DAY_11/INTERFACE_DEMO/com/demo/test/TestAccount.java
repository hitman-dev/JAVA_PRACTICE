package DAY_11.INTERFACE_DEMO.com.demo.test;
import DAY_11.INTERFACE_DEMO.com.demo.Interfaces.ATM;
import DAY_11.INTERFACE_DEMO.com.demo.bean.Account;


public class TestAccount {
	public static void main(String[] args) {
		ATM ob=new Account(123,"Hitman",80000);
		ob.withdraw(1000);
		ob.deposite(2000);
		System.out.println(ob);
	}

}
