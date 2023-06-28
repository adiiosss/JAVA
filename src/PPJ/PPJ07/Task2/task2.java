package PPJ07.Task2;

public class task2 {
    public static void main(String[] args) {

        boolean allAbove;
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        System.out.println("\nTest 1\n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        allAbove = a>0.2 && b >0.2 && c >0.2;
        System.out.println(allAbove);

        a=b;
        b=c;
        c= Math.random();

        allAbove = a>0.2 && b >0.2 && c >0.2;
        System.out.println("\nTest 2\n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(allAbove);


        a=b;
        b=c;
        c= Math.random();

        allAbove = a>0.2 && b >0.2 && c >0.2;
        System.out.println("\nTest 3\n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(allAbove);
    }
}
