package ITNPPJ.ZAD08;

import java.util.Arrays;

public class s28122Set08 {

    public static void main(String[] args) {

    }

    public void wypiszKwadrat(int bok, char start) {
        char[][] kwadrat = new char[bok][bok];
        boolean czyX = (start == 'x');

        for (int i = 0; i < bok; i++) {
            for (int j = 0; j < bok; j++) {
                if (czyX) {
                    kwadrat[i][j] = 'x';
                } else {
                    kwadrat[i][j] = 'o';
                }
                czyX = !czyX;
            }
            czyX = !czyX;
        }
        for (int i = 0; i < bok; i++) {
            for (int j = 0; j < bok; j++) {
                System.out.print(kwadrat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] methodArray(int[] tablica1, int[] tablica2, int argument) {

        if (tablica1.length == tablica2.length) {
            return new int[0];
        }

        if (argument < 0) {
            int dlugosc = Math.min(tablica1.length, tablica2.length);
            int[] wynik = new int[dlugosc];
            for (int i = 0; i < dlugosc; i++) {
                wynik[i] = tablica1[i] + tablica2[i];
            }
            return wynik;
        } else if (argument > 0) {
            int dlugosc = 0;
            if (tablica1.length > tablica2.length) {
                dlugosc = tablica1.length - tablica2.length;
                int[] wynik = new int[dlugosc];
                for (int i = tablica2.length, j = 0; j < dlugosc; i++, j++) {
                    wynik[j] = tablica1[i];
                }
                return wynik;
            } else if (tablica1.length < tablica2.length) {
                dlugosc = tablica2.length - tablica1.length;
                int[] wynik = new int[dlugosc];
                for (int i = tablica1.length, j = 0; j < dlugosc; i++, j++) {
                    wynik[j] = tablica2[i];
                }
                return wynik;
            } else {
                return new int[0];
            }
        }
        return new int[0];
    }

    public static int countChars(char[] tab, char znak) {
        int count = 0;
        int znakPorownanie;
        for (int i = 0; i < tab.length ; i++) {
            if(tab[i] == znak){
                count++;
            }
        }
        return count;
    }

    public void modifyValue(int x){
        System.out.println(x);
        x = x*5;
        System.out.println(x);
    }

    public void show(int x){
        System.out.println(x);
    }

    public void task01(){
        int a = 1;
        show(a);

    }

    public void task02(){

        int wrt = 5;
        modifyValue(wrt);

    }

    public void task03(){

        char[] array = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        System.out.println(countChars(array, 'a'));

        countChars(array,'a');

    }

    public void task04(){

        int[] tab1 = new int[(int) (Math.random() * 6)];
        int[] tab2 = new int[(int) (Math.random() * 6)];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 10);
            System.out.print(tab1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = (int) (Math.random() * 10);
            System.out.print(tab2[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(methodArray(tab1, tab2, 6)));

    }

    public void task05(){

        wypiszKwadrat(4, 'o');

    }

}
