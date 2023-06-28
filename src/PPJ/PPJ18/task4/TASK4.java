package PPJ18.task4;

import java.util.Arrays;

public class TASK4{

    public static void main(String[] args) {

        System.out.println("Wait...");
        System.out.println(TASK4.fiboR(45));
        System.out.println(TASK4.fiboI(45));
        System.out.println(TASK4.factR(12));
        System.out.println(TASK4.factI(12));
        System.out.println(TASK4.gcdR(12125,40643));
        System.out.println(TASK4.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
        System.out.println("Max : " + TASK4.maxElem(a,0));
        System.out.println("Num even: " + TASK4.numEven(a,0));
        System.out.println("Before: " + Arrays.toString(a));
        TASK4.reverse(a,0);
        System.out.println("After : " + Arrays.toString(a));
        System.out.println("Is ’radar’ a palindrom? " +
                TASK4.isPalindrom("radar"));
        System.out.println("Is ’abba’ a palindrom? " +
                TASK4.isPalindrom("abba"));
        System.out.println("Is ’rover’ a palindrom? " +
                TASK4.isPalindrom("rover"));

    }
    public static int fiboR(int n){
        if(n>=0 && n<2)
            return n;
        else
            return fiboR(n-1)+fiboR(n-2);
    }
    public static int fiboI(int n){
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = b;
            b+=a;
            a = temp;
        }
        return a;
    }

    public static int factR(int n){
        if(n <= 1)
            return 1;
        return n * factR(n-1);
    }

    public static int factI(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int gcdR(int a, int b){
        if (b != 0)
            return gcdR(b, a % b);
        else
            return a;
    }

    public static int gcdI(int a, int b){
        for (int i = Math.min(a,b); i >= 1; i--) {
            if(a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }

    public static int maxElem(int[] arr, int from){
        if(from==arr.length-1)
            return arr[arr.length-1];
        return Math.max(arr[from], maxElem(arr,++from));
    }

    public static int numEven(int[] arr, int from){
        if(from>arr.length-1)
            return 0;
        return (arr[from]%2==0? 1 : 0) + numEven(arr,++from);
    }

    public static void reverse(int[] a, int i) {
        if(i>a.length/2)
            return ;
        int temp = a[i];
        a[i] = a[a.length-1-i];
        a[a.length-1-i] = temp;
        reverse(a,++i);
    }

    public static boolean isPalindrom(String s) {
        if(s.length()<2){
            return true;
        }else {
            if(s.charAt(0) != s.charAt(s.length()-1))
                return false;
            return isPalindrom(s.substring(1,s.length()-1));
        }
    }
}
