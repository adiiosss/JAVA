package PPJ13.task4and5;

import java.util.Arrays;
import java.util.Scanner;

public class TASK4and5 {

    public static void main(String[] args) {

    int min = -5;
    int max = 5;

    Scanner in = new Scanner(System.in);
    int[] tab = new int [3];

        for (int i = 0; i < tab.length ; i++) {
            int value = (int) (Math.random() * (max - min) + min);
            tab[i] = value;
            Arrays.sort(tab);
        }

        System.out.println("Witaj!");
        System.out.println();
        System.out.println("Twoja tablica:");

        System.out.print(Arrays.toString(tab));
        System.out.println();
        System.out.println();

        System.out.println("Lista poleceń:");
        System.out.println("quit - spowoduje wyjście z programu");
        System.out.println("add - doda do tablicy kolejny element");
        System.out.println("get - pobierze i usunie z tablicy ostatnio dodany element");
        System.out.println();
        System.out.println("Wydaj polecenie:");

        boolean runMethod = true;
        while (runMethod) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i] + "\t");
            }
            String input = in.next() + in.nextLine();
            String[] elements = input.split("\\s");
            int inputValue = Integer.parseInt(elements[0]);
            if (elements[1].equals("quit"))
                runMethod = false;
            if (elements[1].equals("add")) {
                boolean valueExists = false;
                for (int i = 0; i < tab.length; i++) {
                    if (tab[i] == inputValue) {
                        valueExists = true;
                        break;
                    }
                }
                if (valueExists) {
                    int[] temp = new int[tab.length + 1];
                    for (int i = 0; i < tab.length; i++) {
                        temp[i] = tab[i];
                    }
                    tab = temp;
                    System.out.println("input element to add:");
                    int value = in.nextInt();
                    tab[tab.length-1] = value;
                }
                else
                    runMethod = false;
            }
            if (elements[1].equals("get")){
                boolean valueExists = false;
                for (int i = 0; i < tab.length; i++) {
                    if (tab[i] == inputValue) {
                        valueExists = true;
                        break;
                    }
                }
                if (valueExists) {
                    System.out.println("tab[tab.length-1] = " + tab[tab.length-1]);
                    int[] temp = new int[tab.length - 1];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = tab[i];
                    }
                    tab = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");

        }
    }
}
