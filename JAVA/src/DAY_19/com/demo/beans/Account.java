package DAY_19.com.demo.beans;

import com.demo.exceptions.InsufficientException;

public abstract class Account {
	private int accno;
	private String name;
	private String mobile;
	protected double balance;
	private static double min_bal;
	static {
		min_bal=1000;
	}
	
	public Account() {
		super();
	}

	public Account(int accno, String name, String mobile, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.mobile = mobile;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public boolean withdraw(double amt) throws InsufficientException{
		if(this.balance-amt>min_bal) {    
		    this.balance=this.balance-amt;
		    return true;
		}
		throw new InsufficientException("Insufficient balance"); // after withdrawla minimum balance > 1000
	}
    public boolean deposite(double amt) {
		this.balance+=amt;
		return true;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    abstract public double calculateInterest();
    
	public static double getMin_bal() {
		return min_bal;
	}

	public static void setMin_bal(double min_bal) {
		Account.min_bal = min_bal;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", mobile=" + mobile + ", balance=" + balance + "]";
	}
	

}
