package ITNPPJ.ZAD09;

public class Osoba {

    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void show(){
        System.out.println("imie: " + imie + "\n nazwisko: " + nazwisko + "\n rok urodzenia: " + rokUrodzenia);
    }

    public static void main(String[] args) {

        Osoba osoba = new Osoba();
        osoba.imie = "adrian";
        osoba.nazwisko = "mięczkowski";
        osoba.rokUrodzenia = 2002;
        osoba.show();

    }

}
