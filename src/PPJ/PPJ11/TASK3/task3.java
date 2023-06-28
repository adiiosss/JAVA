package PPJ11.TASK3;

public class task3 {

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};

        int i = 0;
        int j = 7;
        while(i < 4){
           if(tab[i] == tab[j]){
               System.out.println("true");
           }else System.out.println("false");
           i++;
           j--;
        }
    }
}


