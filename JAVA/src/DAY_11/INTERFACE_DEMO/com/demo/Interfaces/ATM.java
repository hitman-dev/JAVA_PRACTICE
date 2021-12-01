package DAY_11.INTERFACE_DEMO.com.demo.Interfaces;

public interface ATM {
      void withdraw(double amt);
      void deposite(double amt);
      default void welcomemsg() {
    	  System.out.println("Welcome to ATM System");
      }
}
