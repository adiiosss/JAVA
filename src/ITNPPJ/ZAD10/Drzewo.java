package ITNPPJ.ZAD10;

public class Drzewo {
    private boolean wiecznieZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString() {
        return "wiecznie zielone: " + wiecznieZielone + ", wysokosc: " + wysokosc + ", przekroj dzrzewa: " + przekrojDrzewa;
    }
}
