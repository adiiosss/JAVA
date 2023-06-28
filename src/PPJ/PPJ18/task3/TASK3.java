package PPJ18.task3;

import java.util.Arrays;

public class TASK3 {

    public static void main(String[] args) {


        int[] tab = {9, 2, 4, 5, 3, 1, 8, 6, 7, 10};

        bubleSortIt(tab);

    }


    public static void bubleSortIt (int [] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

}
