package toolbox.task5;

public class TASK5 {

    public static void main(String[] args) {

        String zdanie = "Zajecia z programowania w javie sa calkiem w porzadku";

        HowManyCharacters(zdanie, 'z');

    }

    public static void HowManyCharacters(String napis, char litera) {

        int ilosc = 0;
        char wystepujacyZnak;
        for (int i = 0; i < napis.length(); i++) {
            wystepujacyZnak = napis.charAt(i);
            if (wystepujacyZnak == litera) {
                ilosc++;
            }
        }
        System.out.println(ilosc);
    }
}
