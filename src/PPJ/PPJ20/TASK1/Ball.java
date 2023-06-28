package PPJ20.TASK1;

public class Ball {
    private double radius;
    private static int ballCounter = 0;

    public Ball(double radius) {
        this.radius = radius;
    }

    public static Ball makeBall() {

        int min = 10;
        int max = 20;

        int radius = (int)(Math.random() * (max - min + 1) + min);
        return new Ball(radius);
    }

    public static void showCounter() {
        System.out.println("Ilość utworzonych obiektów klasy Ball: " + ballCounter);
    }
}

