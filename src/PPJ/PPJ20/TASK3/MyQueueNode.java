package PPJ20.TASK3;

public class MyQueueNode {
    private String value;
    private MyQueueNode next;

    MyQueueNode(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public MyQueueNode getNext() {
        return next;
    }

    public void setNext(MyQueueNode next) {
        this.next = next;
    }

    public int size(){
        MyQueueNode temp = this;
        int counter = 1;
        while (temp.next != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }
}
