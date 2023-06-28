package ITNPPJ.ZAD05;

public class s28122Set05 {

    public static void main(String[] args) {

        }

    public void Task01 (){

        int K = 987654321;
        String s = "";
        while (K != 0) {
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;

            System.out.println(s);
            System.out.println(K);
        }

        //rezultatem programu bedzie wynik reszty z dzielenia zmiennej K oraz kolejna wartosc tej zmiennej poprowadzona w pętli

    }


    public void Task02 (){

        int s = 0;
        /*for (int i = 0; i <= 10 ; i++) {
            s = s +1;
            System.out.println(s);
        }*/

        while(s <= 10){
            System.out.println(s++);
        }

    }


    public void Task03 (){

        int s = 0;

        while (s <= 10) {
            System.out.print(s++ + " ");
        }

        System.out.println();

        do{
            s++;
            System.out.println(s + " ");
        }while(s <= 10);

    }

    public void Task04 (){

        double szereg = 0;
        for (int i = 0; i <= 10  ; i++) {
            szereg = (double) (1 / Math.pow(2, i));
            System.out.println(szereg);
        }

    }

    public void Task05 (){

        int wrt = 2;
        double szereg = 0;
        for (int i = 0; i <= 10  ; i++) {
            szereg = (double) (1 / Math.pow(2, i));
            szereg = szereg * wrt;
            System.out.println(szereg);
        }

    }

    public void Task06 (){

        int min = -1500;
        int max = 1500;

        for (int i = min; i <= max; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

    }

    public void Task07(){

        String znak = "*";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }

    }

    public void Task08(){

        int direction = 0;
        String [] kierunki = {"NORTH", "WEAST" , "SOUTH", "EAST" };

        java.util.Scanner in = new java.util.Scanner(System.in);
        char value = in.next().charAt(0);


        while(value != 'Q'){

            if(value == 'D'){
                direction++;
                if(direction == kierunki.length)
                    direction = 0;
            }
            else if(value == 'A'){
                direction--;
                if(direction == -1)
                    direction = kierunki.length-1;
            }

            int strzalka = direction;

            if(strzalka == 0){
                System.out.println("\u2191");
            } else if (strzalka == 1) {
                System.out.println("\u2192");
            } else if (strzalka == 2) {
                System.out.println("\u2193");
            } else {
                System.out.println("\u2190");
            }

            System.out.println(kierunki[direction]);
            value = in.next().charAt(0);
        }

        System.out.println("PRORGAM ZOSTAL ZAKONCZONY");

    }

}

