import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 implements ActionListener {

    JFrame frame;
    JLabel username;
    JLabel password;
    JTextField name;
    JTextField pass;
    JButton login;

    JButton b1;

    GUI1()
    {
        frame = new JFrame("MY LOGIN PAGE");
        username = new JLabel();
        password = new JLabel();
        name = new JTextField();
        pass = new JTextField();
        login = new JButton();

        b1 = new JButton("B1");

        //  frame.setLocation(50,50);
        //  frame.setSize(600,600);

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLUE);

        username.setText("USERNAME: ");
        password.setText("PASSWORD: ");
        login.setText("LOGIN");
        login.addActionListener(this);

        username.setBounds(50, 50, 100, 50);
        name.setBounds(200, 50, 100, 50);
        password.setBounds(50, 150, 100, 50);
        pass.setBounds(200, 150, 100, 50);
        login.setBounds(150, 250, 100, 50);

        b1.setBounds(150,300,100,30);
        b1.addActionListener(this);

        frame.add(username);
        frame.add(name);
        frame.add(password);
        frame.add(pass);
        frame.add(login);

        frame.add(b1);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == login)
        {
            if(name.getText().equals("oop") && pass.getText().equals("1116"))
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Failed");
            }
        }
        else if(e.getSource() == b1)
        {
            System.out.println("b11111111");
        }


    }


    public static void main(String[] args) {
        new GUI1();
    }

}