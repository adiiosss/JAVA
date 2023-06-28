package PPJ23.TASK1;

class Smartfon extends Komorka {
    class Osoba {
        String imie;
        String nazwisko;
        String numer;
    }

    Osoba[] znajomi;

    void zadzwon(String numer) {
        super.zadzwon(numer);
        for (Osoba osoba : znajomi) {
            if (osoba.numer.equals(numer)) {
                System.out.println("Dzwonisz do: " + osoba.imie + " " + osoba.nazwisko);
                break;
            }
        }
    }

    void wyswietlHistoriePolaczen() {
        super.wyswietlHistoriePolaczen();
        for (Osoba osoba : znajomi) {
            for (String numer : ostatniePolaczenia) {
                if (osoba.numer.equals(numer)) {
                    System.out.println(osoba.imie + " " + osoba.nazwisko + " " + numer);
                } else {
                    System.out.println(numer);
                }
            }
        }
    }
}

