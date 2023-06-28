package PPJ23.TASK1;

class Komorka extends Telefon {
    String[] ostatniePolaczenia = new String[10];
    int pozycja = 0;

    void zadzwon(String numer) {
        super.zadzwon(numer);
        ostatniePolaczenia[pozycja] = numer;
        pozycja = (pozycja + 1) % 10;
    }

    void wyswietlHistoriePolaczen() {
        for (String numer : ostatniePolaczenia) {
            System.out.println(numer);
        }
    }
}
