package PPJ17.TASK5;

public class task5 {

    public static void main(String[] args) {
        int size = 8;
        int[][] arr = new int[size][size];
        fillArr(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void fillArr(int[][] arr){
        fillArr(arr,0, arr.length-1, 0, arr[0].length-1,1);
    }
    public static void fillArr(int[][] arr, int rowStart, int rowStop, int columnStart, int columnStop, int number){
        for (int i = rowStart; i <= rowStop; i++) {
            for (int j = columnStart; j <= columnStop ; j++) {
                arr[i][j] = number;
            }
        }
        rowStart++;
        rowStop--;
        columnStart++;
        columnStop--;
        if ((rowStart <= rowStop && columnStart <= columnStop))
            fillArr(arr, rowStart, rowStop, columnStart, columnStop, ++number);
    }
}


