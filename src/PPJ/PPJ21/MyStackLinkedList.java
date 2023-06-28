package PPJ21;

public class MyStackLinkedList {
    private static class Node {
        private Student element;
        private Node next;

        public Node(Student element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node top;
    private int size;

    public MyStackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    public void push(Student element) {
        Node newNode = new Node(element, top);
        top = newNode;
        size++;
    }

    public Student pop() {
        if (top != null) {
            Student element = top.element;
            top = top.next;
            size--;
            return element;
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public void show() {
        Node current = top;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
}

