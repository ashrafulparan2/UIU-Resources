import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI6 implements ActionListener
{
    JFrame frame;
    JButton add;
    int count = 0; //Keeps count of the number of buttons

    public GUI6()
    {
        frame = new JFrame();
        add = new JButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//terminates the code once the close button is clicked on the frame
        frame.setBounds(100,100,400,400);	//set left corner and length width at the same time

        frame.setVisible(true);		//setVisible to true to show the frame

        frame.setLayout(new FlowLayout());
        //here we are using FlowLayout, where the components will be set from left to right, and go below if there is no space
        //explore more types of layouts from the given slide

        add.setText("ADD");
        add.setSize(100,50);

        frame.add(add);

        add.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == add) //check for the add button, or else clicking any button will create a new button
        {
            JButton button = new JButton();  //create a new button
            count++;
            button.setText("b" + count);  //set the label as b1, b2 etc
            button.setSize(100,50);
            frame.add(button);

            frame.validate();
            //after adding new components, your components might not be visible on the screen, so use validate() function to refresh and reload the screen
        }
    }

    public static void main(String[] args) {
        new GUI6();
    }
}