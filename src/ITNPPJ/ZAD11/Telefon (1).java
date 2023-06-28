package JAVA.ZADANIA.PPJ11;

public class Telefon {

    public String infterfejsKomunikacyjny;
    public String color;

    public Telefon(String infterfejsKomunikacyjny, String color) {
        this.infterfejsKomunikacyjny = infterfejsKomunikacyjny;
        this.color = color;
    }

    public String getInfterfejsKomunikacyjny() {
        return infterfejsKomunikacyjny;
    }

    public String getColor() {
        return color;
    }

    public void zadzwon (String numer){
        System.out.println("numer: " + numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii");
    }
}
