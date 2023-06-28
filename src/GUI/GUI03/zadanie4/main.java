package GUI.GUI03.zadanie4;

public class main {

    static public Speakable Method02(Speakable[] tab) {
        Speakable max = tab[0];
        String maxVal = tab[0].speak();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].speak().compareTo(maxVal) > 0) {   //compareTo(), ponieważ nie można porównywać napisów za pomocą operatora >
                maxVal = tab[i].speak();
                max = tab[i];
            }
        }
        return max;
    }



    static public Flyable Method01(Flyable[] tab) {
        Flyable min = tab[0];
        int minVal = 0;
        double minWartosc = tab[0].distance();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].distance() < minWartosc) {
                minWartosc = tab[i].distance();
                min = tab[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Bird ptak = new Bird("golab", 28, "kru");
        System.out.println(ptak);

        Plane samolot = new Plane("f-16", 15000,"siuuuuuuuuu");
        System.out.println(samolot);

        UFO kosmici = new UFO("world_destroyer", 20000000, "ziumzium");
        System.out.println(kosmici);

        Virus wirus = new Virus("covid", 1);
        System.out.println(wirus);

        System.out.println();

        System.out.println(Flyable.hybrid(samolot, kosmici));



        Flyable[] flyables = new Flyable[]{
                new Bird("sowa", 404, "kuku"),
                new Plane("boeing", 2342, "szussss"),
                new Virus("grypa", 5),
                new UFO("spaceship" , 222222, "zsisisisisis"),
                Flyable.hybrid(samolot, kosmici)
        };


        Speakable[] speakables = new Speakable[] {
                new Bird("papuga", 500, "co robisz"),
                new Plane("f-22", 2500, "whooosh"),
                new UFO("sokol milenium", 50000, "nuiuuu"),
                new Plane("sus-16", 6000, "wuwuwuwaaaaaaaaaaaaaaaaaaaaa")
        };


        System.out.println();

        System.out.println(Method01(flyables));
        System.out.println(Method02(speakables));


    }

}
