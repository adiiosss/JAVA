package GUI.GUI11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangingButton extends JFrame {
    private JButton button;
    private Color[] colors = {Color.BLUE, Color.RED, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.CYAN};
    private int currentColorIndex = 0;

    public ColorChangingButton() {

        setTitle("Color Changing Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setLayout(new FlowLayout());

        button = new JButton("WCISNIJ");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(colors[currentColorIndex]);
                currentColorIndex = (currentColorIndex + 1) % colors.length;
            }
        });

        add(button);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            ColorChangingButton colorChangingButton = new ColorChangingButton();
            colorChangingButton.setVisible(true);
        });

    }
}
