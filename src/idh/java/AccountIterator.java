package idh.java;


import java.util.HashMap;
import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	HashMap<String, Account> accountMap;
	
	public AccountIterator(HashMap<String, Account> accounts) {
		this.accountMap = accounts;
	}
	

	@Override
	public boolean hasNext() {
		return currentPosition < accountMap.size();
	}

	@Override
	public Account next() {
		int i = 0;
		for (Account acc : this.accountMap.values()) {
			if (i == currentPosition) {
				currentPosition++;
				return acc;
			}
			i++;
		}
		return null;
	}
	
}