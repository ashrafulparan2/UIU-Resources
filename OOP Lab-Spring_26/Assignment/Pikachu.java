import javax.swing.*;
import java.awt.*;

public class Pikachu {

    JFrame frame;
    JLabel pikachu;


    Pikachu()
    {
        frame = new JFrame("PIKACHU");
        frame.setBounds(20,20,1200,700);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE); //#f6f6f6

        pikachu = new JLabel();
        pikachu.setIcon(new ImageIcon("Pika.png"));
        pikachu.setBounds(0,0,pikachu.getPreferredSize().width,pikachu.getPreferredSize().height);
        frame.add(pikachu);

        while(true) {
            move("Right");
            move("Down");
            move("Left");
            move("Up");
        }


    }

    public void move(String direction)
    {
        int speed = 10;
        int stepsHorizontal = 70;
        int stepsVertical = 25;
        int sleep = 50;

        if(direction.equals("Up"))
        {
            for(int i=0; i<stepsVertical; i++)
            {
                pikachu.setLocation(pikachu.getX(), pikachu.getY()-speed);
                try { Thread.sleep(sleep); } catch (Exception e){}
            }
        }
        else if(direction.equals("Down"))
        {
            for(int i=0; i<stepsVertical; i++)
            {
                pikachu.setLocation(pikachu.getX(), pikachu.getY()+speed);
                try { Thread.sleep(sleep); } catch (Exception e){}
            }
        }
        else if(direction.equals("Left"))
        {
            for(int i=0; i<stepsHorizontal; i++)
            {
                pikachu.setLocation(pikachu.getX()-speed, pikachu.getY());
                try { Thread.sleep(sleep); } catch (Exception e){}
            }
        }
        else if(direction.equals("Right"))
        {
            for(int i=0; i<stepsHorizontal; i++)
            {
                pikachu.setLocation(pikachu.getX()+speed, pikachu.getY());
                try { Thread.sleep(sleep); } catch (Exception e){}
            }
        }
    }


    public static void main(String[] args) {
        new Pikachu();
    }

}