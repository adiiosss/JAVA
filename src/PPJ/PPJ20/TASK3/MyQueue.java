package PPJ20.TASK3;

public class MyQueue {
    MyQueueNode head;

    public void put(String s){
        if(head == null){
            head = new MyQueueNode(s);
            return;
        }
        MyQueueNode temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new MyQueueNode(s));
    }

    public String get(){
        if(head == null) {
            System.out.println("\nEmpty Queue");
            return null;
        }
        else{
            MyQueueNode temp = head;
            head = head.getNext();
            return temp.getValue();
        }
    }

    public int size(){
        if(head == null)
            return 0;
        return head.size();
    }
}
