package PPJ22.TASK4;

public class main {
    public static void main(String[] args) {

        Drzewo drzewo = new Drzewo(false, 15, "kulisty");
        System.out.println(drzewo.toString());

        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(false, 15, "kulisty", 50, 0.5);
        System.out.println(drzewoIglaste.toString());

        DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste(true, 20, "jajowaty", "kwadratowy");
        System.out.println(drzewoLisciaste.toString());

        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false, 25, "prosty", "okrągły", "jabłko");
        System.out.println(drzewoOwocowe.toString());

    }
}
