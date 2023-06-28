package PPJ16.TASK3;

public class task3 {

    public static void main(String[] args) {
        int a = 153;
        System.out.println(isArmstrongNumber(a));
    }
    public static boolean isArmstrongNumber(int x){
        int size = 0;
        int temp = x;
        while(temp >= 1){
            temp /= 10;
            size++;
        }
        temp = x;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Math.pow((temp%10),size);
            temp/=10;
        }
        if(sum != x) {
            return false;
        }
        return true;
    }
}


