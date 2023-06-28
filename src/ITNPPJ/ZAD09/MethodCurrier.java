package ITNPPJ.ZAD09;

public class MethodCurrier {

    public static void main(String[] args) {

        System.out.println();

        MethodCurrier methodCurrier = new MethodCurrier();

        int intValue = 2;
        float floatValue = 1.5f;
        char charValue = 'a';
        byte byteValue = 1;

        methodCurrier.setValue(intValue);
        System.out.println();
        methodCurrier.setValue(floatValue);
        System.out.println();
        methodCurrier.setValue(charValue);
        System.out.println();
        methodCurrier.setValue(byteValue);

        //Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać?
        //Podejmowana jest na podstawie typów argumentów przekazywanych do metody.


        /*Na koniec przedstaw wywołanie wszystkich metod setValue i odpowiedz co zmieniły
        wywołane metody?*/
        //zmieniły wartości zwracanych zmiennych

        System.out.println();

        Number number = new Number();

        methodCurrier.setValue(number);

    }


    public void setValue (int x){
        System.out.println("typ parametru: int, wartosc: " + x);
        x = x + 2;
        System.out.println("typ parametru: int, wartosc: " + x);

    }

    public void setValue (float x){
        System.out.println("typ parametru: float, wartosc: " + x);
        x = x + 2;
        System.out.println("typ parametru: float, wartosc: " + x);

    }

    public void setValue (Number object){
        System.out.print("wartosc: ");
        object.showValue();
        object.setValue(4);
        System.out.print("wartosc: " );
        object.showValue();
    }
}
