package GUI03.ZADANIE5;

public class TestFigur {

    public static void main(String[] args)
    {
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(10, 10, 5);                    // położenie koła = srodek = (10,10), promień = 5
        fig[1] = new Prostokat(20, 20, 15, 10);    // położenie prostokąta = lewy górny wierzchołek = (20,20), szerokość = 15, wysokość = 10

        // polimorficzne wywołanie metody toString() z klas Kolo/Prostokat,
        // a nie z klasy Figura

        for (Figura f : fig)              // pętla for-each
            System.out.println(f);    // System.out.println(f.toString());

        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);
    }


    /*

    TEKST DO WYSWIETLENIA

    Koło
    Środek - (10,10)
    Promień - 5

    Prostokąt
    Lewy górny - (20,20)
    Szerokość: 15, Wysokość: 10

    Punkt (12,12) znajduje się wewnątrz koła

    Punkt (25,30) znajduje się na zewnątrz prostokąta


    */

}