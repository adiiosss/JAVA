package JAVA.ZADANIA.PPJ11;

public class S28122Set11 {

    public static void main(String[] args) throws Exception {

        //wywolanie obiektu telefon
        System.out.println("\nTelefon");
        Telefon stacjonarny = new Telefon("siec", "czarny");
        stacjonarny.zadzwon("628828283");
        stacjonarny.wyswietlHistoriePolaczen();

        //wywolanie obiektu komorka
        System.out.println("\nKomóka");
        Komorka samsung = new Komorka("siec", "czerwony");
        samsung.zadzwon("111222333");
        samsung.zadzwon("444555666");
        samsung.wyswietlHistoriePolaczen();

        //wywolanie obiektu smartfon
        System.out.println("\nSmartfon");
        Smartfon apple = new Smartfon("siec", "bialy");
        apple.zadzwon("123544455");
        apple.zadzwon("222352345");
        apple.zadzwon("555123455");
        apple.wyswietlHistoriePolaczen();


        //tablica obiektow telefon
        System.out.println("\nTABLICA OBIEKTOW \n");
        Telefon[] telefony = new Telefon[3];
        telefony[0] = new Telefon("bt", "Niebieski");
        telefony[1] = new Komorka("bt", "Różowy");
        telefony[2] = new Smartfon("siec", "Srebrny");

        Smartfon smartfon = (Smartfon) telefony[2];
        smartfon.kontakty = new Osoba[]{
                new Osoba("Jan", "Kowalski", "123-456-789"),
                new Osoba("Anna", "Nowak", "987-654-321")
        };
        

        for (Telefon telefon : telefony) {
            for (int i = 0; i < 10; i++) {
                if (telefon instanceof Smartfon && i % 2 == 0) {
                    Osoba znajomy = smartfon.kontakty[i % smartfon.kontakty.length];
                    telefon.zadzwon(znajomy.numer);
                } else {
                    telefon.zadzwon("555-555-555");
                }
            }
            System.out.println("\nHistoria połączeń dla telefonu:");
            telefon.wyswietlHistoriePolaczen();
            System.out.println("--------------------\n");
        }

        //DETEKTOR DYMU
        System.out.println("DETEKTOR DYMU");
        DetektorDymu detektor = new DetektorDymu();

        try {
            detektor.sprawdz(true);  // Wywołanie metody z wykrytym dymem
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }

        try {
            detektor.sprawdz(false);  // Wywołanie metody bez dymu
        } catch (Alarm alarm) {
            System.out.println(alarm.getMessage());
        }


        //RAKIETA
        System.out.println("\nRAKIETA SPACEX");
        Rakieta spaceX = new Rakieta("Maniek", 1);
        spaceX.zatankuj();
        spaceX.start();

    }

}
