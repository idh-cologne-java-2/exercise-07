package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Map<String, Account> accounts = new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.put(String.valueOf(i), new Account(i, random.nextInt(1000)));
		}
		accounts.put("cashCASHcash", new Account("cashCASHcash", 10000));
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount(String number) {
		// TODO: Implement
		return accounts.get(number);
	}

}
