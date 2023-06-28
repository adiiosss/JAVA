package PPJ14.TASK2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        int[] rzut = new int[2];
        int[] wszystkieRzuty = new int[2];
        Scanner in = new Scanner(System.in);

        boolean runMethod = true;
        while (runMethod = true) {
            String input = in.next();
            switch (input) {
                case "roll", "r":
                    for (int i = 0; i < rzut.length; i++) {
                        int max = 6;
                        int min = 1;
                        int roll = (int) (Math.random() * (max - min + 1) + min);
                        rzut[i] = roll;
                        rzut[i] = wszystkieRzuty[i];
                    }
                    break;
                case "show", "s":
                    System.out.println("throws");
                    for (int i = 0; i < wszystkieRzuty.length; i++) {
                        System.out.print(wszystkieRzuty[i]+", ");
                    }
                    break;
            }
        }

    }
}
