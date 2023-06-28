package JAVA.ZADANIA.PPJ11;

public class Smartfon extends Komorka {

    public Osoba[] kontakty;

    public Smartfon(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.kontakty = kontakty;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        if (historiaPolaczen.length == 0) {
            System.out.println("Brak historii");
        } else {
            System.out.println("Ostatnio wybrane numery:");
            for (String numer : historiaPolaczen) {
                if (numer != null) {
                    System.out.println(numer);
                }
            }
        }
    }
}

