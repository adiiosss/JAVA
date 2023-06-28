package GUI04.ZADANIE8;

import java.util.*;

@FunctionalInterface
interface Transform<T, R> {   //interfejs funkcyjny, Pobiera wartość typu T a zwraca wartosc typu R
    R apply(T arg);
}

class StrToInt implements Transform <String, Integer>{   //Klasa String to Int

    public Integer apply(String arg) {   //zwraca długość tekstu przekazanego jako argument (typu String) w postaci liczby całkowitej (typu Integer)
        return arg.length();
    }

}

public class Test {

    private static <T, R>
    void transform(T[] in, R[] out, Transform<T, R> trans) {   //iteruje po wszystkich elemenatch tablicy in i wywołuje metodę apply z uzyciem obiektu trans, wsadzone do out
        for (int i = 0; i < in.length; i++) {
            out[i] = trans.apply(in[i]);
        }
    }

    public static void main(String[] args) {

        String[] sin = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(sin) + '\n');

        Integer[] iout = new Integer[sin.length];
        transform(sin, iout, new StrToInt());           //zamienia łancuch znakow na ilosc = liczba
        System.out.println(Arrays.toString(iout));

        Character[] cout = new Character[sin.length];
        transform(sin, cout, s -> s.charAt(0));         //wyrazeniem lambda znajduje Pierwszy znak i wyswietla w tablicy
        System.out.println(Arrays.toString(cout));

        String[] sout = new String[sin.length];
        transform(sin, sout, s -> s.toUpperCase());     //wyrazenie lambda zamienia calego stringa na duze litery (UpperCase)
        System.out.println(Arrays.toString(sout));

    }
}
