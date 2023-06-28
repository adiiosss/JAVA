package toolbox.task3;

public class TASK3 {

    public static void main(String[] args) {

        double[] tab = new double[10];

        ShowRandomAscendingArr(tab);

    }

    public static void ShowRandomAscendingArr(double[] arr) {

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
    }

}

