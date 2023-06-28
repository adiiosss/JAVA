package PPJ10.Task1;

public class task1 {

    public static void main(String[] args) {

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

            System.out.println(kierunki[direction]);
            value = in.next().charAt(0);
        }

        System.out.println("PRORGAM ZOSTAL ZAKONCZONY");


    }

}
