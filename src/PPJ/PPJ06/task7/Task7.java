package PPJ06.task7;

public class Task7 {
    public static void main (String[]args){

        java.util.Scanner scanner1 = new java.util.Scanner(System.in);
        int a = scanner1.nextInt ();

        System.out.println();

        java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        int b = scanner2.nextInt ();

        System.out.println();

        if(a > 0 & b > 0 ){
            System.out.println(a-b);
        }
        else{
            System.out.println(a+b);
        }



    }
}
