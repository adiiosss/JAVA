package TASK2;

public class task2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int delta = b*b-4*a*c;
        double x1 = ((-b) - Math.sqrt(delta))/(2*a);
        double x2 = ((-b) + Math.sqrt(delta))/(2*a);

        if(delta < 0 ){
            System.out.println("nie ma miejsc zerowych");
        }else if(delta == 0){
            System.out.println("jest jedno miejsce zerowe "+x1);
        }else if(delta > 0){
            System.out.println("sa 2 miejsca zerowe "+x1+ " i "+x2);
        }
    }

}
