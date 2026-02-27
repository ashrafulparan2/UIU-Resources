import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI3 implements ActionListener {

    JFrame frame;
    JTextField display;
    JButton button;

    GUI3()
    {
        frame = new JFrame("Calculator");
        display = new JTextField();
        button = new JButton("CALCULATE");

        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLUE);  //Set Background color of frame

        display.setBounds(50,50,300,100);
        button.setBounds(150,200,150,50);
        button.setBackground(Color.decode("#17ebe4")); //Set color of Button, decode() function allows you to use hex codes of colors, use a color picker online

        JLabel l1 = new JLabel("HIIIIII");
        l1.setBounds(50,200,50,50);
        l1.setBackground(Color.GREEN);  //Set the color for the background of the label
        l1.setOpaque(true);  //This must be set true to show the background color of the label
        frame.add(l1);


        button.addActionListener(this);

        frame.add(display);
        frame.add(button);

    }

    public void actionPerformed(ActionEvent e)
    {
        String input = display.getText();
        String arr[] = input.split(" ");  //Split the text using space
        int first = Integer.parseInt(arr[0]);  //Convert to integer
        int second = Integer.parseInt(arr[2]);
        int answer = 0;

        if(arr[1].equals("+"))
        {
            answer = first+second;
        }
        else if(arr[1].equals("-"))
        {
            answer = first-second;
        }
        else if(arr[1].equals("*"))
        {
            answer = first*second;
        }
        else if(arr[1].equals("/"))
        {
            answer = first/second;
        }

        display.setText(answer + "");  //Set the answer on display by converting to string using + ""

    }

    public static void main(String[] args) {
        new GUI3();
    }

}