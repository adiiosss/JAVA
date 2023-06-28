package GUI.GUI09.ZADANIE18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Przyciski {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nie podano argumentu A-G");
            return;
        }

        char opcja = args[0].charAt(0);

        JFrame frame = new JFrame("Przyciski");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Przycisk 1");
        JButton button2 = new JButton("P 2");
        JButton button3 = new JButton("Większy przycisk numer 3");
        JButton button4 = new JButton("Przycisk 4");
        JButton button5 = new JButton("P5");

        frame.setBounds(500, 200, 1000, 500);

        switch (opcja) {
            case 'A':
                frame.setLayout(new BorderLayout());

                break;
            case 'B':
                frame.setLayout(new FlowLayout());

                break;
            case 'C':
                frame.setLayout(new FlowLayout(FlowLayout.LEFT));

                break;
            case 'D':
                frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

                break;
            case 'E':
                frame.setLayout(new GridLayout(1, 5));

                break;
            case 'F':
                frame.setLayout(new GridLayout(5, 1));

                break;
            case 'G':
                frame.setLayout(new GridLayout(3, 2));

                break;
            default:
                System.out.println("Nieprawidłowy argument A-G");
                return;
        }


        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.WEST);
        frame.add(button3, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button5, BorderLayout.SOUTH);

        frame.setResizable(true);
        frame.setVisible(true);

    }
}
