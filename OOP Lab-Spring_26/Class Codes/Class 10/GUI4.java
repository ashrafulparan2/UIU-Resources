import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI4 implements ActionListener {

    JFrame frame;
    JTextField display1;
    JTextField display2;
    JTextField display3;
    JLabel answer;
    JButton button1;
    JButton button2;

    GUI4()
    {
        frame = new JFrame("Calculator");
        display1 = new JTextField();
        display2 = new JTextField();
        display3 = new JTextField();
        button1 = new JButton("SUM");
        button2 = new JButton("AVG");
        answer = new JLabel();

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLUE);

        display1.setBounds(50,50,50,50);
        display2.setBounds(150,50,50,50);
        display3.setBounds(250,50,50,50);
        button1.setBounds(250,200,100,50);
        button2.setBounds(250,300,100,50);
        button1.setBackground(Color.decode("#17ebe4"));
        button2.setBackground(Color.YELLOW);

        answer.setBounds(50,250,100,50);
        answer.setBackground(Color.white);
        answer.setOpaque(true);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.add(display1);
        frame.add(display2);
        frame.add(display3);

        frame.add(button1);
        frame.add(button2);

        frame.add(answer);
    }

    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(display1.getText());
        double b = Double.parseDouble(display2.getText());
        double c = Double.parseDouble(display3.getText());

        if(e.getSource() == button1)
        {
            answer.setText((a+b+c)+"");
        }
        else if(e.getSource() == button2)
        {
            answer.setText(((a+b+c)/3) + "");
        }
    }

    public static void main(String[] args) {
        new GUI4();
    }
}

