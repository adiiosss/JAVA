package PPJ17.TASK4;

public class task4 {

    public static void main(String[] args) {
        char tabA[] = {'A','n','n','a'};
        inSideOut(tabA);
        System.out.println();
        char tabB[] = {'k','a','j','a','k'};
        inSideOut(tabB);
    }
    public static void inSideOut(char tab[]){
        int middleStop = tab.length/2-1;
        inSideOut(tab,0, middleStop);
        int middleStart = (tab.length)%2==0? tab.length/2 : tab.length/2+1;
        inSideOut(tab,middleStart, tab.length-1);
    }
    public static void inSideOut(char tab[], int start, int stop){
        if(start<=stop){
            System.out.print(tab[stop]);
            inSideOut(tab,start,--stop);
        }
    }
}


