package PPJ21;

public class mainArray {
    public static void main(String[] args) {

        MyStackArray stack = new MyStackArray(5);
        stack.push(new Student(12345, "John"));
        stack.push(new Student(23456, "Jane"));
        stack.push(new Student(34567, "Bob"));
        stack.push(new Student(45678, "Alice"));
        stack.show();

        // Wyświetli: [Student number: 12345, name: John, Student number: 23456, name: Jane, Student number: 34567, name: Bob, Student number: 45678, name: Alice]
        Student element1 = stack.pop();
        Student element2 = stack.pop();
        stack.show();

        // Wyświetli: [Student number: 12345, name: John, Student number: 23456, name: Jane]
        element1.show();

        // Wyświetli: Student number: 45678, name: Alice
        element2.show();

        // Wyświetli: Student number: 34567, name: Bob

        // Test umieszczenia większej liczby elementów na stosie, niż to jest dozwolone
        stack.push(new Student(56789, "Mike"));
        stack.push(new Student(67890, "Linda"));
        stack.push(new Student(78901, "Tom"));
        // Wyświetli: Stack is full!

        // Test próby pobrania elementu z pustego stosu
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // Wyświetli: Stack is empty!
    }
}