package PPJ07.Task3;

public class task3 {

    public static void main(String[] args) {

        double x = -4;

        if (x <= -15)
            System.out.println("B");

        else if (x >= 10)
            System.out.println("C");

        else if (x > 5)
            System.out.println("A,C");

        else if (x >= 0)
            System.out.println("C");

        else if (x > -3)
            System.out.println("A,C");

        else if (x <= 13)
            System.out.println("A,B");

        else if (x <= -10)
            System.out.println("A");

        else if (x < -8)
            System.out.println("Nie nalezy do zadnego z podanych zbiorow");

        else if (x < -5)
            System.out.println("B");

        else if (x < -4)
            System.out.println("A,B");

        else
            System.out.println("A,B,C");
    }

}
