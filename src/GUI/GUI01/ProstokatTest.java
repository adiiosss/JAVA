package GUI.GUI01;

public class ProstokatTest {

    public static void main(String[] args) {

        Prostokat pr[] = {
                new Prostokat(2, 3),
                new Prostokat(0, 3),
                new ZProstokat(4, 'a', 'e'),        // konstruktor z 3 parametrami
                new ZProstokat(5, 3, '*', '+'),    // konstruktor z 4 parametrami
                new ZProstokat(1, 2, 'a', 'a'),
                new ZProstokat(3, 3, '+', 'x'),
                new ZProstokat(1, 2, 'x', 'y'),
                new ZProstokat(3, 4, '^', '$')
        };

        for (Prostokat p : pr)                        // for (int i = 0; i < pr.length; i++)
            try {
                p.rysuj();                                        // pr[i].rysuj();
            } catch (ProstokatException e) {
                System.out.println(e.getMessage());
            }
    }
}


