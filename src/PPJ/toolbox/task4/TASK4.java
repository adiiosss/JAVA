package toolbox.task4;

public class TASK4 {

    public static void main(String[] args) {

        int[][] tab = new int[3][3];

        ShowRandom2Darr(tab);

    }

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
}
