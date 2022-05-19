package idh.java.central;

public class Account {

    //kontoStand des Inhabers als float
    private int kontoStand;

    public String kontoNummer;

    //HashMap mit Key (Kontonummer) und Value (Konto bzw. Kontostand)


    //Konstruktor
    Account(int kontoStand, String kontoNummer) {
        this.kontoStand = kontoStand;
        this.kontoNummer = kontoNummer;

        //Befüllen der HashMap mit kontoNummer und Konto (this)
        //konten.put(kontoNummer, this);
    }

    //GETTER getKontostand
    public int getKontoStand() {
        return kontoStand;
    }



    //geldAbheben erfolgreich ja oder nein
    public boolean geldAbheben(int betrag) {
        if (betrag > this.kontoStand) {
            System.out.println("Du hast nicht genug Geld auf deinem Konto!");
            return false;
        }
        kontoStand -= betrag;
        System.out.println("Hier ist dein Geld!, dein neuer Kontostand: " + kontoStand + " Euro");
        return true;


    }



}
