package GUI05.ZADANIE10;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };

        Map<String, List<Samochod>> mapa = new HashMap<>(); //pusta mapa

        // Przetwarzamy tablicę w pętli, dodając samochody do odpowiednich list w mapie
        for (int i = 0; i < arr.length; i += 3) {
            String salon = arr[i];
            String marka = arr[i+1];
            int cena = Integer.parseInt(arr[i+2]);

            // Jeśli salon nie istnieje w mapie, tworzymy dla niego nową listę
            if (!mapa.containsKey(salon)) {
                mapa.put(salon, new ArrayList<Samochod>());
            }

            // Dodajemy nowy samochód do listy
            List<Samochod> listaSamochodow = mapa.get(salon);
            listaSamochodow.add(new Samochod(marka, cena));
        }


        System.out.println(); //wciecie


        /*System.out.println("{");
        for (String salon : mapa.keySet()) {
            System.out.print("  " + salon + "=[");
            List<Samochod> listaSamochodow = mapa.get(salon);
            for (Samochod samochod : listaSamochodow) {
                System.out.print(samochod.toString() + ", ");
            }
            System.out.println("]");
        }
        System.out.println("}");*/


        System.out.println(mapa);


        // Szukamy najtańszego samochodu
        Samochod najtanszy = null;
        String najtanszySalon = "";
        for (String salon : mapa.keySet()) {
            List<Samochod> listaSamochodow = mapa.get(salon);
            for (Samochod samochod : listaSamochodow) {
                if (najtanszy == null || samochod.cena < najtanszy.cena) {
                    najtanszy = samochod;
                    najtanszySalon = salon;
                }
            }
        }

        System.out.println();

        System.out.println(najtanszy.marka + ", " + najtanszySalon + ", " + najtanszy.cena); // Wyświetlamy informacje o najtańszym samochodzie
    }


    private static class Samochod {
        String marka;
        int cena;

        public Samochod(String marka, int cena) {
            this.marka = marka;
            this.cena = cena;
        }

        @Override
        public String toString() {
            return marka + " " + cena;
        }
    }
}
