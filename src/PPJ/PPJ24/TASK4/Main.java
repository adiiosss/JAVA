package ppj24.task4;

import java.io.FileInputStream;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try{
            FileReader fr1 = new FileReader("src/PPJ24/TASK3/inputData1.txt");
            FileReader fr2 = new FileReader("src/PPJ24/TASK3/inputData2.txt");
            int[] tab1 = new int[10];
            int[] tab2 = new int[10];
            int i1 = fr1.read();
            int i2 = fr2.read();
            while((i1 = fr1.read()) != -1){
                System.out.println((char)i1);
            }while((i2 = fr2.read()) != -1){
                System.out.println((char)i2);
            }
            fr1.close();
            fr2.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
