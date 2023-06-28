package PPJ11.TASK5;

public class task5 {

    public static void main(String[] args) {

        long[] tab;

        tab = new long[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            System.out.println(tab[i] + "\t");
        }
        System.out.println();

        boolean inOrder = false;
        do{
            int indexFrom = (int)(Math.random()* tab.length);
            int indexTo = (int)(Math.random()* tab.length);
            long temp = tab[indexFrom];
            tab[indexFrom] = tab[indexTo];
            tab[indexTo] = temp;
            for (int i = 1; i < tab.length; i++) {
                if((tab[i-1] -1 == tab[i]) || (tab[i-1] +1 == tab[i])) {
                    inOrder = true;
                    break;
                }
            }
        }while (inOrder);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
    }
}
