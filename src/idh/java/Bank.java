package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;


public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];

	HashMap<Integer, Account> returnAccount = new HashMap<>();
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			
			returnAccount.put(i, accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
	
//		Account account1 = new Account(0001 , 500);
//		Account account2 = new Account(0002 , 40000);
//		Account account3 = new Account(0003 , 23);
//		
//		
//	
//		returnAccount.put(2222, account1);
//		returnAccount.put(3333, account2);
//		returnAccount.put(4444, account3);
//		
//		System.out.println(returnAccount);
		
		return returnAccount.get(number);
	}
	
	
}
