package idh.java;

import idh.java.central.Account;
import idh.java.central.Bank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ATM {

    //Summe, die auf ATM vorhanden ist
    int geldATM = 100000;
    Bank bank;


    //Konstruktor
    public ATM(Bank bank) {
        this.bank = bank;

    }

    public void wirIterieren() {
        for (Account ac : bank) {
            System.out.println(ac.getKontoStand());

        }

    }

    public void run() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("Gib bitte zuerst deine Kontonummer an: ");
                String kontoNummerString = br.readLine();

                //Prüfen, ob User "exit" eingetippt hat
                if (kontoNummerString.equalsIgnoreCase("exit")) {
                    System.out.println("Vorgang wird beendet, Bis bald");
                    break;
                }


                //Prüfen ob Konto existiert
                if (!bank.kontoExistiert(kontoNummerString)) {
                    System.out.println("Angegebene KontoNr. existiert nicht");

                    continue;
                }

                //schaue in HashMap nach ob entsprechender Eintrag existiert
                Account k = bank.getKonto(kontoNummerString);


                System.out.println("Dein aktueller Kontostand: " + k.getKontoStand() + " €");

                System.out.print("Gib den Betrag an der abgehoben werden soll: ");
                String betragString = br.readLine();

                if (betragString.equalsIgnoreCase("exit")) {
                    System.out.println("Vorgang wird beendet, Bis bald");
                    break;
                }

                int betragAbbuchung = Integer.parseInt(betragString);

                cashout(betragAbbuchung, k);

            } catch (Exception e) {
                e.printStackTrace();
                break;

            }
        }
    }

    //Initialisierung
    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte gib deine WunschkontoNr. an um ein Konto zu erstellen: ");

        String eingabeUser = br.readLine();


        Random random = new Random();
        int kontoStand = random.nextInt(100000);

        bank.erstelleKonto(kontoStand, eingabeUser);

        System.out.println("Dein Konto wurde erfolgreich erstellt!");

    }


    public void cashout(int betrag, Account k) {

        if (betrag <= 0) {
            System.out.println("Negativer Betrag wird nicht akzeptiert");
            return;
        }

        if (betrag % 5 != 0) {
            System.out.println("Betrag kann nicht ausgegeben werden, da keine Münzen vorhanden sind");
            System.out.println("Mögliche Beträge sind: " + betrag / 5 * 5 + " oder " + ((betrag / 5) + 1) * 5 + " Euro");
            return;
        }

        if (betrag > geldATM) {
            System.out.println("Dieser Automat hat zu wenig Geld!");
        } else {
            boolean success = k.geldAbheben(betrag);
            if (success) {
                geldATM -= betrag;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Bank b = new Bank();

        ATM atm = new ATM(b);
        atm.init();
        atm.run();


    }
}