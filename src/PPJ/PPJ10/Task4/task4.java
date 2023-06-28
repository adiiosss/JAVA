package PPJ10.Task4;

public class task4 {

    public static void main(String[] args) {

        double[] tab = new double[10];


        System.out.println("\n\nPart1\n");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random();
        }

        System.out.println("\n\nPart2\n");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        System.out.println("\n\nPart3\n");
        for (int i = 0; i < tab.length; i += 2) {
            System.out.println(i + " -> " + tab[i]);
        }


        System.out.println("\n\nPart4\n");

        for (int i = 0; i < tab.length; i++) {
            if ((int)tab[i] % 2 == 1)
                System.out.println(i + " -> " + (int) tab[i]);
        }


    }
}
