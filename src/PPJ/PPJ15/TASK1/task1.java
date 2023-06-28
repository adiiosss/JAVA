package PPJ15.TASK1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class task1 {

    public static void main(String[] args) {

        int [][] tab = {
                {1 , 0 , 0 , 0 , 0} ,
                {0 , 1 , 0 , 0} ,
                {0 , 0 , 1}
                };

        System.out.println("DWUWYMIAROWA:");
        System.out.println(Arrays.deepToString(tab));

        int[] array = Stream.of(tab)
                .flatMapToInt(IntStream::of)
                .toArray();

        System.out.println("JEDNOWYMIAROWA");
        System.out.print(Arrays.toString(array));

    }

}
