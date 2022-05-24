package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}

	/*protected Account getAccount(int id) {
		for (Account account : accounts) {
			if (account.getId() == id)
				return account;
		}
	*/

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		HashMap<Integer,Object> accountN = new HashMap<>();

		accountN.put(number,accounts);

		return null;
	}

}
