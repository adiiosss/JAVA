package PPJ23.TASK4;

public class main {
    public static void main(String[] args) {
        Rakieta rakieta = new Rakieta("Saturn V");
        rakieta.zatankuj();
        try {
            rakieta.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}