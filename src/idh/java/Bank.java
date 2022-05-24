package idh.java;

/**
 * @author UntoastedToast
 *
 */

import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	HashMap<Integer, Account> bankaccounts = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));

			// Insert accounts into a map
			bankaccounts.put(i, accounts[i]);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}

	public Account getAccount(int number) {
		// Get account number
		return bankaccounts.get(number);
	}

}
