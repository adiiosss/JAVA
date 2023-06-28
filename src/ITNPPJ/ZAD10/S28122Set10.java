package ITNPPJ.ZAD10;

public class S28122Set10 {

    public static void main(String[] args) {

        System.out.println();

        //TASK 1
        System.out.println("===KWADRAT===");
        Kwadrat nowyKwadrat = new Kwadrat(2);
        nowyKwadrat.show();

        System.out.println();

        //TASK 2
        System.out.println("===WALEC===");
        Walec nowyWalec = new Walec(3, 6);
        nowyWalec.show();

        System.out.println();

        //TASK 3
        System.out.println("===PROSTOKAT===");
        Prostokat nowyProstokat = new Prostokat(4.0, 6.0);
        nowyProstokat.show();

        System.out.println("\n===PROSTOPADLOSCIAN===");
        Prostopadloscian nowyProstopadloscian = new Prostopadloscian(4.0, 6.0, 8.0);
        nowyProstopadloscian.showProstopadloscian();

        System.out.println("\n===TROJKAT ROWNOBOCZNY===");
        Trojkat nowyTrojkat = new Trojkat(5.0);
        nowyTrojkat.show();

        System.out.println("\n===OSTROSLUP===");
        Ostroslup nowyOstroslup = new Ostroslup(5.0, 8.0);
        nowyOstroslup.showOstroslup();

        System.out.println("\n===GRANIASTOSLUP===");
        Graniastoslup nowyGraniastoslup = new Graniastoslup(5.0, 10.0);
        nowyGraniastoslup.showGraniastoslup();

        //TASK 4
        System.out.println("\n===DRZEWO===");
        Drzewo noweDrzewo = new Drzewo(true, 10, "Przekrój drzewa 1");
        System.out.println(noweDrzewo.toString());

        //TASK 5
        System.out.println("\n===DRZEWO IGLASTE===");
        DrzewoIglaste noweDrzewoIglaste = new DrzewoIglaste(true, 14, "Przekrój drzewa iglastego", 500, 12.5);
        System.out.println("\n===DRZEWO LISCIASTE===");
        DrzewoLisciaste noweDrzewoLisciaste = new DrzewoLisciaste(false, 5, "Przekrój drzewa liściastego", 6);
        System.out.println("\n===DRZEWO OWOCOWE===");
        DrzewoOwocowe noweDrzewoOwocowe = new DrzewoOwocowe(true, 10, "Przekrój drzewa owocowego", 3, "Jabłko");

        System.out.println(noweDrzewoIglaste.toString());
        System.out.println(noweDrzewoLisciaste.toString());
        System.out.println(noweDrzewoOwocowe.toString());
    }
}



