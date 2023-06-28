package PPJ10.Task5;

public class task5 {

    public static void main(String[] args) {

        char[] tab = {'a' , 'b' , 'c' };
        int min = tab[0];

        for (int i = 0 ; i < tab.length ; i++) {
            if (tab[i] < min)
                min = tab[i];
        }
                    System.out.println((char)min);

        }




    }


