package PPJ09.Task2;

public class task2 {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);
        double pln = in.nextDouble();

        double il_dwusetek=0, ilosc_setek=0, il_piecdziesiatek=0,il_dwudziestek=0, il_dziesiatek=0,
                il_piatek=0, il_dwojek=0, il_jedynek=0, il_gr50=0, il_gr20=0, il_gr10=0, il_gr05=0,
                il_gr02=0, il_gr01=0;

        System.out.println("Twoja kwota to " + pln + " zł");

        while(pln >= 200.0)
        {
            il_dwusetek += 1;
            pln = pln - 200.0;
        }

        while(pln >= 100.0)
        {
            ilosc_setek += 1;
            pln = pln - 100.0;
        }

        while(pln >= 50.0)
        {
            il_piecdziesiatek += 1;
            pln = pln - 50.0;
        }

        while(pln >= 20.0)
        {
            il_dwudziestek += 1;
            pln = pln - 20.0;
        }

        while(pln >= 10.0)
        {
            il_dziesiatek += 1;
            pln = pln - 10.0;
        }

        while(pln >= 5.0)
        {
            il_piatek += 1;
            pln = pln - 5.0;
        }

        while(pln >= 2.0)
        {
            il_dwojek += 1;
            pln = pln - 2.0;
        }

        while(pln >= 1.0)
        {
            il_jedynek += 1;
            pln = pln - 1.0;
        }

        while(pln >= 1.0)
        {
            il_jedynek += 1;
            pln = pln - 1.0;
        }

        while(pln >= 0.5)
        {
            il_gr50 += 1;
            pln = pln - 0.5;
        }

        while(pln >= 0.2)
        {
            il_gr20 += 1;
            pln = pln - 0.2;
        }

        while(pln >= 0.1)
        {
            il_gr10 += 1;
            pln = pln - 0.1;
        }

        while(pln >= 0.05)
        {
            il_gr05 += 1;
            pln = pln - 0.05;
        }

        while(pln >= 0.02)
        {
            il_gr02 += 1;
            pln = pln - 0.02;
        }

        while(pln >= 0.01)
        {
            il_gr01 += 1;
            pln = pln - 0.01;
        }


        System.out.println((int)il_dwusetek + " * 200zl");
        System.out.println((int)ilosc_setek + " * 100zl");
        System.out.println((int)il_piecdziesiatek + " * 50zl");
        System.out.println((int)il_dwudziestek + " * 20zl");
        System.out.println((int)il_dziesiatek + " * 10zl");
        System.out.println((int)il_piatek + " * 5zl");
        System.out.println((int)il_dwojek + " * 2zl");
        System.out.println((int)il_jedynek + " * 1zl");
        System.out.println((int)il_gr50 + " * 50gr");
        System.out.println((int)il_gr20 + " * 20gr");
        System.out.println((int)il_gr10 + " * 10gr");
        System.out.println((int)il_gr05 + " * 5gr");
        System.out.println((int)il_gr02 + " * 2gr");
        System.out.println((int)il_gr01 + " * 1gr");


    }

}
