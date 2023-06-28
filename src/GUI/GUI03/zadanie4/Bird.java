package GUI.GUI03.zadanie4;

interface Flyable {
    String drive();
    double distance();

    static Flyable hybrid(Flyable f1, Flyable f2) {
        String type = f1.drive() + " - " + f2.drive();
        double maxDistance = Math.max(f1.distance(), f2.distance());
        return new Flyable() {
            @Override
            public String drive() {
                return type;
            }

            @Override
            public double distance() {
                return maxDistance;
            }

            @Override
            public String toString() {
                return "Typ: " + type + ", Max Odleglosc: " + maxDistance;
            }

        };
    }
}

interface Speakable {
    String speak();
}

class Bird implements Flyable,Speakable {

    private String type;
    private double max_distance;
    private String sound;

    public Bird(String type, double max_distance, String sound) {
        this.type = type;
        this.max_distance = max_distance;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Typ ptaka: " + type + ", Max Dystans: " + max_distance + ", Dzwiek: " + sound;
    }


    public String drive() {
        return "skrzydla";
    }

    public double distance() {
        return max_distance;
    }

    public String speak() {
        return sound;
    }

}

class Plane implements Speakable, Flyable {

    private String type;
    private double max_distance;
    private String sound;

    public Plane(String type, double max_distance, String sound) {
        this.type = type;
        this.max_distance = max_distance;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Typ samolotu: " + type + ", Max Dystans: " + max_distance + ", Dzwiek: " + sound;
    }

    public String drive() {
        return "odrzutowy naped";
    }

    public double distance() {
        return max_distance;
    }

    public String speak() {
        return sound;
    }
}

class UFO implements Flyable, Speakable {

    private String type;
    private double max_distance;
    private String sound;

    public UFO(String type, double max_distance, String sound) {
        this.type = type;
        this.max_distance = max_distance;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Typ UFO: " + type + ", Max Dystans: " + max_distance + ", Dzwiek: " + sound;
    }

    public String drive() {
        return "Kosmiczny naped";
    }

    public double distance() {
        return max_distance;
    }

    public String speak() {
        return sound;
    }

}

class Virus implements Flyable{

    private String type;
    private double max_distance;

    public Virus(String type, double max_distance) {
        this.type = type;
        this.max_distance = max_distance;
    }

    @Override
    public String toString() {
        return "Typ Wirusa: " + type + ", Max Dystans: " + max_distance;
    }

    public String drive(){
        return "czlowiek";
    }

    public double distance(){
        return max_distance;
    }

}


