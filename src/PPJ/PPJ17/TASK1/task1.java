package PPJ17.TASK1;

import toolbox.TOOLBOX.ToolBox;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {

        int tab[][] = {

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 5, 3},
                {8, 6, 4, 2},
        };


        rotateMatrix(tab);
        ToolBox.showArr(tab);
    }

    static void rotateMatrix(int[][] a) {

        /*int[][] pivot = new int[a[0].length][];
        for (int row = 0; row < a[0].length; row++)
            pivot[row] = new int[a.length];

        for (int row = 0; row < a.length; row++)
            for (int col = 0; col < a[row].length; col++)
                pivot[col][row] = a[row][col];

        for (int row = 0; row < pivot.length; row++)
            System.out.println(Arrays.toString(pivot[row]));*/

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0, k = a.length - 1; j < a[i].length / 2; j++, k--) {
                int temp = a[i][k];
                a[i][k] = a[i][j];
                a[i][j] = temp;
            }
        }
    }
}
