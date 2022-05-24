package idh.java;


import java.until.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	HashMap<Integer, Account> Hashbank = new HashMap<Integer,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			Hashbank.put(i,  accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		//Aufruf
		return Hashbank.get(number);
	}

}
