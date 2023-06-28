package ITNPPJ.ZAD10;

public class Trojkat {
    private double dlugoscBoku;

    public Trojkat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public double getDlugoscBoku() {
        return dlugoscBoku;
    }

    public double getPole(){
        return (Math.sqrt(3) / 4) * dlugoscBoku * dlugoscBoku;
    }

    public void show() {
        double pole = (Math.sqrt(3) / 4) * dlugoscBoku * dlugoscBoku;
        System.out.println("POLE TROJKATA ROWNOBOCZNEGO: " + pole);
    }
}

class Ostroslup extends Trojkat {
    private double wysokosc;

    public Ostroslup(double dlugoscBoku, double wysokosc) {
        super(dlugoscBoku);
        this.wysokosc = wysokosc;
    }

    public void showOstroslup() {
        super.show();
        double polePodstawy = getPole();
        double polePowierzchniBocznej = 3 * getDlugoscBoku() * wysokosc / 2;
        double polePowierzchniCałkowitej = polePodstawy + polePowierzchniBocznej;
        double objetosc = (Math.sqrt(2) / 12) * getDlugoscBoku() * getDlugoscBoku() * wysokosc;
        System.out.println("POLE PODSTAWY: " + polePodstawy);
        System.out.println("POLE POWIERZCHNI BOCZNEJ: "  + polePowierzchniBocznej);
        System.out.println("Całkowite pole powierzchni ostrosłupa: " + polePowierzchniCałkowitej);
        System.out.println("Objętość ostrosłupa: " + objetosc);
    }
}

class Graniastoslup extends Trojkat {
    private double wysokosc;

    public Graniastoslup(double dlugoscBoku, double wysokosc) {
        super(dlugoscBoku);
        this.wysokosc = wysokosc;
    }

    public void showGraniastoslup() {
        super.show();
        double polePodstawy = getPole();
        double polePowierzchniBocznej = 6 * getDlugoscBoku() * wysokosc / 2;
        double polePowierzchniCałkowitej = polePodstawy + polePowierzchniBocznej;
        double objetosc = (Math.sqrt(3) / 4) * getDlugoscBoku() * getDlugoscBoku() * wysokosc;
        System.out.println("POLE PODSTAWY: " + polePodstawy);
        System.out.println("POLE POWIERZCHNI BOCZNEJ: "  + polePowierzchniBocznej);
        System.out.println("POLE POWIERZCHNI CALKOWITEJ: " + polePowierzchniCałkowitej);
        System.out.println("OBJETOSC: " + objetosc);
    }
}