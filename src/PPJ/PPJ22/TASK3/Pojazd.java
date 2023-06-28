package PPJ22.TASK3;

public class Pojazd {

    private String color;

    public Pojazd(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }

    public void setIloscOsi(int iloscOsi) {
        this.iloscOsi = iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    private int masa;

    public CiagnikSiodlowy(String color, int iloscOsi, int masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
    public void rozpocznijJazde(){
        if (masa/getIloscOsi() > 11){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }
        else{
            System.out.println("Jazda możliwa");
        }
    }
}

