package JAVA.ZADANIA.PPJ11;

class DetektorDymu {
    public void sprawdz(boolean dym) throws Alarm {
        if (dym) {
            throw new Alarm("wykryto dym");
        } else {
            System.out.println("brak dymu");
        }
    }
}
