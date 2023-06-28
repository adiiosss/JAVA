package PPJ23.TASK2;

import java.util.Random;

class Drzewo {
    public Owoc zerwijOwoc() {
        Random rand = new Random();
        int wylosowany = rand.nextInt(3);
        switch (wylosowany) {
            case 0:
                return new Jablko();
            case 1:
                return new Pomarancza();
            default:
                return new Gruszka();
        }
    }
}
