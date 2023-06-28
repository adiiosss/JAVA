package GUI.GUI09.Zadanie17;

import java.awt.*;
import javax.swing.*;

public class Zadanie17 {

    public static void main(String[] args)
    {
        new Zadanie17(args);
    }

    public Zadanie17(String[] args)
    {
        // poprawny sposób uruchomienia Swing'a
        SwingUtilities.invokeLater(() -> createGUI(args));


    }

    protected void createGUI(String[] args)
    {

        // utworzenie okna typu JFrame
        JFrame jf = new JFrame();

        // określenie tytułu okna typu JFrame
        jf.setTitle("JTextArea");

        // obsługa zamknięcia okna typu JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // wyświetlenie okna typu JFrame
        jf.setVisible(true);

        Color kolor = JColorChooser.showDialog(null, "Wybierz kolor", new Color(255,255,255));

        JTextArea text = new JTextArea(15, 40);

        jf.setBounds(400, 400, 400, 400);
        jf.add(text);

        Font myFont1 = new Font("Arial", Font.BOLD + Font.ITALIC, 40);
        Font myFont2 = new Font("Serif", Font.BOLD + Font.ITALIC, 40);
        text.setFont(myFont2);
        text.setForeground(kolor);

    }

}

