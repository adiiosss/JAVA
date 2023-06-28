package PPJ06.task2;

public class Task2 {
    public static void main (String[]args){

        int n = 13;
        int a = 15;
        int b = 17;
        boolean nIsPrime = true;
        boolean aIsPrime = true;
        boolean bIsPrime = true;

        int x = 1;

        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;
        if (n % ++x == 0 && x <= Math.sqrt(n))
            nIsPrime = false;

        x = 1;


        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime = false;
        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime= false;
        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime = false;
        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime = false;
        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime = false;
        if (a % ++x == 0 && x <= Math.sqrt(a))
            aIsPrime = false;

        x = 1;

        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;
        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;
        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;
        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;
        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;
        if (b % ++x == 0 && x <= Math.sqrt(b))
            bIsPrime = false;

        System.out.println(n + (nIsPrime ? " is prime" : " is not prime"));
        System.out.println(a + (aIsPrime ? " is prime" : " is not prime"));
        System.out.println(b + (bIsPrime ? " is prime" : " is not prime"));

    }
}
