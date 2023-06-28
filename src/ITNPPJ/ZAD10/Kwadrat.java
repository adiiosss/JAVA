package ITNPPJ.ZAD10;

public class Kwadrat {

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public void show (){

        int pole = (int) Math.pow(bok, 2);
        int objetosc = (int) Math.pow(bok,3);

        System.out.println("POLE: " + pole);
        System.out.println("OBJETOSC: " + objetosc);
    }
}
