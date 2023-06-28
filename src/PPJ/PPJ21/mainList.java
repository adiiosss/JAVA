package PPJ21;

public class mainList {
    public static void main(String[] args) {

        // Test dodawania i pobierania określonej liczby elementów
        MyStackLinkedList stack = new MyStackLinkedList();
        stack.push(new Student(12345, "John"));
        stack.push(new Student(23456, "Jane"));
        stack.push(new Student(34567, "Bob"));
        stack.push(new Student(45678, "Alice"));
        stack.show();

        // Wyświetli: Alice Bob Jane John
        Student element1 = stack.pop();
        Student element2 = stack.pop();
        stack.show();

        // Wyświetli: Alice Bob
        element1.show();

        // Wyświetli: Student number: 34567, name: Bob
        element2.show();

        // Wyświetli: Student number: 23456, name: Jane

        // Test umieszczenia większej liczby elementów na stosie, niż to jest dozwolone
        // Nie ma takiej możliwości w implementacji z wykorzystaniem listy jednokierunkowej

        // Test próby pobrania elementu z pustego stosu
        stack.pop();
        stack.pop();
        // Wyświetli: Stack is empty!
    }
}

