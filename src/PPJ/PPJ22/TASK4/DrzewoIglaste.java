package PPJ22.TASK4;

class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugscSzyszki = dlugscSzyszki;
    }

    public int getIloscIgiel() {
        return iloscIgiel;
    }

    public void setIloscIgiel(int iloscIgiel) {
        this.iloscIgiel = iloscIgiel;
    }

    public double getDlugscSzyszki() {
        return dlugscSzyszki;
    }

    public void setDlugscSzyszki(double dlugscSzyszki) {
        this.dlugscSzyszki = dlugscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + " DrzewoIglaste{" +
                "iloscIgiel=" + iloscIgiel +
                ", dlugscSzyszki=" + dlugscSzyszki +
                '}';
    }
}

class DrzewoLisciaste extends Drzewo {
    private String ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public String getKsztaltLiscia() {
        return ksztaltLiscia;
    }

    public void setKsztaltLiscia(String ksztaltLiscia) {
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + " DrzewoLisciaste{" +
                "ksztaltLiscia='" + ksztaltLiscia + '\'' +
                '}';
    }
}

class DrzewoOwocowe extends DrzewoLisciaste {
    private String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String getNazwaOwoca() {
        return nazwaOwoca;
    }

    public void setNazwaOwoca(String nazwaOwoca) {
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + " DrzewoOwocowe{" +
                "nazwaOwoca='" + nazwaOwoca;
    }
}
