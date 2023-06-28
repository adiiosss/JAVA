package PPJ22.TASK4;

class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public boolean isWiecznieZielone() {
        return wiecznieZielone;
    }

    public void setWiecznieZielone(boolean wiecznieZielone) {
        this.wiecznieZielone = wiecznieZielone;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String getPrzekrojDrzewa() {
        return przekrojDrzewa;
    }

    public void setPrzekrojDrzewa(String przekrojDrzewa) {
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa + '\'' +
                '}';
    }
}

