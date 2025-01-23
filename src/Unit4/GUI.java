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
        frame.setLayout(null);//COULD ALSO USE THIS
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        panel.setBounds(710, 290, 500, 500);
        panel.setOpaque(true);
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);
        frame.add(panel);

        JButton btn1 = new JButton();
        ButtonCreator(btn1,panel,"1");
        JButton btn2 = new JButton();
        ButtonCreator(btn2,panel,"2");
        JButton btn3 = new JButton();
        ButtonCreator(btn3,panel,"3");
        JButton btn4 = new JButton();
        ButtonCreator(btn4,panel,"4");
        JButton btn5 = new JButton();
        ButtonCreator(btn5,panel,"5");
        JButton btn6 = new JButton();
        ButtonCreator(btn6,panel,"6");
        JButton btn7 = new JButton();
        ButtonCreator(btn7,panel,"7");
        JButton btn8 = new JButton();
        ButtonCreator(btn8,panel,"8");
        JButton btn9 = new JButton();
        ButtonCreator(btn9,panel,"9");
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        new GUI();
    }
    public void ButtonCreator(JButton btn, JPanel panel, String txt){
        btn.setText(txt);
        btn.setVisible(true);
        btn.setFont(new Font("Monospaced",Font.BOLD,72));
        panel.add(btn);
    }
}
