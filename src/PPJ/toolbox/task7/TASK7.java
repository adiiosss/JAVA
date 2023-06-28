package toolbox.task7;

public class TASK7 {

    public static void main(String[] args) {

        int a = 5;
        int b= 10;

        int c = (int) Math.pow(a, b);

        System.out.println(c);
        OperationTime(c);

    }

    public static void OperationTime(int x){

        int start = (int) System.nanoTime();
        int elapsed = (int) System.nanoTime() - start;

        System.out.println("Czas wykonania operacji: " + elapsed);
    }

}
