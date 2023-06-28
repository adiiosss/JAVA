package PPJ09.Task5;

public class task5 {

    public static void main(String[] args) {

        char val1 = '.';
        char val2 = '*';

        int size = new java.util.Scanner(System.in).nextInt();
        int pictureSize = (2 * size + 1);

        for (int i  = 0 ; 1 < pictureSize; i++) {
            for (int j = 0; j < pictureSize; j++) {
                if ((i <= pictureSize / 2
                        && pictureSize / 2 - 1 <= j
                        && j  <= pictureSize / 2 + i)
                        || (i > pictureSize / 2
                        && pictureSize / 2 - (pictureSize  -  1 - i) <= j
                        && j <= pictureSize / 2 + (pictureSize - 1 - i)))
                System.out.println(val2 + "\t");
                else
                System.out.println(val1 + "\t");
            }
            System.out.println();

        }

    }

}
