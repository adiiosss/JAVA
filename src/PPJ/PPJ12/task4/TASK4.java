package PPJ12.task4;

import java.util.Scanner;

public class TASK4 {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Witaj w grze kolko i krzyzyk:");
        System.out.println();

        int wymiar = 3;

        byte[] plansza = new byte[0];

        System.out.print("\t");
        for (int i = 1; i <= wymiar; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();
        for (int i = 0; i < wymiar; i++) {
            System.out.println(i + ":\t");

        }
            System.out.println();
            System.out.println();


            for (int wiersz = 0; wiersz < plansza.length; wiersz++) {

                System.out.print(plansza[wiersz] + "\t");
            }

            System.out.println();

            for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
                System.out.print(plansza[wiersz] + "\t");
            }

            System.out.println();

            for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
                System.out.print(plansza[wiersz] + "\t");
            }

        }


        //nie wiem jak odnieść się do poszczególnych wierszy w tablicy jednowymiarowej


    }
