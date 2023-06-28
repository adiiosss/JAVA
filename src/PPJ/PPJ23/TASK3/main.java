package PPJ23.TASK3;

public class main {
    public static void main(String[] args) {
        DetektorDymu detektorDymu = new DetektorDymu();
        try {
            detektorDymu.sprawdz();
        } catch (Alarm e) {
            System.out.println(e.getMessage());
        }
    }
}
