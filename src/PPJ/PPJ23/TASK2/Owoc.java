package PPJ23.TASK2;

import java.util.Random;

class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        Random rand = new Random();
        this.masa = rand.nextDouble() * (250 - 100) + 100;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }
}

class Jablko extends Owoc {
    public Jablko() {
        super("Jablko");
    }
}

class Pomarancza extends Owoc {
    public Pomarancza() {
        super("Pomarancza");
    }
}

class Gruszka extends Owoc {
    public Gruszka() {
        super("Gruszka");
    }
}
