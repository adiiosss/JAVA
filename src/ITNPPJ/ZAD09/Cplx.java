package ITNPPJ.ZAD09;

public class Cplx {

    private double rzeczywiste;
    private double urojone;

    public Cplx(double rzeczywiste, double urojone) {
        this.rzeczywiste = rzeczywiste;
        this.urojone = urojone;
    }

    public Cplx add(Cplx dodawanie) {
        double nowaRzeczywsita = rzeczywiste + dodawanie.rzeczywiste;
        double nowaUrojona = urojone + dodawanie.urojone;
        return new Cplx(nowaRzeczywsita, nowaUrojona);
    }

    public Cplx sub(Cplx odejmowanie) {
        double nowaRzeczywsita = rzeczywiste - odejmowanie.rzeczywiste;
        double nowaUrojona = urojone - odejmowanie.urojone;
        return new Cplx(nowaRzeczywsita, nowaUrojona);
    }

    public Cplx mul(Cplx mnozenie) {
        double nowaRzeczywsita = rzeczywiste * mnozenie.rzeczywiste;
        double nowaUrojona = urojone * mnozenie.urojone;
        return new Cplx(nowaRzeczywsita, nowaUrojona);
    }

    public void inc() {
        rzeczywiste++;
    }

    public void show() {
        System.out.println(rzeczywiste + " + " + urojone + "i");
    }

    public static void main(String[] args) {

        Cplx example1 = new Cplx(1, 2);
        Cplx example2 = new Cplx(5, -3);
        Cplx example3 = new Cplx(8, 10);

        System.out.println("EXAMPLE 1");

        //dodawanie - example1
        Cplx result1_example1 = example1.add(example1);
        result1_example1.show();

        //odejmowanie - example1
        Cplx result2_example1 = example1.sub(example1);
        result2_example1.show();

        //mnozenie - example1
        Cplx result3_example1 = example1.mul(example1);
        result3_example1.show();

        //dodaj o jeden - example1
        example1.inc();
        example1.show();

        System.out.println();

        System.out.println("EXAMPLE 2");

        //dodawanie - example2
        Cplx result1_example2 = example2.add(example2);
        result1_example2.show();

        //odejmowanie - example2
        Cplx result2_example2 = example2.sub(example2);
        result2_example2.show();

        //mnozenie - example2
        Cplx result3_example2 = example2.mul(example2);
        result3_example2.show();

        //dodaj o jeden - example2
        example2.inc();
        example2.show();

        System.out.println();

        System.out.println("EXAMPLE 3");

        //dodawanie - example3
        Cplx result1_example3 = example3.add(example3);
        result1_example3.show();

        //odejmowanie - example3
        Cplx result2_example3 = example3.sub(example3);
        result2_example3.show();

        //mnozenie - example3
        Cplx result3_example3 = example3.mul(example3);
        result3_example3.show();

        //dodaj o jeden - example3
        example3.inc();
        example3.show();
    }
}
