package PPJ13.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TASK1 {

    public static void main(String[] args) {

        /*int min = 2;
        int max = 10;

        int min2 = 1;
        int max2 = 3;

        int [] tab;
        tab = new int [(int)(Math.random() * (max - min) + min)];

        for(int i = 0; i <tab.length; i++){
            int temp = (int)(Math.random() * (max2 - min2 + 1) + min2);
            tab[i]=temp;
            System.out.print(tab[i] + "  ");
        }*/

        int [] tab = {1,1,2,3,3};

        System.out.println();
        System.out.println();

        int[] temp = new int[tab.length];
        int counter = 0;
        int prev = tab[0];
        temp[counter++] = prev;
        for(int i = 1; i<tab.length; i++){
            if(prev != tab[i])
                temp[counter++] = tab[i];
            prev=tab[i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] +"\t");
        }
        System.out.println();

        int[] result = new int[counter];

        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +"\t");
        }
        System.out.println();



    }

}
