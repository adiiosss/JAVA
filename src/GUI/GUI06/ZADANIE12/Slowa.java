package GUI06.ZADANIE12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Slowa implements Iterable<Map.Entry<String, Integer>> {

    private final String plik;

    public Slowa(String pliczek) {
        this.plik = pliczek;
    }

    public Iterator<Map.Entry<String, Integer>> iterator() { // metoda iterator, która zwraca iterator mapujący pary klucz-wartość
        try {
            Stream<String> lines = Files.lines(Paths.get(plik), StandardCharsets.UTF_8);//odczyty wierszy z strumienia plkow wraz z kodowaniem polskich znakow


            Map<String, Integer> wordCounts = lines.flatMap(line -> Arrays.stream(line.split("\\P{L}+")))//spłaszczenie strumienia na jeden strumien slow, podzielny na wyrezenie
                    .collect(Collectors.toMap(String::toUpperCase, words -> 1, Integer::sum));  //mapa(klucze to słowa, wartosci = liczba wystapien

            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCounts.entrySet()); //lista par klucz-wartosc

            return list.iterator();

        } catch (IOException e) { //blad odczytu pliku

            throw new RuntimeException(e);

        }

    }
}



