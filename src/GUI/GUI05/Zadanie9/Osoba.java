package GUI.GUI05.Zadanie9;
import java.util.*;

public class  Osoba implements Comparable<Osoba> {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public static boolean wKolekcji(Collection<Osoba> kol, String imie, int rokUrodzenia) {
        return kol.contains(new Osoba(imie, rokUrodzenia));
    }

    @Override
    public boolean equals(Object o) {
        if(o.getClass() == Osoba.class){
            return this.imie.equals(((Osoba)o).imie) && this.rokUrodzenia == ((Osoba)o).rokUrodzenia;
        }else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, rokUrodzenia);  // Obliczamy skrót hash obiektu z uwzględnieniem pól imie i rokUrodzenia
    }

    @Override
    public int compareTo(Osoba o) {
        int compareResult = imie.compareTo(o.imie);
        if (compareResult == 0) {
            compareResult = Integer.compare(rokUrodzenia, o.rokUrodzenia);
        }

        return compareResult;
    }
}