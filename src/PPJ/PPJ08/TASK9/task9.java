package TASK9;

public class task9 {

    public static void main (String[]args){

        int day = 28;
        int month = 10;
        int suma = 0;
        int i = 1;

        while(month > i){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                suma += 31;
            }else if(i == 2){
                suma += 28;
            }else{
                suma += 30;
            }
            i++;
        }
        suma += day;
        System.out.println("Od poczatku roku minelo: "+suma);



    }



}
