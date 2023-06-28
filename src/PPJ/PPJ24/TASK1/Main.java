package PPJ24.TASK1;

import java.io.BufferedReader;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        try {
            int[] characterCount = new int[256];
            FileInputStream input = new FileInputStream("src/PPJ24/TASK1/readTest.txt");
            int i = input.read();
            while(i != -1){
                char character = (char) i;
                characterCount[(int) character]++;
                System.out.print((char)i);
                i = input.read();
            }

            System.out.println();
            System.out.println();


            for (int j = 0; j < characterCount.length; j++) {
                if(characterCount[j] != 0)
                    System.out.println("Char: " + ((char)j) + " count: "+ characterCount[j]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
