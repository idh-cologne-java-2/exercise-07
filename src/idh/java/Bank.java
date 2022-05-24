package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;



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
		// TODO: Implement
//		for (Entry<Integer, Account> entry : accountMap.entrySet()) {
//			int i = entry.getKey();
//			Account a = entry.getValue();
//			
//			if(i == number) {
//				return a;
//			}
//			
//		}
		return accountMap.get(number);
	}

}
