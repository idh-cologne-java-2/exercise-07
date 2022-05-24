package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	//Hashmap mit integer Werten und der passenden Accountid
	HashMap<Integer, Account> bank = new HashMap<Integer, Account>();
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			//in die Hashmap bank soll der account mit der passenden id hinzugefügt werden, welche an der Stelle i ermittelt wurde
			bank.put(i, accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		//aus der Hashmap bank soll der value vom key number zurückgegeben werden
		return bank.get(number);
	}

}
