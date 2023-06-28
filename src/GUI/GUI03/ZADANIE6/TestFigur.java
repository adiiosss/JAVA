package GUI03.ZADANIE6;

public class TestFigur {

    public static void main(String[] args) {

        System.out.println();

        Figura p1 = new Kolo(10, 10, 5);
        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');

        // wywołanie metod z interfejsu Obliczenie
        System.out.println("Pole figury p1: " + p1.pole());
        System.out.println("Obwod figury p1: " + p1.obwod());
        System.out.println("Pole figury p2: " + p2.pole());
        System.out.println("Obwod figury p2: " + p2.obwod() + "\n");



        // wywołanie metody rysuj() z interfejsu Rysowanie
        ((Prostokat2) p2).rysuj();

        // wywołanie metod z interfejsu Transformacja
        Kolo2 k2 = new Kolo2(15, 20, 5);
        k2.przesunDo(50, 40);
        System.out.println(k2);
        k2.powrot();
        System.out.println(k2);

    }
}