package ITNPPJ.PROJEKT02;

import java.util.Scanner;

public class S28122_p02 {
    public static void main(String[] args) {

        System.out.println("\n     GRA - 'CHIŃCZYK'");
        System.out.println(); //wciecie z gory

        Gra gra = new Gra();
        gra.start();

        //gra.start(4, new int[][] {{'a',   3}, {'b',   6}, {'c',  22}, {'d',  31},}, new int[] {2}, new int[] {3});
    }
}

class Gra {
    public int kolejGracza;
    private Gracz[] gracze;
    char[] polaPlanszy = new char[40];
    int losowanie6;

    public Gra() {
        for (int i = 0; i < polaPlanszy.length; i++) {
            polaPlanszy[i] = 'x';
        }
        kolejGracza = 0;
    }

    private boolean wygranaGracza() {

        boolean wynik = false;

        for (int i = 0; i < gracze.length; i++) {
            if (gracze[i].pionkiWDomu == 4) wynik = true;
        }
        return wynik;
    }

    private char numerGracza_CHAR(int numerGracza) {

        char charGracza;

        switch (numerGracza) {
            case 0:
                charGracza = 'a';
                break;
            case 1:
                charGracza = 'b';
                break;
            case 2:
                charGracza = 'c';
                break;
            case 3:
                charGracza = 'd';
                break;
            default:
                charGracza = '!';
                System.out.println("BŁĄD");
                break;
        }
        return charGracza;
    }

    private int charGracza_NUMER(char charGracza) {

        int numerGracza = 404;

        switch (charGracza) {
            case 'a':
                numerGracza = 0;
                break;
            case 'b':
                numerGracza = 1;
                break;
            case 'c':
                numerGracza = 2;
                break;
            case 'd':
                numerGracza = 3;
                break;
            default:
                System.out.println("BŁĄD");
                break;
        }
        return numerGracza;
    }

    private void ruchGracza(int pole) {
        if (pole >= 40) {
            pole -= 40;
        }
        if (!((Character) polaPlanszy[pole]).equals('x') && gracze[charGracza_NUMER(polaPlanszy[pole])].pierwszePole == pole) {
            System.out.println("Ten ruch jest niedozwolony, bezpieczne pole gracza: " + polaPlanszy[pole]);
        } else {
            if (!((Character) polaPlanszy[pole]).equals('x')) {

                gracze[charGracza_NUMER(polaPlanszy[pole])].pionkiWBazie++;
            }
            polaPlanszy[pole] = numerGracza_CHAR(kolejGracza);
        }
    }

    private void pokazTure() {
        char grajacy = numerGracza_CHAR(kolejGracza);
        System.out.println("Aktulana tura gracza: " + grajacy);
    }

    private void pokazPlansze() {
        System.out.println("               0\n" +
                "   " + gracze[3].pole[0] + " " + gracze[3].pole[1] + "     " + polaPlanszy[38] + " " + polaPlanszy[39] + " "
                + polaPlanszy[0] + "     " + gracze[0].pole[0] + " " + gracze[0].pole[1] + "\n" +
                "   " + gracze[3].pole[2] + " " + gracze[3].pole[3] + "     " + polaPlanszy[37] + "   " + polaPlanszy[1] +
                "     " + gracze[0].pole[2] + " " + gracze[0].pole[1] + "\n" +
                "           " + polaPlanszy[36] + "   " + polaPlanszy[2] + "\n" +
                "           " + polaPlanszy[35] + "   " + polaPlanszy[3] + "\n" +
                "30 " + polaPlanszy[30] + " " + polaPlanszy[31] + " " + polaPlanszy[32] + " " + polaPlanszy[33] + " " +
                polaPlanszy[34] + "   " + polaPlanszy[4] + " " + polaPlanszy[5] + " " + polaPlanszy[6] + " " + polaPlanszy[7] + " " + polaPlanszy[8] + "\n" +
                "   " + polaPlanszy[29] + "                   " + polaPlanszy[9] + "\n" +
                "   " + polaPlanszy[28] + " " + polaPlanszy[27] + " " + polaPlanszy[26] + " " + polaPlanszy[25] + " " +
                polaPlanszy[24] + "   " + polaPlanszy[14] + " " + polaPlanszy[13] + " " + polaPlanszy[12] + " " + polaPlanszy[11] + " " + polaPlanszy[10] + " 10\n" +
                "           " + polaPlanszy[23] + "   " + polaPlanszy[15] + "\n" +
                "           " + polaPlanszy[22] + "   " + polaPlanszy[16] + "\n" +
                "   " + gracze[2].pole[0] + " " + gracze[2].pole[1] + "     " + polaPlanszy[21] + "   " + polaPlanszy[17] +
                "     " + gracze[1].pole[0] + " " + gracze[1].pole[1] + "\n" +
                "   " + gracze[2].pole[2] + " " + gracze[2].pole[3] + "     " + polaPlanszy[20] + " " +
                polaPlanszy[19] + " " + polaPlanszy[18] + "     " + gracze[1].pole[0] + " " + gracze[1].pole[1] + "\n" +
                "           20");
    }

    public void start() {

        gracze = new Gracz[4];

        for (int i = 0; i < gracze.length; i++) {
            gracze[i] = new Gracz(i);
            System.out.println("Nowy GRACZ o numerze: " + i);
        }

        System.out.println(); //wciecie

        kolejGracza = (int) (Math.random() * 4);
        pokazPlansze();

        System.out.println(); //wciecie

        int[][] kolorIPozycjaPionka = new int[16][2];

        int[] losowania = new int[gracze.length];

        for (int i = 0; i < losowania.length; i++) {
            losowania[i] = (int) (Math.random() * 6) + 1;
        }

        losowanie6 = 0;
        int[] ruchy_decyzje = new int[gracze.length];

        while (!wygranaGracza()) {
            for (int i = 0; i < kolorIPozycjaPionka.length; i++) {
                if (kolorIPozycjaPionka[i][0] != 0) {
                    polaPlanszy[kolorIPozycjaPionka[i][1]] = (char) kolorIPozycjaPionka[i][0];
                }
            }

            pokazTure();

            System.out.println();

            System.out.println("Wyrzucona liczba oczek: " + losowania[losowanie6] +
                    "\n1. Wprowadż numer pola, aby ruszyć poionkiem na nim stojącym");

            if (losowania[losowanie6] == 6) {
                System.out.println("2. Aby wyprowadzić pionka wpisz 007: ");
            }
            Scanner scan = new Scanner(System.in);
            ruchy_decyzje[0] = scan.nextInt();

            if (ruchy_decyzje[0] == 007) {
                ruchGracza(gracze[kolejGracza].pierwszePole);
                if (gracze[kolejGracza].pionkiWBazie > 0) {
                    gracze[kolejGracza].pionkiWBazie--;
                }
                pokazPlansze();
            } else {
                if (((Character) polaPlanszy[ruchy_decyzje[0]]).equals(numerGracza_CHAR(kolejGracza))) {
                    polaPlanszy[ruchy_decyzje[0]] = 'x';
                    if (ruchy_decyzje[0] < gracze[kolejGracza].pierwszePole && ruchy_decyzje[0] + losowania[losowanie6] >= gracze[kolejGracza].pierwszePole) {
                        gracze[kolejGracza].pionkiWDomu++;
                        System.out.println("Pionki w domu gracza:  " + numerGracza_CHAR(kolejGracza) + " -> " + gracze[kolejGracza].pionkiWDomu);
                    } else {
                        ruchGracza(ruchy_decyzje[0] + losowania[losowanie6]);
                    }
                } else {
                    System.out.println("Nie posiadasz pionka na tym polu, tracisz kolejke");
                }
                pokazPlansze();
                if (losowania[losowanie6] != 6) {
                    if (kolejGracza < 4 - 1) kolejGracza++;
                    else kolejGracza = 0;
                }
                if (losowanie6 >= losowania.length - 1) {
                    for (int i = 0; i < losowania.length; i++) {
                        losowania[i] = (int) (Math.random() * 6) + 1;
                    }
                    losowanie6 = 0;
                } else {
                    losowanie6++;
                }
            }
        }
        System.out.println("Koniec gry!");
    }

    public void start(int iloscGraczy, int[][] kolorIPozycjaPionka, int[] losowania, int[] ruchy_decyzje) {

        gracze = new Gracz[iloscGraczy];

        for (int i = 0; i < gracze.length; i++) {
            gracze[i] = new Gracz(i);
            System.out.println("Nowy GRACZ o numerze: " + i);
        }

        System.out.println(); //wciecie

        kolejGracza = (int) (Math.random() * iloscGraczy);
        pokazPlansze();

        System.out.println(); //wciecie

        int[][] kolorIPozycjaPionkaZmiennaPomocniczna = kolorIPozycjaPionka;

        losowania = new int[gracze.length];

        for (int i = 0; i < losowania.length; i++) {
            losowania[i] = (int) (Math.random() * 6) + 1;
        }

        losowanie6 = 0;

        ruchy_decyzje = new int[gracze.length];

        while (!wygranaGracza()) {
            for (int i = 0; i < kolorIPozycjaPionkaZmiennaPomocniczna.length; i++) {
                if (kolorIPozycjaPionkaZmiennaPomocniczna[i][0] != 0) {
                    polaPlanszy[kolorIPozycjaPionkaZmiennaPomocniczna[i][1]] = (char) kolorIPozycjaPionkaZmiennaPomocniczna[i][0];
                }
            }

            pokazTure();

            System.out.println();

            System.out.println("Wyrzucona liczba oczek: " + losowania[losowanie6] +
                    "\n1. Wprowadż numer pola, aby ruszyć poionkiem na nim stojącym");

            if (losowania[losowanie6] == 6) {
                System.out.println("2. Aby wyprowadzić pionka wpisz 007: ");
            }
            Scanner scan = new Scanner(System.in);
            ruchy_decyzje[0] = scan.nextInt();

            if (ruchy_decyzje[0] == 007) {
                ruchGracza(gracze[kolejGracza].pierwszePole);
                if (gracze[kolejGracza].pionkiWBazie > 0) {
                    gracze[kolejGracza].pionkiWBazie--;
                }
                pokazPlansze();
            } else {
                if (((Character) polaPlanszy[ruchy_decyzje[0]]).equals(numerGracza_CHAR(kolejGracza))) {
                    polaPlanszy[ruchy_decyzje[0]] = 'x';
                    if (ruchy_decyzje[0] < gracze[kolejGracza].pierwszePole && ruchy_decyzje[0] + losowania[losowanie6] >= gracze[kolejGracza].pierwszePole) {
                        gracze[kolejGracza].pionkiWDomu++;
                        System.out.println("Pionki w domu gracza:  " + numerGracza_CHAR(kolejGracza) + " -> " + gracze[kolejGracza].pionkiWDomu);
                    } else {
                        ruchGracza(ruchy_decyzje[0] + losowania[losowanie6]);
                    }
                } else {
                    System.out.println("Nie posiadasz pionka na tym polu, tracisz kolejke");
                }
                pokazPlansze();
                if (losowania[losowanie6] != 6) {
                    if (kolejGracza < iloscGraczy - 1) kolejGracza++;
                    else kolejGracza = 0;
                }
                if (losowanie6 >= losowania.length - 1) {
                    for (int i = 0; i < losowania.length; i++) {
                        losowania[i] = (int) (Math.random() * 6) + 1;
                    }
                    losowanie6 = 0;
                } else {
                    losowanie6++;
                }
            }
        }
        System.out.println("Koniec gry!");
    }


    // ================================================================================================================

    class Gracz {

        char[] pole;
        char znak;
        int pierwszePole;
        int pionkiWBazie;
        int pionkiWDomu;

        public Gracz(int numerGracza) {

            char[] znak = {'a', 'b', 'c', 'd'};
            pierwszePole = numerGracza * 10;

            if (numerGracza >= 0 && numerGracza < znak.length) {
                this.znak = znak[numerGracza];
            } else {
                System.out.println("BŁĄD: Gracz()");
                this.znak = ' ';
            }

            pole = new char[]{this.znak, this.znak, this.znak, this.znak};
            pionkiWBazie = 4;
            pionkiWDomu = 0;
        }
    }
}