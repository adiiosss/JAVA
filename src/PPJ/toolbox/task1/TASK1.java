package toolbox.task1;

public class TASK1 {

    public static void main(String[] args) {

        int a = 8;
        int b = 263;

        System.out.println(TypeOfNumber(a));
        System.out.println(TypeOfNumber(b));

    }

    public static int TypeOfNumber (int x) {

        if (x % 2 == 0) {
            System.out.print("Parzysta" + " - ");
        } else {
            System.out.print("Nieparzysta" + " - ");
        }
        return x;
    }
}
