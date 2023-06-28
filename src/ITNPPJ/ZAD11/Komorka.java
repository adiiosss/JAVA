package JAVA.ZADANIA.PPJ11;

public class Komorka extends Telefon {
    public String[] historiaPolaczen;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.historiaPolaczen = new String[10];
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
        przesunHistoriePolaczen();
        historiaPolaczen[0] = numer;
    }

    public String[] getHistoriaPolaczen() {
        return historiaPolaczen;
    }

    public void przesunHistoriePolaczen() {
        for (int i = historiaPolaczen.length - 1; i > 0; i--) {
            historiaPolaczen[i] = historiaPolaczen[i - 1];
        }
    }
    public void wyswietlHistoriePolaczen() {
        if (historiaPolaczen[0] == null) {
            System.out.println("Brak historii");
        } else {
            for (String numer : historiaPolaczen) {
                if (numer != null) {
                    System.out.println(numer);
                }
            }
        }
    }
}


