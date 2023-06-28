package GUI.GUI04.zadanie7;

import java.util.*;
import java.lang.Comparable;
public class Osoba implements Comparable<Osoba> {
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return imie + " (" + wiek + " lat)";
    }

    @Override
    public int compareTo(Osoba o) {
        int imiePorownanie = imie.compareTo(o.imie);
        if (imiePorownanie == 0) {
            return Integer.compare(wiek, o.wiek);
        } else {
            return imiePorownanie;
        }
    }
}

class KomparatorOsob implements Comparator<Osoba> {
    public enum Kryterium {   //enum Kryterium z polami imie i wiek
        imie, wiek
    }

    private Kryterium kryterium;

    public KomparatorOsob(Kryterium kryterium) {
        this.kryterium = kryterium;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        if (kryterium == Kryterium.wiek)
        {
            return Integer.compare(o1.getWiek(), o2.getWiek());
        } else if (kryterium == Kryterium.imie)
        {
            return CharSequence.compare(o1.getImie(), o2.getImie());
        } else
        {
           return 404;
        }
    }

}
