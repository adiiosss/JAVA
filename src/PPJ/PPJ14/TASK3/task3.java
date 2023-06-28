package PPJ14.TASK3;

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {

        int size = 3;

        double minval = 1;
        double maxval = 5;

        int[][] tab = new int[size][size];

        double min = 0.2 * size;
        double max = 1.2 * size;

        double x = (double) (Math.random() * (max * min) + min);
        double y = (double) (Math.random() * (max * min) + min);

        System.out.println();
        System.out.println("twoja tablica:");
        System.out.println(Arrays.deepToString(tab));

        System.out.println();
        System.out.println("x = " + x);
        System.out.println("y =  " + y);

        boolean test1 = Arrays.asList(tab).contains(x);
        boolean test2 = Arrays.asList(tab).contains(y);

        System.out.println();

        if(test1){
            System.out.println("znajduje sie");
        }else{
            System.out.println("coordinate outside array range(x)");
        }

        if(test2){
            System.out.println("znajduje sie");
        }else{
            System.out.println("coordinates outside array range(y)");
        }


        }

    }

