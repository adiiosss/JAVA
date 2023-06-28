package GUI.GUI08;

class Buffer {
    private final int[] buffer;
    private int count = 0;
    private int in = 0;
    private int out = 0;

    public Buffer(int size) {
        buffer = new int[size];
    }

    public synchronized void put(int value) throws InterruptedException {
        while (count == buffer.length) {
            wait();
        }

        buffer[in] = value;
        in = (in + 1) % buffer.length;
        count++;

        notifyAll();

        System.out.println("Wstawiono: " + value);

    }

    public synchronized int get() throws InterruptedException {
        while (count == 0) {
            wait();
        }

        int value = buffer[out];
        out = (out + 1) % buffer.length;
        count--;

        notifyAll();

        System.out.println("odebrano: ");

        return value;
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = (int) (Math.random() * 100);

                buffer.put(value);

                System.out.println("Wyprodukowany: " + value);

                Thread.sleep((long) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = buffer.get();

                System.out.println("Skonsumowano: " + value);

                Thread.sleep((long) (Math.random() * 2000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}