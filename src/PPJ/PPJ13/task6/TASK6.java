package PPJ13.task6;

import java.util.Arrays;

public class TASK6 {

    public static void main(String[] args) {

        int min = 1;
        int max = 10;

        int min2 = 2;
        int max2 = 8;

        int [] nr1;
        nr1 = new int [(int)(Math.random() * (max - min) + min)];

        int [] nr2;
        nr2 = new int [(int)(Math.random() * (max - min) + min)];

        int [] nr3;
        nr3 = new int [(int)(Math.random() * (max - min) + min)];

        System.out.println();

        System.out.println("3 TABLICE O LOSOWYCH ROZMIARACH I LOSOWYCH WARTOSCIACH TYPU INT:");

        for (int i = 0; i < nr1.length ; i++) {
            int value = (int)(Math.random() * (max2 - min2) + min2);
            nr1[i] = value;
            Arrays.sort(nr1);
        }

        System.out.print(Arrays.toString(nr1));

        System.out.println();

        for (int i = 0; i < nr2.length ; i++) {
            int value = (int)(Math.random() * (max2 - min2) + min2);
            nr2[i] = value;
            Arrays.sort(nr2);
        }

        System.out.print(Arrays.toString(nr2));

        System.out.println();

        for (int i = 0; i < nr3.length ; i++) {
            int value = (int)(Math.random() * (max2 - min2) + min2);
            nr3[i] = value;
            Arrays.sort(nr3);
        }

        System.out.print(Arrays.toString(nr3));

        System.out.println();
        System.out.println();

        System.out.println("WSZYSTKIE TABLICE W JEDNEJ DWUWYMIAROWEJ TABLICY");


        int[][] all = new int[3][];

        all[0] = nr1;
        all[1] = nr2;
        all[2] = nr3;

        System.out.println(Arrays.deepToString(all));

        /*for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++) {
                System.out.print(all[i][j] + " ");
            }
        }
*/
        System.out.println();

    }

}
