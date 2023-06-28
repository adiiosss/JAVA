package PPJ16.TASK2;

import java.util.Arrays;

public class tasak2 {

    public static void main(String[] args) {

        int a = 252547;
        System.out.println(splitToDigits(a));
    }
    public static String splitToDigits(int x) {
        int size = 0;
        int temp = x;
        while(temp >= 1){
            temp /= 10;
            size++;
        }
        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {
            tab[i] = x%10;
            x/=10;
        }
        return Arrays.toString(tab);
    }
}


