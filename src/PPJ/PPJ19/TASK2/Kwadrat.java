package PPJ19.TASK2;

public class Kwadrat {

    private int blok;


    public Kwadrat(){
        this.blok = 0;
    }

    public void show(int a){
        this.blok = a;
        int pole = a * a;
        int objetosc = a * a * a;

        System.out.println("Pole kwadratu - " + pole);
        System.out.println("Objtosc - " + objetosc);

    }

}


