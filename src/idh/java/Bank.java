package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		HashMap<Integer, Account> accountsmap = new HashMap<Integer, Account>();
		for(int i = 0; i < accounts.length; i++) {
			accountsmap.put(accounts[i].getId(), accounts[i]);
			if(accountsmap.containsKey(number)) {
				return accountsmap.get(number);
			}
		}
		return null;
	}

}
