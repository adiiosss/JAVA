package PPJ07.Task6;

public class task6 {

    public static void main (String []args){

        java.util.Scanner scanner = new java.util.Scanner (System.in ) ;
        int msc = scanner.nextInt();
        int rok = scanner.nextInt();

        if(msc == 1 || msc == 3 || msc == 5 || msc == 7 || msc == 8 || msc == 10 || msc == 12 ){
            System.out.println(31);}
                else if(msc == 2) {
            if ((rok % 4 == 0 && rok % 400 != 0))
                System.out.println(29);
            else
                System.out.println(28);
                }

                else if(msc == 4 || msc == 6 || msc == 9 || msc == 11){
            System.out.println(30);
        }






    }

}
