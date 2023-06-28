package PPJ19.TASK1;

public class main {

    public static void main(String[] args) {

        Word w = new Word();
        w.addChar('h');
        w.addChar('e');
        w.addChar('l');
        w.addChar('l');
        w.addChar('o');

        System.out.println("Ciąg znaków: ");
        w.show();

        System.out.println("\nDługość ciągu: " + w.length());


    }
}
