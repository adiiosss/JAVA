package PPJ19.TASK3;

public class Walec {

    private int promien;
    private int wysokosc;

    public Walec(){}{
        this.promien = 0;
        this.wysokosc = 0;
    }


    //v = pi * r * r * h
    //Pc=2Pp+Pb

    //Pp = pi * r * r
    //Pb = 2 * pi * r * h

    public void show(int r, int h){
        this.promien = r;
        this.wysokosc = h;

        int polePodstawy = (int)Math.PI * r * r;
        int poleBoczne = 2 * (int)Math.PI * r * h;

        int poleCalkowite = 2 * polePodstawy + poleBoczne;
        int objetosc = (int)Math.PI * r * r * h;

        System.out.println("Pole całkowite walca = " + poleCalkowite);
        System.out.println("Objetosc walca = " + objetosc);

    }


}
