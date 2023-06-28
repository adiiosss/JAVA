package PPJ14.TASK1;

public class task1 {

    public static void main(String[] args) {

            int min = 0;
            int max = 10;

            float[][] tab = new float[8][8];

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    float value = (float)(Math.random() * (max - min + 1) + min);
                    tab[i][j] = value;
                    System.out.print(tab[i][j] + ", ");
                }
                System.out.println();
            }

            float sumLeft = 0 ;
            float sumRight = 0 ;

            for (int i = 0, j = 0;  i < tab.length  ; i++,j++) {
                sumLeft += tab[i][j];
            }

            System.out.println();
            System.out.println("suma lewej:");
            System.out.println(sumLeft);

        for (int i = 0, j = 0;  i < tab.length  ; i++,j++) {
          sumRight+=tab[tab.length-1-i][j];
        }

        System.out.println();
        System.out.println("Suma prawej");
        System.out.println(sumRight);


        }

}
