package PPJ22.TASK1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Cuboid cuboid = new Cuboid(rectangle, 4);

        cuboid.showArea();
        cuboid.showVolume();
    }
}
