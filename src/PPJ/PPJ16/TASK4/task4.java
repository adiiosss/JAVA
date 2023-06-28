package PPJ16.TASK4;

public class task4 {

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 2;
        for (int i = 0; i < calculateSquares(a,b,c)[0].length; i++) {
            System.out.println(calculateSquares(a,b,c)[0][i]+","+calculateSquares(a,b,c)[1][i]);
        }
    }
    public static int[][] calculateSquares(int screenWidth, int screenHeigh, int side){
        int levelSquares = screenWidth/side;
        int vericalSquares = screenHeigh/side;
        int howManySquares = levelSquares*vericalSquares;
        int squares = 0;
        int[][] tab = new int[2][howManySquares];
        for (int i = 0, cordX = 1, cordY = 1; i < howManySquares; i++, cordX+=side) {
            if(squares == howManySquares/vericalSquares){
                cordX = 1;
                cordY += side;
                squares = 0;
            }
            tab[0][i] = cordX;
            tab[1][i] = cordY;
            squares += 1;
        }
        return tab;
    }

}
