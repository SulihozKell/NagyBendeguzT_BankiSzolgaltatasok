package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(int max) {
        this.szamlaLista = new ArrayList<>(max);
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla ujSzamla;
        if (hitelKeret < 0) {
            ujSzamla = new HitelSzamla(tulajdonos, hitelKeret);
        }
        else {
            ujSzamla = new MegtakaritasiSzamla(tulajdonos);
        }
        szamlaLista.add(ujSzamla);
        return ujSzamla;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;
        for (Szamla szamla : szamlaLista) {
            if (tulajdonos == szamla.getTulajdonos()) {
                osszeg += szamla.aktualisEgyenleg;
            }
        }
        return osszeg;
    }

    public Szamla LegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        int legnagyobb = 0;
        Szamla legnagyobbSzamla = szamlaLista.get(0);

        for (Szamla szamla : szamlaLista) {
            if (tulajdonos == szamla.getTulajdonos()) {
                if (legnagyobb < szamla.getAktualisEgyenleg()) {
                    legnagyobb = szamla.getAktualisEgyenleg();
                    legnagyobbSzamla = szamla;
                }
            }
        }
        return legnagyobbSzamla;
    }

    public long getOsszhitelkeret() {
        long osszhitelkeret = 0;
        for (Szamla szamla : szamlaLista) {
            if (szamla.getClass() == HitelSzamla.class) {
                osszhitelkeret += ((HitelSzamla)szamla).getHitelKeret();
            }
        }
        return osszhitelkeret;
    }
}
