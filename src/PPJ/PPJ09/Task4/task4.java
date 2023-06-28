package PPJ09.Task4;

public class task4 {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        System.out.println();

        for(int i = 1; i <= n ; i++){

            System.out.println((int)Math.pow(i, 2) + "\t" + + (int)Math.pow(i, 3) + "\t" + (int)Math.pow(i, 4));

        }

    }
}
