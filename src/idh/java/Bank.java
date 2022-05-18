package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	HashMap<Integer,Account>s = new HashMap<Integer,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			s.put(i, accounts[i]);
		}

		init(); 
	}
	
	
	
	
	
	private void init( ) {
		
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		
		
		
		// TODO: Implement
		return s.get(number);
	}

}
