package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    private static double alapKamat = 10;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (getAktualisEgyenleg() - osszeg >= 0) {
            aktualisEgyenleg -= osszeg;
            return true;
        }
        return false;
    }

    public void kamatJovairas() {
        aktualisEgyenleg *= 1 + (kamat / 100);
    }
}
