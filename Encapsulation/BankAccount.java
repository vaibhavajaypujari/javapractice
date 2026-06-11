//2. Bank Account – deposit & withdraw.
//       Create a BankAccount class with a private balance.
//       Add:
//       deposit(double amount)
//       withdraw(double amount)
//       getBalance()


package Encapsulation;

public class BankAccount {
         private int balance;
         
	public void deposit() {
		System.out.println("Amount Deposit");
	}
	public void withdraw() {
		System.out.println("Amount Withdraw");
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
}
