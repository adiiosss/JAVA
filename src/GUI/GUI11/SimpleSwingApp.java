package GUI.GUI11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingApp {
    public static void main(String[] args) {
        new SimpleSwingApp();
    }

    public SimpleSwingApp(){
        SwingUtilities.invokeLater(() -> createGUI());
    }

    protected void createGUI() {

        //  FRAME
        JFrame frame = new JFrame();
        frame.setTitle("                                                                     SIMPLE SWING APP");

        frame.setBounds(1000, 400, 600, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(true);

        frame.setVisible(true);

        //  MAIN PANELS
        JPanel up = new JPanel(new BorderLayout());
        JPanel down = new JPanel(new BorderLayout());
        JPanel center = new JPanel(new BorderLayout());

        //  MAIN TEXT AREA
        JTextArea mainTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(mainTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // Ustawienie pionowego paska przewijania jako zawsze widocznego
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // Ustawienie poziomego paska przewijania jako zawsze widocznego
        center.add(scrollPane, BorderLayout.CENTER);
        frame.add(center, BorderLayout.CENTER);

        //  POLES TEXT AREA
        JPanel textPoles = new JPanel(new GridLayout(3,1,5,5));

        JTextField textField1 = new JTextField("Pole tekstowe 1 typu JtextField");
        JTextField textField2 = new JTextField("Pole tekstowe 2 typu JtextField");
        JTextField textField3 = new JTextField("Pole tekstowe 3 typu JtextField");

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                mainTextArea.append(text+"\n");
                textField.setText("");
            }
        };


        textField1.addActionListener(actionListener);
        textField2.addActionListener(actionListener);
        textField3.addActionListener(actionListener);

        textField1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        textField2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        textField3.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        textField1.setPreferredSize(new Dimension(300, 30));
        textField2.setPreferredSize(new Dimension(300, 30));
        textField3.setPreferredSize(new Dimension(300, 30));

        textPoles.add(textField1);
        textPoles.add(textField2);
        textPoles.add(textField3);


        JPanel rigthDown = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rigthDown.add(textPoles, BorderLayout.EAST);
        down.add(rigthDown, BorderLayout.EAST);

        // BUTTONS
        JPanel colorButtons = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton FR = new JButton("FR");
        FR.setBackground(Color.RED);
        FR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextArea.setForeground(Color.RED);
            }
        });
        JButton FG = new JButton("FG");
        FG.setBackground(Color.GREEN);
        FG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextArea.setForeground(Color.GREEN);
            }
        });
        JButton FB = new JButton("FB");
        FB.setBackground(Color.BLUE);
        FB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextArea.setForeground(Color.BLUE);
            }
        });

        colorButtons.add(FR);
        colorButtons.add(FG);
        colorButtons.add(FB);
        up.add(colorButtons, BorderLayout.WEST);

        JPanel alfabeticButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton A = new JButton("A");
        JButton B = new JButton("B");
        JButton C = new JButton("C");

        alfabeticButtons.add(A);
        alfabeticButtons.add(B);
        alfabeticButtons.add(C);
        up.add(alfabeticButtons, BorderLayout.EAST);

        JPanel numericButtons = new JPanel(new GridLayout(3,3,5,5));

        JButton[] num = {
                new JButton("1"),
                new JButton("2"),
                new JButton("3"),
                new JButton("4"),
                new JButton("5"),
                new JButton("6"),
                new JButton("7"),
                new JButton("8"),
                new JButton("9")
        };

        for(JButton b : num) {
            b.setPreferredSize(new Dimension(50, 30));
            numericButtons.add(b);
        }

        JPanel leftDown = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftDown.add(numericButtons, BorderLayout.WEST);
        down.add(leftDown, BorderLayout.WEST);


        frame.add(up, BorderLayout.NORTH);
        frame.add(down, BorderLayout.SOUTH);

    }
}


