package PPJ22.TASK2;

public class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String wyswietl() {
        return "Imię: " + imie;
    }
}

class Spawacz extends Osoba {
    private int stazPracy;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }

    @Override
    public String wyswietl() {
        return super.wyswietl() + " Staz pracy: " + stazPracy;
    }
}


