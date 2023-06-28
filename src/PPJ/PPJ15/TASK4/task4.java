package PPJ15.TASK4;

public class task4 {

    public static void main(String[] args) {

    }

    public static int FindMax(int[] a, int b, int c) {

        if (b == c) {
            return a[b];
        } else {
            int max = FindMax(a, b + 1, c);
            if (a[b] < max) {
                return max;
            } else {
                return a[b];
            }
        }
    }
}
