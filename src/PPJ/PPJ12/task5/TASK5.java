package PPJ12.task5;

public class TASK5 {

    public static void main(String[] args) {

        int[] arr = {153, 333, 370, 515, 407, 80};

        for (int i = 0; i < arr.length; i++) {

                int rem = i % 10;
                int check = 0 + (int) Math.pow(rem, 3);
                i = i / 10;

                if (check == i)
                    System.out.println(arr[i]);


            }
        }
    }