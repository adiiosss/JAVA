package PPJ16.TASK1;

public class task1 {

    public static void main(String[] args) {

        int[][] tab1 = {{1,2,3},{2,2},{1,1,2}};
        int[][] tab2 = {{1,2,3},{2,2},{1,1,2}};
        System.out.println(jestRowna(tab1,tab2));
    }
    public static boolean jestRowna(int[][] x, int[][] y){
        if(x.length != y.length){
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if(x[i].length != y[i].length){
                return false;
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if(x[i][j] != y[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}