package idh.java.central;

public class Account {

    private int kontoStand;
    public String kontoNummer;


    //Konstruktor
    Account(int kontoStand, String kontoNummer) {
        this.kontoStand = kontoStand;
        this.kontoNummer = kontoNummer;
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
