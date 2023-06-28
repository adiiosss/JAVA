package toolbox.TOOLBOX;

public class ToolBox {
    public static String arrToString(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(int[][] arr) {
        StringBuilder s = new StringBuilder();
        for (int[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static String arrToString(char[] arr) {
        StringBuilder s = new StringBuilder();
        for (char o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(char[][] arr) {
        StringBuilder s = new StringBuilder();
        for (char[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static String arrToString(byte[] arr) {
        StringBuilder s = new StringBuilder();
        for (byte o : arr) {
            s.append(o);
        }
        return s.toString();
    }

    public static String arrToString(byte[][] arr) {
        StringBuilder s = new StringBuilder();
        for (byte[] ints : arr) {
            s.append(arrToString(ints));
            s.append("\n");
        }
        return s.toString();
    }

    public static void showArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(int[][] arr) {
        System.out.println("{");
        for (int[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(double[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(double[][] arr) {
        System.out.println("{");
        for (double[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(float[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(float[][] arr) {
        System.out.println("{");
        for (float[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(char[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(char[][] arr) {
        System.out.println("{");
        for (char[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void showArr(byte[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
    }

    public static void showArr(byte[][] arr) {
        System.out.println("{");
        for (byte[] elements : arr) {
            showArr(elements);
        }
        System.out.println("}");
    }

    public static void sortArrAscending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(float[] arr) {
        //selection sort;
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrAscending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            byte temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(double[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            double temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(char[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            char temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(float[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            float temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void sortArrDescending(byte[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            byte temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int getIntRandomNumber(int min, int max) {
        //range [min, max]
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] getInt1DArr(int length) {
        int[] arr = new int[length];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            arr[i] = counter++;
        }
        return arr;
    }

    public static int[][] getInt2DArr(int rows, int columns) {
        int[][] arr = new int[rows][columns];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
            }
        }
        return arr;
    }

    //moje metody


    //parzysta i nieparzysta
    public static int TypeOfNumber(int x) {

        if (x % 2 == 0) {
            System.out.print("Parzysta" + " - ");
        } else {
            System.out.print("Nieparzysta" + " - ");
        }
        return x;
    }


    //suma dwóch
    public static int Suma(int x, int y) {
        int s;
        s = x + y;
        return s;

    }


    //Randomowa rosnaca tablica

    public static double ShowRandomAscendingArr(double[] arr) {

        int min = 0;
        int max = 10;

        for (int i = 0; i < arr.length; i++) {
            double value = Math.random() * (max - min + 1) + min;
            arr[i] = value;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%.2f", arr[i]);
            if (i != arr.length - 1)
                System.out.print("\t");
        }
        System.out.println("]");
        return 0;
    }

    //randomowa 2d

    public static void ShowRandom2Darr(int[][] arr) {

        int min = 0;
        int max = 10;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = (int) (Math.random() * (max - min + 1) + min);
                arr[i][j] = value;
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();

        }
    }

        public static void OneBigArray ( int[] arr1, int[] arr2, int[] arr3){

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


