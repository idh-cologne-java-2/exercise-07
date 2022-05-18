package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer,Account> accountMap = new HashMap<Integer,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
//		for (int i = 0; i < accounts.length; i++) {
//			accounts[i] = new Account(i, random.nextInt(1000));
//		}
		for (int i=0;i<accounts.length;i++) {
		    accountMap.put(i, new Account(i, random.nextInt(1000)));
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = accountMap.get(i);
		}
		System.out.println(this.getAccount(4).getId()+ " "+ this.getAccount(4).getBalance());
		System.out.println(this.getAccount(2).getId()+ " "+ this.getAccount(2).getBalance());
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: mit Texteingaben
		//Integer n = number;
		//String bNumber = n.toString();
		return accountMap.get(number);
	}

}
