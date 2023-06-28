package PPJ23.TASK2;

public class main {
    public static void main(String[] args) {
        Owoc[] zrywaneOwoce = new Owoc[100];
        Drzewo drzewo = new Drzewo();
        int licznik = 0;
        double masa = 0;

        while (masa < 5) {
            Owoc owoc = drzewo.zerwijOwoc();
            zrywaneOwoce[licznik] = owoc;
            masa += owoc.getMasa();
            licznik++;
        }

        int licznikJablek = 0;
        int licznikPomaranczy = 0;
        int licznikGruszek = 0;

        for (int i = 0; i < licznik; i++) {
            switch (zrywaneOwoce[i].getNazwa()) {
                case "Jablko":
                    licznikJablek++;
                    break;
                case "Pomarancza":
                    licznikPomaranczy++;
                    break;
                case "Gruszka":
                    licznikGruszek++;
                    break;
            }
        }

        System.out.println("Liczba zerwanych jabłek: " + licznikJablek);
        System.out.println("Liczba zerwanych pomarańczy: " + licznikPomaranczy);
        System.out.println("Liczba zerwanych gruszek: " + licznikGruszek);
    }
}