package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer, Account> mapaccount = new HashMap<Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
		
		mapaccount.put(12345, accounts[0]);
		mapaccount.put(23456, accounts[1]);
		mapaccount.put(34567, accounts[2]);
		mapaccount.put(45678, accounts[3]);
		mapaccount.put(56789, accounts[4]);
		System.out.println(mapaccount);
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		System.out.println(mapaccount.get(number));
		return mapaccount.get(number);
	}

}
