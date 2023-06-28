package PPJ19.TASK4;

import PPJ19.TASK2.Kwadrat;
import PPJ19.TASK3.Walec;

public class KulaW {

    private Walec walec;
    private Kwadrat kwadrat;

    public KulaW(Walec walec){
        this.walec = walec;
        this.kwadrat = null;

    }

    public KulaW(Kwadrat kwadrat){
        this.walec = null;
        this.kwadrat = kwadrat;

    }
}
