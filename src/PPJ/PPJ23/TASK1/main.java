package PPJ23.TASK1;

public class main {
    public static void main(String[] args) {
        Telefon[] telefony = new Telefon[3];
        telefony[0] = new Telefon();
        telefony[1] = new Komorka();
        telefony[2] = new Smartfon();

        // tworzę znajomych dla smartfonu
        Smartfon smartfon = (Smartfon)telefony[2];
        smartfon.znajomi = new Smartfon.Osoba[3];
        smartfon.znajomi[0] = smartfon.new Osoba();
        smartfon.znajomi[0].imie = "Jan";
        smartfon.znajomi[0].nazwisko = "Kowalski";
        smartfon.znajomi[0].numer = "111-111-111";
        smartfon.znajomi[1] = smartfon.new Osoba();
        smartfon.znajomi[1].imie = "Anna";
        smartfon.znajomi[1].nazwisko = "Nowak";
        smartfon.znajomi[1].numer = "222-222-222";
        smartfon.znajomi[2] = smartfon.new Osoba();
        smartfon.znajomi[2].imie = "Piotr";
        smartfon.znajomi[2].nazwisko = "Wiśniewski";
        smartfon.znajomi[2].numer = "333-333-333";

        // wykonuję połączenia z każdego telefonu
        for (Telefon telefon : telefony) {
            for (int i = 1; i <= 10; i++) {
                String numer = "555-555-555";
                if (telefon instanceof Smartfon && i % 2 == 0) {
                    Smartfon smartfon1 = (Smartfon)telefon;
                    numer = smartfon1.znajomi[i % 3].numer;
                }
                telefon.zadzwon(numer);
            }
        }

        // wyświetlam historię połączeń wszystkich telefonów
        for (Telefon telefon : telefony) {
            telefon.wyswietlHistoriePolaczen();
        }
    }

}
