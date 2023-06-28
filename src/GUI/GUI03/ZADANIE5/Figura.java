package GUI03.ZADANIE5;

public abstract class Figura {

    protected int x,y;   //są one dostępne w tym samym pakiecie i podklasach

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String nazwaFigury();

    public abstract void pozycja(int x, int y);

    @Override
    public String toString() {                                          //adnotacja do środka z wspolrzednymi x i y
        return nazwaFigury() + "\nŚrodek - (" + x + "," + y + ")";
    }
}

class Kolo extends Figura{

    private int promien;

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    @Override
    public String nazwaFigury() {   //adnotacja do nazwy figury
        return "Kolo";
    }

    @Override
    public void pozycja(int a, int b) {
        double odlegloscOdSrodka = Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));  //adnotacja do pozycji kwadratu (pitagoras)
        if (odlegloscOdSrodka <= promien) {
            System.out.println("Punkt (" + a + "," + b + ") znajduje się wewnątrz koła" + "\n");
        } else {
            System.out.println("Punkt (" + a + "," + b + ") znajduje się na zewnątrz koła" + "\n");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPromień - " + promien + "\n"; //adnotacja do naszego starego toString
    }
}

class Prostokat extends Figura {

    private int szerokosc, wysokosc;

    public Prostokat(int x, int y, int szerokosc, int wysokosc) {
        super(x, y);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    public String nazwaFigury() {   //adnotacja do nazwy prostokata
        return "Prostokat";
    }

    @Override
    public void pozycja(int a, int b) {
        if (a >= this.x && a >= this.x + szerokosc && b >= this.y && b >= this.y + wysokosc) {          //adnotacja do pozycji prostokata 4 boki
            System.out.println("Punkt (" + a + "," + b + ") znajduje się wewnątrz prostokąta" + "\n");
        } else {
            System.out.println("Punkt (" + a + "," + b + ") znajduje się na zewnątrz prostokąta" + "\n");
        }
    }

    @Override
    public String toString() {
        return nazwaFigury() +  "\nLewy górny - (" + x + "," + y + ")\nSzerokość: " + szerokosc + ", Wysokość: " + wysokosc + "\n";
    }
}