package idh.java;


/**
 * This class represents an account in our bank.
 * @author reiterns
 *
 */
public class Account {
	// the balance of the account
	int balance;
	
	// the id of the account
	String accountNumber;

	public Account(String accountNumber, int status) {
		this.accountNumber = accountNumber;
		this.balance = status;
	}
	
	public String getId() {
		return this.accountNumber;
	}

	public void setId(String accountNumber) {
		this.accountNumber= accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int status) {
		this.balance = status;
	}
	
	/**
	 * Withdraws a sum of money from the account
	 * @param sum
	 */
	public void withdraw(int sum) {
		this.balance = balance - sum;
	}
	
	
}
