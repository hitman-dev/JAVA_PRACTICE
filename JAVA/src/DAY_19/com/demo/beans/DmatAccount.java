package DAY_19.com.demo.beans;

public class DmatAccount extends Account{
	private double brokerage;
	private static double interestrate;
	static {
		interestrate=0.04;
	}
	public DmatAccount() {
		super();
	}
	public DmatAccount( int accno, String name, String mobile, double balance,double brokerage) {
		super(accno,name,mobile,balance);
		this.brokerage = brokerage;
	}
	public double getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(double brokerage) {
		this.brokerage = brokerage;
	}
	public static double getInterestrate() {
		return interestrate;
	}
	public static void setInterestrate(double interestrate) {
		DmatAccount.interestrate = interestrate;
	}
	
	@Override
	public String toString() {
		return super.toString()+"DmatAccount [brokerage=" + brokerage + "]";
	}
	@Override
	public double calculateInterest() {
		return this.balance*interestrate-this.balance*brokerage;
	}

}
