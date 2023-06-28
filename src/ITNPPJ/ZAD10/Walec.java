package ITNPPJ.ZAD10;

public class Walec {

    private int promien;
    private int wysokosc;

    public Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show (){

        int polePodstawy = (int) (Math.PI * promien * promien);
        int objetosc = polePodstawy * wysokosc;

        System.out.println("POLE PODSTAWY: " + polePodstawy);
        System.out.println("OBJETOSC: " + objetosc);

    }
}
