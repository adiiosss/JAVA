package GUI.GUI07.ZADANIE14;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");
        for (Thread t : letters.getThreads())
            System.out.println(t.getName());

        for (Thread t : letters.getThreads())
            t.start();

        Thread.sleep(5000);

        letters.running = false;

        System.out.println("\nProgram skończył działanie");
    }
}
