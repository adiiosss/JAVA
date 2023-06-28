package GUI.GUI08;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Buffer buffer = new Buffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        Thread.sleep(15000);

        producerThread.interrupt();
        consumerThread.interrupt();

        //System.exit(0);
    }
}