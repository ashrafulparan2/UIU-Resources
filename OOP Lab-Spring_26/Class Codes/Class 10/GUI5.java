import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI5 implements ActionListener {

    GUI5()
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("NEW");

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLUE);

        button.setBounds(250,200,100,50);
        button.setBackground(Color.decode("#17ebe4"));
        button.addActionListener(this);

        frame.add(button);

    }

    public void actionPerformed(ActionEvent e)
    {
        JFrame frame2 = new JFrame();  //Creates a new frame when the button is clicked
        JLabel label = new JLabel("WELCOME EVERYONE!!!!");

        frame2.setBounds(500,300,400,400);  //Same codes for the new frame too
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(Color.YELLOW);

        label.setBounds(50,150,200,50);
        label.setBackground(Color.decode("#17ebe4"));
        label.setOpaque(true);

        frame2.add(label);

    }

    public static void main(String[] args) {
        new GUI5();
    }

}