package GUI.GUI07.ZADANIE14;

public class Letters extends Thread{
    private final Thread[] threads;  //tablica watkow
    private final String nazwa;
    boolean running = true;

    public Letters(String nazwa) {
        this.threads = new Thread[4];
        this.nazwa = nazwa;
        for (int i = 0; i < nazwa.length(); i++) {
            char litera = nazwa.charAt(i);
            threads[i] = new Thread(() -> {
                while (running){
                    try{
                        System.out.print(litera);
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
            threads[i].setName("Thread "+ litera);
        }
    }

    public Thread[] getThreads(){
        return threads;
    }

}