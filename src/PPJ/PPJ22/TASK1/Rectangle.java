package PPJ22.TASK1;

public class Rectangle {
    private int width;
    private int high;

    public Rectangle(int width, int high) {
        this.width = width;
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public int getHigh() {
        return high;
    }

    public int getArea(){
        return this.getHigh() * this.getWidth();
    }

    public void showArea(){
        System.out.println("Area = " + this.getArea());
    }
}
