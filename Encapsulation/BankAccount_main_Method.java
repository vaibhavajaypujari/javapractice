package Encapsulation;

public class BankAccount_main_Method {

	
	public static void main(String[] args) {
		BankAccount B= new BankAccount();
		B.setBalance(20000);
		System.out.println("Account Balance = " +B.getBalance());
		B.withdraw();
	}
}
