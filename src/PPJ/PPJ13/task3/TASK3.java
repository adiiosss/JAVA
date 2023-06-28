package PPJ13.task3;

import java.util.Arrays;

public class TASK3 {

    public static void main(String[] args) {

        int min = 2;
        int max = 10;

        int min2 = 1;
        int max2 = 20;

        int[] tab;
        tab = new int[(int) (Math.random() * (max - min + 1) + min)];

        for (int i = 0; i < tab.length; i++) {
            int value = (int) (Math.random() * (max2 - min2 + 1) + min2);
            tab[i] = value;
            Arrays.sort(tab);
        }

        System.out.print(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    tab[i] = tab[j];
                }
            }
        }
        System.out.println();
        int suma = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] != tab[i - 1]) {
                suma = 1;
            }
            if (tab[i] == tab[i - 1]) {
                suma += 1;
            }
            if ((double) suma >= (double) tab.length / 2) {
                System.out.println("wartosc wystepuje co najmniej n/2 razy");
                break;
            }

        }
        if ((double) suma < (double) tab.length / 2) {
            System.out.println("wartosc nie wystepuje co najmniej n/2 razy");
        }
    }
}



