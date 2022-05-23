package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap <Integer, Account> accountmap = new HashMap<Integer, Account>();
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
		accountmap.put(47896,accounts[0]);
		accountmap.put(12345,accounts[1]);
		accountmap.put(01010,accounts[2]);
		accountmap.put(66623,accounts[3]);
		accountmap.put(77777,accounts[4]);
		System.out.println(accountmap);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		System.out.println(accountmap.get(number));
		return accountmap.get(number);
		
	}

}
