package GUI07.ZADANIE15;

import java.util.concurrent.atomic.AtomicBoolean;

enum TaskState {
    CREATED, RUNNING, ABORTED, READY;
}

public class StringTask implements Runnable {

    private final String txt;
    private final int n;
    private final AtomicBoolean running;
    private String result;
    private TaskState state;

    public StringTask(String txt, int n) {
        this.txt = txt;
        this.n = n;
        this.running = new AtomicBoolean(false);
        this.result = "";
        this.state = TaskState.CREATED;
    }

    public String getResult() {
        return result;
    }

    public TaskState getState() {
        return state;
    }

    public void start() {
        Thread thread = new Thread(this);
        running.set(true);
        thread.start();
    }

    public void abort() {
        running.set(false);
        state = TaskState.ABORTED;
    }

    public boolean isDone() {
        return state == TaskState.READY || state == TaskState.ABORTED;
    }

    public void run() {
        state = TaskState.RUNNING;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n && running.get(); i++) {
            String reversed = new StringBuilder(txt).reverse().toString();
            sb.append(reversed);
            result = sb.toString();
        }
        if (running.get()) {
            state = TaskState.READY;
        }
    }

    public String getTxt() {
        return txt;
    }

}

