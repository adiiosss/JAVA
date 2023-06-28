package TASK7;

public class task7 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int val = 0;
        int skaner = 0;
        int suma = 0;

        do{
            val++;
            System.out.println("wprowadz liczbe");
             skaner = scanner.nextInt();
            suma = suma + skaner;
        }while(skaner != 0);

        System.out.println("wprowadzonych liczb : "+val);
        System.out.println("ich suma : "+suma);

    }

}
