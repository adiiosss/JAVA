package ITNPPJ.ZAD07;

import java.util.Arrays;

public class s28122Set07 {

    public static void main(String[] args) {

    }

    public void task01() {

        int [] tab01 = new int[(int) (Math.random()*10)];
        int [] tab02 = new int[(int) (Math.random()*10)];
        int [] tab03 = new int[(int) (Math.random()*10)];

        for (int i = 0; i < tab01.length ; i++) {
            tab01[i] = (int) (Math.random()*5);
            System.out.print(tab01[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < tab02.length ; i++) {
            tab02[i] = (int) (Math.random()*5);
            System.out.print(tab02[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < tab03.length ; i++) {
            tab03[i] = (int) (Math.random()*5);
            System.out.print(tab03[i] + " ");
        }

        System.out.println("\n");

        System.out.println("TABLICA DWUWYMARIOWA Z 3 POPRZEDNICH: ");

        int[][] tab2d = {tab01, tab02, tab03};

        for (int i = 0; i < tab2d.length ; i++) {
            for (int j = 0; j < tab2d[i].length; j++) {
                System.out.print(tab2d[i][j] + " ");
            }
        }

        System.out.println();

    }

    public void task02() {

        System.out.println();
        System.out.println("TABLICA 2D: ");

        int[][] tab2d = new int[8][8];

        for (int i = 0; i < tab2d.length ; i++) {
            for (int j = 0; j < tab2d[i].length ; j++) {
                tab2d[i][j] = (int) (Math.random()*11);
                System.out.print(tab2d[i][j] + " ");
            }
        }

        System.out.println("\n");

        int count1 = 0;
        int count2 = 0;
        int before1 = tab2d[0][0];
        int before2 = tab2d[0][7];

        for (int i = 0; i < 8; i++) {
            if (tab2d[i][i] == before1) {
                count1++;
                if (count1 == 2) {
                    System.out.println("Na pierwszej przekątnej występują przynajmniej 3 takie same liczby.");
                    break;
                }
            } else {
                count1 = 1;
                before1 = tab2d[i][i];
            }

            if (tab2d[i][7-i] == before2) {
                count2++;
                if (count2 == 2) {
                    System.out.println("Na drugiej przekątnej występują przynajmniej 3 takie same liczby.");
                    break;
                }
            } else {
                count2 = 1;
                before2 = tab2d[i][7-i];
            }
        }

    }

    public void task03() {

        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };
        for (int i = 0; i < tab.length; i++) {
            String word = new String(tab[i]).toLowerCase();
            boolean hasTwoSameLetters = false;
            boolean sumOfCharsGreaterThan255 = false;
            boolean containsLetterI = false;
            boolean hasTwoSameChars = false;
            for (int j = 0; j < word.length() - 1; j++) {
                for (int k = j + 1; k < word.length(); k++) {
                    if (Character.toLowerCase(word.charAt(j)) == Character.toLowerCase(word.charAt(k))) {
                        hasTwoSameLetters = true;
                    }
                }
            }
            int sumOfChars = 0;
            for (int j = 0; j < word.length(); j++) {
                sumOfChars += word.charAt(j);
            }
            if (sumOfChars > 255) {
                sumOfCharsGreaterThan255 = true;
            }
            if (word.indexOf('i') != -1) {
                containsLetterI = true;
            }
            for (int j = 0; j < word.length() - 1; j++) {
                for (int k = j + 1; k < word.length(); k++) {
                    if (word.charAt(j) == word.charAt(k)) {
                        hasTwoSameChars = true;
                    }
                }
            }
            if ((hasTwoSameLetters && sumOfCharsGreaterThan255 && containsLetterI) ||
                    (hasTwoSameLetters && sumOfCharsGreaterThan255 && hasTwoSameChars) ||
                    (hasTwoSameLetters && containsLetterI && hasTwoSameChars) ||
                    (sumOfCharsGreaterThan255 && containsLetterI && hasTwoSameChars)) {
                System.out.println(word);
            }
        }

    }

    public void task04() {

        int [][] tab = new int[10][10];

        System.out.println();
        System.out.println("TABLICA 2D 10x10 o losowych wartosciach:");

        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int)(Math.random()*11);
                System.out.print(tab[i][j] + " ");
            }
        }

        System.out.println("\n");
        System.out.println("POSORTOWANA TABLICA 2D PO WIERSZACH: ");

        for (int i = 0; i < tab.length ; i++) {
            Arrays.sort(tab[i]);
            System.out.print(Arrays.toString(tab[i]));
        }

    }
}
