package GUI.GUI05.Zadanie9;
import static java.lang.System.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<Osoba> lista = Arrays.asList(  //tworzy liste
                new Osoba("Anna", 2000),  //obiekt klasy osoba - anna
                new Osoba("Bartek", 2001), //obiekt klasy osoba - bartek
                new Osoba("Maria", 2002)  //obiekt klasy osoba - maria
        );
        out.println(Osoba.wKolekcji(lista, "Bartek", 2001));  //skorocony zapis sout, sprawdza czy osoba jest w kolekcji, true
        out.println(Osoba.wKolekcji(lista, "Daria", 2001));  //  =||=  false
        Set<Osoba> tZbior = new TreeSet<>(lista); //porzadek naturalny, nie moze zawierac duplikatow - true
        out.println(Osoba.wKolekcji(tZbior, "Bartek", 2001)); // =|| = true
        out.println(Osoba.wKolekcji(tZbior, "Daria", 2001));  // =||= false
        Set<Osoba> hZbior = new HashSet<>(lista);  //kolekcja typu hashset
        out.println(Osoba.wKolekcji(hZbior, "Bartek", 2001)); // ture poniewaz zawiera sie w liscie
        out.println(Osoba.wKolekcji(hZbior, "Daria", 2001)); // fasle nie zawiera sie w liscie

    }
}
