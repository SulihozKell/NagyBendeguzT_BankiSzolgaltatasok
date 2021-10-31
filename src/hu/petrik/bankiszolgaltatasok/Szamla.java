package hu.petrik.bankiszolgaltatasok;

public class Szamla extends BankiSzolgaltatas {
    private int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        aktualisEgyenleg = 0;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        this.aktualisEgyenleg += osszeg;
    }

    // JAVÍT
    public boolean kivesz(int osszeg) {
        return false;
    }

    // ujKartya
}
