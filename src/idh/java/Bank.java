package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	private HashMap<String,Account> accounts = new HashMap<String,Account>();

	public Bank() {
		this.createNewAccount("1234@5678");
		this.createNewAccount("cat_haz_cash");
		this.createNewAccount("\u1F4B8");
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String accountNumber) {
		for (Account acc : this) {
			if (acc.getId().equals(accountNumber)) {
				return acc;
			}
		}
		return null;
	}
	
	public void createNewAccount(String accountNumber) {
		Random rnd = new Random();
		accounts.put(accountNumber, new Account(accountNumber, rnd.nextInt(0,1000)));
	}

}
