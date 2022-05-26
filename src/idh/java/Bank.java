package idh.java;


import java.util.*;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	Map<Integer, Account> accountMap = new HashMap<Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			accountMap.put(accounts[i].hashCode(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		return accountMap.get(number);
	}

}
