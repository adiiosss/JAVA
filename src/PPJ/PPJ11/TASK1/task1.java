package PPJ11.TASK1;

public class task1 {

    public static void main(String[] args) {

        int min = 10;
        int max = 15;

        int [] tab;
        tab = new int [(int)(Math.random() * (max - min + 1) + min)];

        for(int i=0; i<tab.length; i++ ){
            tab [i] = i;
        }
        for (int i = 0; i < tab.length*2; i++) {
            int randomIndexFrom = (int) (Math.random() * tab.length);
            int randomIndexTo = (int) (Math.random() * tab.length);
            int temp = tab[randomIndexFrom];
            tab[randomIndexFrom] = tab[randomIndexTo];
            tab[randomIndexTo] = temp;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                char mark;
                if (i == tab[j])
                    mark = '*';
                else
                    mark = '.';
                System.out.print(mark + "\t");
            }
            System.out.println();
        }
    }
}

