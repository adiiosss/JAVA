package GUI06.ZADANIE12;

import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String file = "Z:\\PPJ&GUI\\src\\GUI06\\ZADANIE12\\slowa.txt";
        for (Map.Entry<String, Integer> e : new Slowa(file))
            System.out.println(
                    e.getKey() + " -> " + e.getValue());

    }

}