package PPJ21;

public class Student {
    private int sNumber;
    private String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show() {
        System.out.println("Student number: " + sNumber + ", name: " + name);
    }
}
