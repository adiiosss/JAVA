package PPJ14.TASK4;

public class task4 {

    public static void main(String[] args) {

        int tab[][] = {
                {1, 2, 3 ,4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        for( int i = 0 , j = tab.length-1 ; i < j ; i++ , j-- )
        {

            for( int k = i ; k < j ; k++ )
            {
                System.out.print( tab[i][k] + " " ) ;
            }

            for( int k = i ; k < j ; k++ )
            {
                System.out.print(tab[k][j] + " ");
            }

            for( int k = j ; k > i ; k-- )
            {
                System.out.print(tab[j][k] + " ") ;
            }

            for( int k = j ; k > i ; k-- )
            {
                System.out.print( tab[k][i] + " " ) ;
            }

        }

    }

}
