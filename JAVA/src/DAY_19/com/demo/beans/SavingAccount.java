package DAY_19.com.demo.beans;

public class SavingAccount extends Account{
	private String chekbkno;
	private static double interestrate;
	static {
		interestrate=0.04;
	}
	
	public SavingAccount() {
		super();
	}

	public SavingAccount( int accno, String name, String mobile, double balance, String chekbkno) {
		super(accno,name,mobile,balance);
		this.chekbkno = chekbkno;
	}

	public String getChekbkno() {
		return chekbkno;
	}

	public void setChekbkno(String chekbkno) {
		this.chekbkno = chekbkno;
	}

	public static double getInterestrate() {
		return interestrate;
	}

	public static void setInterestrate(double interestrate) {
		SavingAccount.interestrate = interestrate;
	}

	@Override
	public String toString() {
		return super.toString()+"SavingAccount [chekbkno=" + chekbkno + "]";
	}
	@Override
	public double calculateInterest() {
		return this.balance*interestrate;
	}

}
