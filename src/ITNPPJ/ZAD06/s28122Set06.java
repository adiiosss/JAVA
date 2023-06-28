package ITNPPJ.ZAD06;

import java.util.Random;

public class s28122Set06 {

    public static void main(String[] args) {

    }

    public void task01(){

        int tab[] = new int[10];

    }

    public void task02(){

        int tab[] = new int[10];

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = (int) (Math.random()*2);
            System.out.print(tab[i] + " ");
        }
    }

    public void task03(){

        int tab[] = new int[10];

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = (int) (Math.random()*2);
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        int suma0 = 0;
        int suma1 = 0;

        for (int i = 0; i < tab.length ; i++) {
            if(tab[i] == 0){
                suma0++;
            }
        }

        System.out.println("ilosc zer - " + suma0);

        for (int i = 0; i < tab.length ; i++) {
            if(tab[i] == 1){
                suma1++;
            }
        }

        System.out.println("ilosc jedynek - " + suma1);

    }

    public void task04(){

        double tab[] = new double[10];

        System.out.println("TABLICA:");

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = Math.random()*Integer.MAX_VALUE;
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        System.out.println("PARZYSTE:");

        for (int i = 0; i < tab.length ; i++) {
            if(i % 2 == 0){
                System.out.print(tab[i] + " ");
            }
        }

        System.out.println();
        System.out.println("NIEPARZYSTE");

        for (int i = 0; i < tab.length ; i++) {
            if((int)tab[i] % 2 != 0){
                System.out.println(tab[i]);
            }
        }

    }

    public void task05(){

        //adres pamięci

    }

    public void task06(){

       /* 0
        111
        222
        0
        111
        0*/

    }

    public void task07(){

        String[] slowa = {"Ala" , "kota" , "ma", "ma", "a" , "kot", "Ale"};

        System.out.print(slowa[0] + " " + slowa[2] + " " + slowa[1] + " " + slowa[4] + " " + slowa[5] + " " + slowa[3]  + " " + slowa[6] );

    }

    public void task08(){

        Random przedzial = new Random();

        char tab[] = new char[10];

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = (char)(przedzial.nextInt(26)+97);
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        char tab2[] = new char[tab.length];
        for (int i = tab.length-1, j = 0; i >= 0 ; i--, j++) {
            tab2[j] = tab[i];
            System.out.print(tab2[j] + " ");
        }

    }

}
