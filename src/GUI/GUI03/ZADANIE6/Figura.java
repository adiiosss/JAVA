package GUI03.ZADANIE6;

interface Obliczenie {
    double pole();
    double obwod();
}

interface Rysowanie {
    void rysuj();
}
interface Transformacja {
    void przesunDo(int x, int y);
    void powrot();
}

public abstract class Figura implements Obliczenie {
    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void rysuj();

    public void pozycja(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return getClass().getName() + " - Pole: " + pole() + ", Obwod: " + obwod();   //metoda pokazujaca pole i obwod figury
    }
}

class Kolo extends Figura {

    private int promien;

    public Kolo(int x, int y, int promien) {
        super(x, y);
        this.promien = promien;
    }

    public int getPromien() {           //getter zwracajacy promien
        return promien;
    }

    public double pole() {
        return Math.PI * promien * promien;  //wzor na pole kola
    }

    public double obwod() {
        return 2 * Math.PI * promien;    //wzor na obwod kola
    }

    public void rysuj() {}

}

class Prostokat extends Figura implements Rysowanie {
    protected double szerokosc;
    protected double wysokosc;

    public Prostokat(int x, int y, double a, double b) {
        super(x, y);
        this.szerokosc = a;
        this.wysokosc = b;
    }

    public double pole() {
        return szerokosc * wysokosc;  //pole prostokata
    }

    public double obwod() {
        return 2 * szerokosc + 2 * wysokosc;   //obwod prostokata
    }

    public void rysuj() {
        System.out.println("Rysowanie prostokąta o lewym górnym rogu (" + x + ", " + y + ") i wymiarach " + szerokosc + " x " + wysokosc);
    }
}

class Prostokat2 extends Prostokat implements Rysowanie {
    protected char znak;

    public Prostokat2(int x, int y, double a, double b, char znak) {
        super(x, y, a, b);
        this.znak = znak;
    }

    public void rysuj() {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Kolo2 extends Kolo implements Transformacja {
    private int x, y;  // aktualna pozycja środka koła przed przesunięciem
    private int oldX, oldY;  // poprzednia pozycja środka koła

    public Kolo2(int x, int y, int promien) {
        super(x, y, promien);
        this.x = x;
        this.y = y;
        this.oldX = x;
        this.oldY = y;
    }

    @Override
    public void przesunDo(int x, int y) {
        oldX = this.x;
        oldY = this.y;
        this.x = x;
        this.y = y;
    }

    @Override
    public void powrot() {
        this.x = oldX;
        this.y = oldY;
    }

    @Override
    public String toString() {
        return "Kolo\nSrodek - (" + x + "," + y + ")\nPromien - " + getPromien() + "\n";
    }
}


