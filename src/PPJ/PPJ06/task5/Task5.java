package PPJ06.task5;

public class Task5 {
    public static void main (String[]args){

        boolean czyPada = true;
        boolean czySwieciSlonce = true;

        if(czyPada && !czySwieciSlonce){
            System.out.println("plucha");
        }
        else if(czyPada && czySwieciSlonce){
            System.out.println("tecza");
        }
        else if(!czyPada && czySwieciSlonce) {
            System.out.println("słonecznie");
        }
        else
            System.out.println("pochmurno");

    }

}
