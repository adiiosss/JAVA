package GUI.GUI02.ZADANIE3;

public class Main {

    public static void main(String[] args) {

        Spiewak s1 = new Spiewak("Dietrich"){
            @Override
            public String spiewaj() {           //adnotacja do naszej metody abstrakcyjnej
                return "oooooo6oooooo";         //zwrot wyniku w naszym przypadku "oooooo6oooooo"
            }
        };



        Spiewak s2 = new Spiewak("Piaf"){
            @Override                            //adnotacja do naszej metody abstrakcyjnej
            public String spiewaj() {            //zwrot wyniku w naszym przypadku "a4iBBiii"
                return "a4iBBiii";
            }
        };



        Spiewak s3 = new Spiewak("Adele"){
            @Override                           //adnotacja do naszej metody abstrakcyjnej
            public String spiewaj() {           //zwrot wyniku w naszym przypadku "aAa"
                return "aAa";
            }
        };

        Spiewak sp[] = {s2, s1, s3};    //tablica obiektow spiewak

        for (Spiewak s : sp)
            System.out.println(s);

       System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}
