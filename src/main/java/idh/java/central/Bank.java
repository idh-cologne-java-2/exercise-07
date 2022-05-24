package idh.java.central;

import java.util.HashMap;
import java.util.Iterator;

public class Bank implements Iterable<Account>{

    private final HashMap<String, Account> konten = new HashMap<>();

    public Account erstelleKonto(int kontoStand, String kontoNummer){

        Account account = new Account(kontoStand, kontoNummer);

        //Hash Map befüllen
        konten.put(kontoNummer,account);

        return account;

    }

    //Aufruf Default Konstruktor "AccountIterator"
    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator();
    }
    public Account getKonto(String kontoNummer) throws Exception {

        Iterator<Account> it = iterator();

        while(it.hasNext())
        {
            Account ac = it.next();
            if(ac.kontoNummer.equals(kontoNummer))
            {
                return ac;
            }
        }
        throw new Exception("Konto gibt es nicht!");
    }

    //Funktion, ob Konto mit angegebener KontoNr. existiert
    public boolean kontoExistiert(String kontoNummer) {

        Iterator<Account> it = iterator();

        while(it.hasNext())
        {
            Account ac = it.next();
            if(ac.kontoNummer.equals(kontoNummer))
            {
                return true;
            }
        }
        return false;
    }

    //Inner Class "AccountIterator"
    public class AccountIterator implements Iterator<Account> {

        //über die Values der HashMap konten iterieren
        Iterator<Account> iteratorAccount = konten.values().iterator();

        @Override
        public boolean hasNext() {
            return iteratorAccount.hasNext();
        }

        @Override
        public Account next() {
            return iteratorAccount.next();
        }
    }
}
