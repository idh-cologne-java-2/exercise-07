package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.put(i, new Account(i, random.nextInt(1000)));
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		return accounts.get(number);
	}

}
