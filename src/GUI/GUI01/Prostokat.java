package GUI.GUI01;

class Prostokat {

    private int szerokosc, wysokosc;

    public Prostokat(int szerokosc, int wysokosc) {  //inicjalizuje pola klasy
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }


    public void rysuj() throws ProstokatException {
        System.out.println();
        System.out.println("Zwykly prostokat rozmiaru " + szerokosc + " x " + wysokosc);

        if (this.szerokosc < 1 || this.wysokosc < 1) {                          //WYJĄTEK
            throw new ProstokatException("Bledny prostokat!\n");
        }

    }
}

class ZProstokat extends Prostokat {

    private char border;
    private char inside;

    public char getBorder() {
        return border;
    }

    public char getInside() {
        return inside;
    }

    private static int prostokat = 1;
    private static int kwadrat = 1;


    private int num;


    public ZProstokat(int szerokosc, int wysokosc, char inside, char border) {
        super(szerokosc, wysokosc);  //pobiera zadeklraowane wartosci w klasie, odnosi sie do klasy nadrzednej
        this.inside = inside;
        this.border = border;

        if (getSzerokosc() != getWysokosc()) {
            num = prostokat++;
        } else {
            num = kwadrat++;
        }
    }

    public ZProstokat(int szerokosc, char inside, char border) {  //konsturktor delegujacy do konstruktora ZProstokat
        this(szerokosc, szerokosc, inside, border);

    }

    @Override
    public void rysuj() throws ProstokatException {

        int borderCounter = ((getSzerokosc() * 2) + ((getWysokosc() - 2) * 2));
        int insideCounter = (getSzerokosc() * getWysokosc()) - borderCounter;


       if(getWysokosc() == getSzerokosc()) {
            if(getInside() != getBorder())
                System.out.println("Kwadrat " + "(" + num + ")" + " rozmiaru " + getSzerokosc() + " x " + getSzerokosc() + //zwykly kwadrat, znaki sie nie powtarzaja
                        ", " + getInside() + " = " + insideCounter + ", " + getBorder() + " = " + borderCounter);
        }else{
            if(getWysokosc() == 1 || getSzerokosc() == 1 && getInside() != getBorder()){                            //WYJĄTEK
                System.out.println("Prostokat (" + num + ") rozmiaru " + getSzerokosc() + " x " + getWysokosc());
                throw new ProstokatException("Bledny prostokat!\n");

            }

            if(getInside() != getBorder())
                System.out.println("Prostokat (" + num + ") rozmiaru " + getSzerokosc() + " x " + getWysokosc() + ", " +   //zwykly prostokat, znaki sie nie powtarzaja
                        getInside() + " = " + insideCounter + ", " + getBorder() + " = " + borderCounter);
            else
                System.out.println("Prostokat (" + num + ") rozmiaru " + getSzerokosc() + " x " + getWysokosc() + ", " +
                        getBorder() + " = " + (insideCounter+borderCounter));                                               // -||-    znaki sie powtrzaja, wypisuje tylko jeden
        }


            for(int i = 0; i < getWysokosc(); i++) {
                for (int j = 0; j < getSzerokosc(); j++) {
                    if (i == 0 || j == 0 || i == getWysokosc() - 1 || j == getSzerokosc() - 1) {
                        System.out.print(border);
                    } else {
                        System.out.print(inside);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    class ProstokatException extends Exception {
        public ProstokatException(String msg) {
            super(msg);
        }

    }



