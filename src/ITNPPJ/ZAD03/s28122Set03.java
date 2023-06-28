package TASKS.ZAD03;

public class s28122Set03 {

    public static void main(String[] args) {


    }

    public void task01(){

        boolean boolMin = false;
        boolean boolMax = true;

        byte byteMin = -0b10000000;
        byte byteMax = 0x7F;

        short shortMin = -32768;
        short shortMax = 077777;

        int intMin = -2147483648;
        int intMax = 2147483647;

        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;

        float floatMin = -3.4028235E38f;
        float floatMax = 3.4028235E38f;

        double doubleMin = -1.7976931348623157E308;
        double doubleMax = 1.7976931348623157E308;

        char charMin = '\u0000';
        char charMax = '\uffff';

        System.out.println(boolMin);
        System.out.println(boolMax);
        System.out.println(byteMin);
        System.out.println(byteMax);
        System.out.println(shortMin);
        System.out.println(shortMax);
        System.out.println(intMin);
        System.out.println(intMax);
        System.out.println(floatMin);
        System.out.println(floatMax);
        System.out.println(doubleMin);
        System.out.println(doubleMin);
        System.out.println(charMin);
        System.out.println(charMax);

    }

    public void task02(){

        boolean a = true;
        int b = 2;
        double c = 3.2;
        char d = 'a';

        //System.out.println(a==b);  nie da sie
        //System.out.println(a==c);  nie da sie
        //System.out.println(a==d);  nie da sie
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(c==d);

    }

    public void task03(){

        int a123 = 0;
        //int 1abc = 1; nie dziala
        //int @abc = 2; nie dziala
        //int args = 3; nie dziala
        //int null = 4; nie dziala

    }

    public void task04(){

        int a = 2;
        System.out.println(a);

    }

    public void task05(){

        char charValue = 'a';
        char charvalue = 'b';

        System.out.println(charValue);
        System.out.println(charvalue);

        /*program sie skompiluje poniewaz jezyk java jest jezykiem case sensitive*/

    }

    public void task06(){

        int a = 1;
        double b = 2.5;

        //a = b; dla int nie mozna przypisac wartosci rzeczywistej
        b = a; //dla double mozna przypisac liczbe calkowita

        System.out.println(a);
        System.out.println(b);

    }

    public void task07(){

        byte a = 1;
        char b = 'a';
        int c = 2;
        float d = 3.2f;
        double e = 4.5;

        // b = b + c; nie zadziala poniewaz nie da sie dodac chara (znaku) do liczby calkowitej
        c = c + b;
        //d = d + e; nie mozna dodawac poniewaz float i double nie maja takich samych wartosci dla liczb rzeczywistych
        //a = a + c; nie mozna dodwac typow byte i int

        int wynik = c;

        //rozwiazanie problemu to dodac w nawiasie definiowana zmienna jaka chcemy otrzymac
        //przyklad ponizej

        b = (char) (b + c);
        d = (float) (d + e);
        a = (byte) (a + c);

    }

}
