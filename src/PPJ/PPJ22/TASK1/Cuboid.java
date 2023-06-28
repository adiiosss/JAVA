package PPJ22.TASK1;

public class Cuboid extends Rectangle {
    private int depth;

    public Cuboid(int width, int high, int depth) {
        super(width, high);
        this.depth = depth;
    }

    public Cuboid(Rectangle rectangle, int depth){
        this(rectangle.getWidth(), rectangle.getHigh(), depth);
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public int getArea() {
        return 2 * super.getArea() + 2 * this.depth * this.getHigh() + 2 * this.depth * this.getWidth();
    }

    //a * b * h
    public int getVolume (){
        return this.getDepth() * super.getArea();
    }

    public void showVolume(){
        System.out.println("Volume = " + this.getVolume());
    }
}
