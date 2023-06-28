package PPJ23.TASK3;

class Alarm extends Exception {
    public Alarm(String message) {
        super(message);
    }
}

class DetektorDymu {
    public void sprawdz() throws Alarm {
        boolean wyczuwalnyDym = true; // Przykład, że jest wyczuwalny dym
        if (wyczuwalnyDym) {
            throw new Alarm("ALARM: Wyczuwalny dym!");
        }
    }
}
