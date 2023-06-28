package ppj24.task3;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try{
            PrintWriter writer1 = new PrintWriter(new FileOutputStream("src/PPJ24/TASK3/inputData1.txt", true));
            PrintWriter writer2 = new PrintWriter(new FileOutputStream("src/PPJ24/TASK3/inputData2.txt", true));
            int[] tab1 = new int[10];
            int[] tab2 = new int[10];
            for (int i = 0; i < tab1.length; i++) {
                int min = 0;
                int max = 10000;
                int number1 = (int)(Math.random() * (max - min + 1) + min);
                int number2 = (int)(Math.random() * (max - min + 1) + min);
                tab1[i] = number1;
                tab2[i] = number2;
            }
            for (int i = 0; i < tab1.length; i++) {
                for (int j = i; j < tab1.length; j++) {
                    if(tab1[i] > tab1[j]) {
                        int temp = tab1[i];
                        tab1[i] = tab1[j];
                        tab1[j] = temp;
                    }
                }
            }for (int i = 0; i < tab2.length; i++) {
                for (int j = i; j < tab2.length; j++) {
                    if(tab2[i] > tab2[j]) {
                        int temp = tab2[i];
                        tab2[i] = tab2[j];
                        tab2[j] = temp;
                    }
                }
            }

            for (int i = 0; i < tab1.length; i++) {
                writer1.println(tab1[i]);
                writer2.println(tab2[i]);
            }
        writer1.close();
        writer2.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
