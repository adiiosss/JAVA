package PPJ12.task3;

import java.util.Random;

public class TASK3 {

    public static void main(String[] args) {


        boolean[] tab = new boolean[5];
        Random bool = new Random();

        for(int i=0 ; i<tab.length ; i++){
            for (int j=0; i <tab.length; i++) {
                tab[i] = bool.nextBoolean();
                tab[j] = bool.nextBoolean();

                System.out.println(tab[i]);
                System.out.println(tab[j]);

            }
        }

    }

}
