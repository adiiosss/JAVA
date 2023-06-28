package ITNPPJ.ZAD02;

public class s28122Set02 {

    public static void main(String[] args) {


    }

    public void task01() {

        //165 - liczba wyjsciowa

        System.out.println(0b10100101);
        System.out.println(0245);
        System.out.println(0xA5);

    }

    public void task02() {

        //14 - przesuniecie bitowe

        int value = 14;

        value = value>>0;

        value = value<<2;

        value = value>>4;

        System.out.println(value);

    }

    public void task03() {

        int valueofLiteral = 0b01001001001;

        System.out.println(valueofLiteral + "\n");

        int checkfivebites = valueofLiteral & 0b11111;
        System.out.println("wartosc pieciu ostatnich bitow = " + checkfivebites);

        int checkseventhbit = (valueofLiteral >> 6) & 1;
        System.out.println("wartosc siodmego bita = " + checkseventhbit);

        int b1 = (valueofLiteral >> 24) & 0xff;
        int b2 = (valueofLiteral >> 16) & 0xff;
        int b3 = (valueofLiteral >> 8) & 0xff;
        int b4 = valueofLiteral & 0xff;
        System.out.println("wartosc 4 bajtow = " + b1 + " " + b2 + " " + b3 + " " + b4);

        int middleBytes = (valueofLiteral >> 8) & 0xffff;
        System.out.println("wartosc middleBytes = " + middleBytes);

    }

    public void task04() {

        int a1 = 0x6D , a2 = 29 , a = a1 & a2 ,  //29 = 0x1D
                b1 = 0xA , b2 = 15 , b = b1 | b2,  //15 = 0xF
                c1 = 11 << 2 , c2 = 6  , c = c1 ^ c2 ;

        System.out.println(a + " " + b + " " + c);

    }

}
