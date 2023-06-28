package GUI.GUI02.zadanie2;


abstract class Muzyk {

    private String imie;
    private double czas;

    // konstruktor  @
    protected Muzyk(String imie, double czas) {
        this.imie = imie;
        this.czas = czas;
    }

    // metoda getter @
    protected String imie() {
        return imie;
    }

    // metoda getter @
    protected double czas() {
        return czas;
    }

    // metody abstrakcyjne
    abstract protected String instrument();
    abstract protected double stawka();


    public String toString() {
        return this.imie + ", czas =  " +  this.czas() + "godz., stawka = " + this.stawka();
    }

    public static Muzyk maxHonorarium(Muzyk[] muzycy)
    {
        double max = muzycy[0].stawka() * muzycy[0].czas();
        Muzyk najwiekszy = muzycy[0];
        for (int i = 1; i < muzycy.length ; i++) {
            if (muzycy[i].stawka() * muzycy[i].czas() > max) {
                max = muzycy[i].stawka() * muzycy[i].czas();
                najwiekszy = muzycy[i];
            }
        }
        return najwiekszy;
    }

    }

// podklasa dziedzicząca po klasie abstrakcyjnej
class Flecista extends Muzyk {

    // konstruktor
    public Flecista(String imie, double czas) {
        super(imie , czas);
    }

    @Override
    public String instrument() {
        return "Flet";
    }

    @Override
    public double stawka() {
        return 300.0;
    }
}

class Wiolonczelista extends Muzyk {

    // konstruktor
    public Wiolonczelista(String imie, double czas) {
        super(imie , czas);
    }

    @Override
    public String instrument() {
        return "Wiolonczela";
    }

    @Override
    public double stawka() {
        return 250.0;
    }
}

class Skrzypek extends Muzyk {

    // konstruktor
    public Skrzypek(String imie, double czas) {
        super(imie , czas);
    }

    @Override
    public String instrument() {
        return "Skrzypce";
    }

    @Override
    public double stawka() {
        return 200.0;
    }
}




