package PPJ18.task2;

import java.util.Arrays;

public class TASK2 {

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        swap(tab,1,4);
    }
    public static void swap (int[]tab, int source, int destination){
        int temp = tab[source];
        tab[source] = tab[destination];
        tab[destination] = temp;
        System.out.print(Arrays.toString(tab));

    }


}
