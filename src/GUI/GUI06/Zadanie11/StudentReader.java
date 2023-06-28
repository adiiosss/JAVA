package GUI.GUI06.Zadanie11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentReader {
    public static void main(String[] args) throws IOException {

        //a - zad01
        Stream<String>zad01;

        zad01 = Files.lines(Paths.get("Z:\\PPJ&GUI\\src\\GUI06\\Zadanie11\\studenci.txt"));  //otwiera strumien metodą path gets

        zad01.filter(n -> (Integer.parseInt(n.split(" ")[2]) > 50)).forEach(s -> System.out.println(s));  //wynik studenta ([2] - 3 liczba w lini) > 50
        System.out.println();

        //b - zad02
        Stream<String>zad02;
        zad02 = Files.lines(Paths.get("Z:\\PPJ&GUI\\src\\GUI06\\Zadanie11\\studenci.txt"));

        zad02.filter(n -> (Integer.parseInt(n.split(" ")[2]) > 50))
                .sorted((n, m) -> groupComparer(n.split(" ")[1], m.split(" ")[1]))
                .sorted((n, m) -> ((n.split(" ")[1] != m.split(" ")[1]) ?
                        comparer(n.split(" ")[2], m.split(" ")[2]) :
                        groupComparer(n.split(" ")[1], m.split(" ")[1])
                )).forEach(s -> System.out.println(s));

        System.out.println();

        //c - zad03
        Stream<String>zad03;

        zad03 = Files.lines(Paths.get("Z:\\PPJ&GUI\\src\\GUI06\\Zadanie11\\studenci.txt"));

            Map<String, ArrayList<Student>> hashMap = zad03.map(n -> new Student(n.split(" ")[0], n.split(" ")[1], n.split(" ")[2]))  //map i lambda, kazda linie na obiekt student
                    .collect(Collectors.groupingBy((a) -> Integer.toString(a.nr_grupy), Collectors.toCollection(ArrayList::new)));  //collect - grupuje obiekty wedlug nr grupy

        hashMap.entrySet().stream()
                .sorted((a, b) -> groupComparer(b.getKey(), a.getKey())) //sortowanie malejąco po grupie
                .forEach(entry -> System.out.println("Grupa " + entry.getKey() + ": " + entry.getValue()));

    }


    public static int comparer(String first, String second){   //porownanie dwoch łańcuchow znakow
        int firstElement = Integer.parseInt(first);
        int secondElement = Integer.parseInt(second);

        if (firstElement < secondElement) return -1;
        if (firstElement > secondElement) return 1;
        return 0;
    }

    public static int groupComparer(String first, String second){
        int firstElement = groupToInt(first);
        int secondElement = groupToInt(second);

        if (firstElement < secondElement) return -1;
        if (firstElement > secondElement) return 1;
        return 0;
    }

    public static int groupToInt(String groupString) {   //konwerter znakow na całkowita
        return Integer.parseInt(groupString.split("")[0])*10 + Integer.parseInt(groupString.split("")[1]);  //podzial pojedyncze znaki, operacje i wynik = calkowita
    }
}

class Student {

    String imie;
    int nr_grupy;
    int wynik;

    public Student(String name, String group, String wynik) {
        this.imie = name;
        this.nr_grupy = StudentReader.groupToInt(group);
        this.wynik = Integer.parseInt(wynik);
    }

    @Override
    public String toString() {
        return imie + " " + nr_grupy + " " + wynik;
    }
}