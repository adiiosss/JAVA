package ITNPPJ.ZAD10;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public double getPole(){
        return dlugosc * szerokosc;
    }

    public void show() {
        double pole = dlugosc * szerokosc;
        System.out.println("POLE PROSTOKATA: " + pole);
    }
}
 class Prostopadloscian extends Prostokat {
    private double wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        super(dlugosc, szerokosc);
        this.wysokosc = wysokosc;
    }

    public void showProstopadloscian() {
        super.show();
        double polePowierzchniBocznej = 2 * (getDlugosc() * wysokosc + getSzerokosc() * wysokosc);
        double polePowierzchniCałkowitej = 2 * getPole() + polePowierzchniBocznej;
        double objetosc = getPole() * wysokosc;
        System.out.println("POLE POWIERZCHNI BOCZNEJ: " + polePowierzchniBocznej);
        System.out.println("POLE POWIERZCHNI CALKOWITEJ: " + polePowierzchniCałkowitej);
        System.out.println("OBJETOSC: " + objetosc);
    }
}



