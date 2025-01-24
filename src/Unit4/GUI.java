package Unit4;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private final int width = 1920;
    private final int length = 1080;
    private JFrame frame;
    private JPanel panel;
    private int passcode = 45;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    public GUI() {
        frame = new JFrame("This is a GUI");
        frame.setLayout(null);
        //frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);//COULD ALSO USE THIS
        frame.setVisible(true);


        panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,10,10));
        panel.setBorder(new LineBorder(Color.BLACK,10));
        panel.setBounds(710, 290, 500, 500);
        panel.setOpaque(true);
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);
        frame.add(panel);

        btn1 = new JButton();
        ButtonCreator(btn1,panel,"1");
        btn1.addActionListener(this);
        btn2 = new JButton();
        ButtonCreator(btn2,panel,"2");
        btn3 = new JButton();
        ButtonCreator(btn3,panel,"3");
         btn4 = new JButton();
        ButtonCreator(btn4,panel,"4");
         btn5 = new JButton();
        ButtonCreator(btn5,panel,"5");
         btn6 = new JButton();
        ButtonCreator(btn6,panel,"6");
         btn7 = new JButton();
        ButtonCreator(btn7,panel,"7");
         btn8 = new JButton();
        ButtonCreator(btn8,panel,"8");
         btn9 = new JButton();
        ButtonCreator(btn9,panel,"9");
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        new GUI();
    }
    public void ButtonCreator(JButton btn, JPanel panel, String txt){
        btn.setText(txt);
        btn.setBackground(Color.darkGray);
        btn.setForeground(Color.white);
        btn.setVisible(true);
        btn.setFont(new Font("Monospaced",Font.ITALIC,150));
        panel.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            passcode--;
        }
        else if(e.getSource() == btn2){
            passcode -= 2;
        }
    }
}
