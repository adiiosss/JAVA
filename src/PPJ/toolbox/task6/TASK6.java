package toolbox.task6;

import java.util.Arrays;

public class TASK6 {

    public static void main(String[] args) {


        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6, 7};
        int[] tab3 = {8, 9, 10, 11, 12};

        OneBigArray(tab1, tab2, tab3);

    }

    public static void OneBigArray(int[] arr1, int[] arr2, int[] arr3) {

        int length = arr1.length + arr2.length + arr3.length;

        int[] result = new int[length];

        int i = 0;

        for (int element : arr1) {
            result[i] = element;
            i++;
        }

        for (int element : arr2) {
            result[i] = element;
            i++;
        }

        for (int element : arr3) {
            result[i] = element;
            i++;
        }

        System.out.print("[");
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + ",");
            if (j != result.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }
}

