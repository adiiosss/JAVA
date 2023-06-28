package ITNPPJ.ZAD04;

import java.util.Scanner;

public class s28122Set04 {

    public static void main(String[] args) {


    }


    public void task05 () {

        //( ! ( a < b ) && ! ( a > b ) )

        // a > b && a < b

    }

    public void task06 () {

        int a = 2;
        int b = 1;
        int c = 2;

        System.out.println((a == b) ? "Są takie same" : "Nie są takie same");
        System.out.println((a == c) ? "Są takie same" : "Nie są takie same");
        System.out.println((b == c) ? "Są takie same" : "Nie są takie same");

    }

    public void task07 () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miesiąc: ");
        int M = scanner.nextInt();

        System.out.print("Podaj dzień: ");
        int D = scanner.nextInt();

        String poraRoku;

        switch (M) {
            case 1:
            case 2:
                poraRoku = "Zima";
                break;
            case 3:
                poraRoku = (D < 21) ? "Zima" : "Wiosna";
                break;
            case 4:
            case 5:
            case 6:
                poraRoku = "Wiosna";
                break;
            case 7:
            case 8:
            case 9:
                poraRoku = "Lato";
                break;
            case 10:
                poraRoku = (D < 23) ? "Jesień" : "Lato";
                break;
            case 11:
            case 12:
                poraRoku = "Jesień";
                break;
            default:
                poraRoku = "ERROR";
                break;
        }

        System.out.println(poraRoku);
    }


    public void task08 () {

        double a = 2.4;

        System.out.println(a > 0 && a < Double.POSITIVE_INFINITY ? "nalezy do zbioru A" : "nie nalezy do zbioru A");
        System.out.println(a > Double.NEGATIVE_INFINITY && a < 1 ? "nalezy do zbioru B" : "nie nalezy do zbioru B");
        System.out.println(a > 0 && a < 1 ? "nalezy do zbioru C" : "nie nalezy do zbioru C");

    }

    public void task09 () {

        int wrt = 5;

        boolean nalezy = false;

        if ((-15 < wrt && wrt <= -10) || (-5 < wrt && wrt < 0) || (5 < wrt && wrt <= 10)) {
            if ((Double.NEGATIVE_INFINITY <= wrt && wrt <= -13) || (-8 < wrt && wrt <= -3)) {
                if (-4 <= wrt && wrt <= Double.POSITIVE_INFINITY) {
                    nalezy = true;
                }
            }
        }

        if (nalezy) {
            System.out.println(wrt + " należy do części wspólnej zbiorów A, B i C.");
        } else {
            System.out.println(+ wrt + " nie należy do części wspólnej zbiorów A, B i C.");
        }

    }

    public void task10 () {

        int wrt = 5;

        boolean nalezyDoA = (-15 < wrt && wrt < -10);
        boolean nalezyDoB = (Double.NEGATIVE_INFINITY <= wrt && wrt <= -13);

        if (nalezyDoA && !nalezyDoB) {
            System.out.println(wrt + " należy tylko do zbioru A");
        } else if (!nalezyDoA && nalezyDoB) {
            System.out.println(wrt + " należy tylko do zbioru B");
        } else {
            System.out.println(wrt + " nie należy tylko do jednego z podanych zbiorów");
        }

    }

}
