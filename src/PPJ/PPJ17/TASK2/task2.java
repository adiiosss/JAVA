package PPJ17.TASK2;

public class task2 {
    static int count(int[] arr, int from, int what) {

        if (arr.length <= from)
            return 0;
        else
            return ((arr[from] == what) ? 1 : 0) + count(arr, from + 1, what);
    }


        public static void main (String[]args){

            int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};

            System.out.println("2 -> " + count(a, 0, 2));
            System.out.println("3 -> " + count(a, 0, 3));
        }
    }

