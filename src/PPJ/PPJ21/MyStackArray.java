package PPJ21;

import java.util.Arrays;

public class MyStackArray {
    private Student[] stack;
    private int size;
    private int top;

    public MyStackArray(int size) {
        this.size = size;
        this.stack = new Student[size];
        this.top = -1;
    }

    public void push(Student element) {
        if (top + 1 < size) {
            top++;
            stack[top] = element;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public Student pop() {
        if (top >= 0) {
            Student element = stack[top];
            top--;
            return element;
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public void show() {
        System.out.println(Arrays.toString(stack));
    }
}

