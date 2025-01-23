package Unit4;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private final int width = 1920;
    private final int length = 1080;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame("This is a GUI");
        frame.setLayout(null);
        //frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //COULD ALSO USE THIS
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.setBounds(710, 290, 500, 500);
        panel.setOpaque(true);
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);
        frame.add(panel);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));

        frame.pack();
    }

    public static void main(String[] args) {
        new GUI();
    }
}
