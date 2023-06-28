package PPJ24.TASK2;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("src/PPJ24/TASK2/zad1.txt");
            int sum = 0;
            int i = input.read();
            while(i != -1){
                System.out.print((char) i);
                if ( i >= '0' && i <= '9')
                sum += i - '0';
                i = input.read();
            }
            System.out.println();
            System.out.println("Sum of numbers: "+ sum);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
