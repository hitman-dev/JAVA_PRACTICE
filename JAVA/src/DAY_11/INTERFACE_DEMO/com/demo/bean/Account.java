package DAY_11.INTERFACE_DEMO.com.demo.bean;
import DAY_11.INTERFACE_DEMO.com.demo.Interfaces.ATM;

public class Account implements ATM {
       private int id;
       private String name;
       private double balance;
       
       public Account() {
		super();
	}
	public Account(int id, String name, double balance) {
   		super();
   		this.id = id;
   		this.name = name;
   		this.balance = balance;
   	}
   	public int getId() {
   		return id;
   	}
   	public void setId(int id) {
   		this.id = id;
   	}
   	public String getName() {
   		return name;
   	}
   	public void setName(String name) {
   		this.name = name;
   	}
   	public double getBalance() {
   		return balance;
   	}
   	public void setBalance(double balance) {
   		this.balance = balance;
   	}
       
       
       
       
	@Override
	public void withdraw(double amt) {
		if(balance-amt>=1000) {
			balance=balance-amt;
		}
	}
	@Override
	public void deposite(double amt) {
		if(amt>0) {
		   balance=balance+amt;
		}

	}
    public String toString() {
    	return "Id :"+id+"name : "+name+"Balance: "+balance;
    }   
       
}
