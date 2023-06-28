package JAVA.ZADANIA.PPJ11;

import java.util.Scanner;

public class DzielPrzezLiczbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę, przez którą chcesz podzielić: ");
        int dzielnik = scanner.nextInt();

        System.out.print("Podaj liczbę, którą chcesz podzielić: ");
        int dzielna = scanner.nextInt();

        try {
            int wynik = podziel(dzielna, dzielnik);
            System.out.println("Wynik dzielenia: " + wynik);
        } catch (ArithmeticException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static int podziel(int dzielna, int dzielnik) {
        if (dzielnik == 0) {
            throw new ArithmeticException("Dzielenie przez zero jest niedozwolone.");
        }

        return dzielna / dzielnik;
    }
}

