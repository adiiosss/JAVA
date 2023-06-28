package JAVA.ZADANIA.PPJ11;

import java.util.Random;

public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        Random random = new Random();
        int iloscPaliwa = random.nextInt(1500) + 1;  // Losowa ilość paliwa od 1 do 1000
        wagaPaliwa += iloscPaliwa;
        System.out.println("Zatankowano " + iloscPaliwa + " jednostek paliwa.");
    }

    public void start() throws Exception {
        if (wagaPaliwa < 1000) {
            throw new Exception("Start anulowany - za mało paliwa");
        } else {
            System.out.println("Rozpoczynam procedurę startową.");
        }
    }
}

