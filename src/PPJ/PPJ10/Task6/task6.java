package PPJ10.Task6;

import java.util.Random;

public class task6 {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);

        char[] value = new char[5];
        Random random = new Random();

        int suma = 0;

        for (int i = 0; i < value.length; i++) {
            value[i] = (char) (random.nextInt(90 - 65 + 1) + 65);
            System.out.println(value[i]);
        }

        char c = in.next().charAt(0);


        for (int i = 0; i < value.length; i++) {
            if (c == value[i])
                suma++;

        }


        System.out.println();


            if (suma == 1) {
                    System.out.println("element występuje " + suma + " raz");
                } else {
                    System.out.println("element występuje " + suma + " razy");
                }

        }
    }
