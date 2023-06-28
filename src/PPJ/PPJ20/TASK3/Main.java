package PPJ20.TASK3;

public class Main {
    public static void main(String[] args) {
        String[] a = {"PSG", "Atletico Madryt", "Sporting CP", "Inter",
                "Benica", "Villarreal", "RB Salzburg", "Chelsea"};
        String[] b = {"Manchester City", "Liverpool", "Ajax Amsterdam",
                "Real Madryt", "Bayern Monachium", "Manchester United", "Lille", "Juventus"};

        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < a.length; i++) {
            myQueue.put(a[i]);
            myQueue.put(b[i]);
        }

        while (myQueue.size()!=0){
            System.out.println(myQueue.get()+" vs "+myQueue.get());
        }

        System.out.println("myQueue.size() = " + myQueue.size());
    }
}
