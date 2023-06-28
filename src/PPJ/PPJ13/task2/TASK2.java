package PPJ13.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class TASK2 {

    public static void main(String[] args) {

        int min = 2;
        int max = 10;

        int[] A = new int [5];          //Tablica A jest wypełniona wartościami w porządku rosnącym

        for (int i = 0; i <A.length; i++) {
            int temp = (int)(Math.random() * (max - min + 1) + min);
            A[i]=temp;
            Arrays.sort(A);

        }

        System.out.print(Arrays.toString(A));

        System.out.println();

        int[] B = new int [5];          //Tablica B wypełniona jest wartościam w porządku malejącym.

        for (int i = 0; i <B.length; i++) {
            int temp = (int)(Math.random() * (max - min + 1) + min);
            B[i]=temp;
            Arrays.sort(B);
        }

        int[] reverseSorted = IntStream.of(B).boxed()
                .sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        System.out.print(Arrays.toString(reverseSorted));

                                            /*tablica C z wartościami w porządku rosnącym przez połączenie (scalenie)
                                            elementów z tablic A i B.*/

        System.out.println();

       int[] C = new int[A.length + B.length];
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);

            Arrays.sort(C);
            System.out.print(Arrays.toString(C));

        }
    }