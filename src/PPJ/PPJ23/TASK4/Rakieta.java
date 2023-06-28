package PPJ23.TASK4;

import java.util.Random;

class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = 0;
    }

    public void zatankuj() {
        Random rand = new Random();
        this.wagaPaliwa += rand.nextInt(2000);
    }

    public void start() throws Exception {
        if (this.wagaPaliwa < 1000) {
            throw new Exception("start anulowany - za mało paliwa");
        }
        System.out.println("Rakieta " + this.nazwa + " startuje z " + this.wagaPaliwa + " kg paliwa");
    }
}
