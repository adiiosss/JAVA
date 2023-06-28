package ITNPPJ.ZAD10;

public class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString() {
        return super.toString() + ", ilosc igiel: " + iloscIgiel + ", dlugosc szyszki: " + dlugoscSzyszki;
    }
}

class DrzewoLisciaste extends Drzewo {
    private int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public String toString() {
        return super.toString() + ", ksztalt liscia: " + ksztaltLiscia;
    }
}

class DrzewoOwocowe extends DrzewoLisciaste {
    private String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String toString() {
        return super.toString() + ", nazwa owoca: '" + nazwaOwoca + "'";
    }
}
