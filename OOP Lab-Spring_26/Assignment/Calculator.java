import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JLabel display;
    JButton numbers[] = new JButton[10];
    JButton operators[] = new JButton[6];
    int firstNumber = 0;
    int secondNumber = 0;
    boolean operatorLock = true;
    boolean equalLock = true;
    boolean numberLock = false;
    char operation = 'x';
    boolean errorFlag = false;

    Calculator()
    {
        //Set Frame
        frame = new JFrame("FX991-MS");
        frame.setBounds(100,100,550,600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.getColor("#cdc8b1")); // #727272 #cdc8b1

        //Set Label
        display = new JLabel();
        display.setBounds(50,50,450,100);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        display.setOpaque(true);
        display.setFont(new Font("Times New Roman",Font.PLAIN, 35));
        frame.add(display);

        //Set Number Buttons
        int startX = 250;
        int startY = 200;
        int count = 0;
        //Set Buttons
        for(int i=9; i>0; i--)
        {
            numbers[i] = new JButton(i + "");
            numbers[i].addActionListener(this);
            numbers[i].setBounds(startX - (count*100),startY,100,75);
            numbers[i].setFont(new Font("Times New Roman",Font.PLAIN, 35));
            frame.add(numbers[i]);
            count++;

            if(count == 3)
            {
                count = 0;
                startX = 250;
                startY += 75;
            }
        }

        numbers[0] = new JButton(0 + "");
        numbers[0].addActionListener(this);
        numbers[0].setBounds(50,425,100,75);
        numbers[0].setFont(new Font("Times New Roman",Font.PLAIN, 35));
        frame.add(numbers[0]);

        //Set Operator Buttons
        operators[0] = new JButton("C");
        operators[0].addActionListener(this);
        operators[0].setBounds(150,425,100,75);
        operators[0].setFont(new Font("Times New Roman",Font.PLAIN, 35));
        frame.add(operators[0]);

        operators[1] = new JButton("=");
        operators[1].addActionListener(this);
        operators[1].setBounds(250,425,100,75);
        operators[1].setFont(new Font("Times New Roman",Font.PLAIN, 35));
        frame.add(operators[1]);

        startX = 400;
        startY = 200;
        String operatorNames = "+-*/";
        for(int i=0; i<4; i++)
        {
            operators[i+2] = new JButton(operatorNames.charAt(i) + "");
            operators[i+2].addActionListener(this);
            operators[i+2].setBounds(startX,startY,100,75);
            startY += 75;
            operators[i+2].setFont(new Font("Times New Roman",Font.PLAIN, 35));
            frame.add(operators[i+2]);
        }



    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == numbers[0])
        {
            addNumberInDisplay(0);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[1])
        {
            addNumberInDisplay(1);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[2])
        {
            addNumberInDisplay(2);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[3])
        {
            addNumberInDisplay(3);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[4])
        {
            addNumberInDisplay(4);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[5])
        {
            addNumberInDisplay(5);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[6])
        {
            addNumberInDisplay(6);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[7])
        {
            addNumberInDisplay(7);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[8])
        {
            addNumberInDisplay(8);
            operatorLock = false;
        }
        else if(e.getSource() == numbers[9])
        {
            addNumberInDisplay(9);
            operatorLock = false;
        }
        else if(e.getSource() == operators[0]) //Clear
        {
            display.setText("");
            firstNumber = 0;
            secondNumber = 0;
            numberLock = false;

        }
        else if(e.getSource() == operators[1]) //Equal
        {
            if(!equalLock)
            {
                secondNumber = Integer.parseInt(display.getText());
                if(operation == '+')
                {
                    firstNumber = firstNumber + secondNumber;
                    display.setText(firstNumber + "");

                }
                else if(operation == '-')
                {
                    firstNumber = firstNumber - secondNumber;
                    display.setText(firstNumber + "");
                }
                else if(operation == '*')
                {
                    firstNumber = firstNumber * secondNumber;
                    display.setText(firstNumber + "");
                }
                else if(operation == '/')
                {
                    if(secondNumber == 0)
                    {
                        display.setText("");
                        firstNumber = 0;
                        secondNumber = 0;
                        errorFlag = true;
                    }
                    else
                    {
                        firstNumber = firstNumber / secondNumber;
                        display.setText(firstNumber + "");
                    }

                }

                operatorLock = false;
                equalLock = true;
                operation = 'x';
                if(errorFlag)
                {
                    numberLock = false;
                    errorFlag = false;
                }
                else
                {
                    numberLock = true;
                }

            }

        }
        else if(e.getSource() == operators[2]) //Plus
        {
            if(!operatorLock)
            {
                firstNumber = Integer.parseInt(display.getText());
                operatorLock = true;
                equalLock = false;
                operation = '+';
                display.setText("");
                numberLock = false;
            }
        }
        else if(e.getSource() == operators[3]) //Minus
        {
            if(!operatorLock)
            {
                firstNumber = Integer.parseInt(display.getText());
                operatorLock = true;
                equalLock = false;
                operation = '-';
                display.setText("");
                numberLock = false;
            }

        }
        else if(e.getSource() == operators[4]) //Multiply
        {
            if(!operatorLock)
            {
                firstNumber = Integer.parseInt(display.getText());
                operatorLock = true;
                equalLock = false;
                operation = '*';
                display.setText("");
                numberLock = false;
            }

        }
        else if(e.getSource() == operators[5]) //Divide
        {
            if(!operatorLock)
            {
                firstNumber = Integer.parseInt(display.getText());
                operatorLock = true;
                equalLock = false;
                operation = '/';
                display.setText("");
                numberLock = false;
            }

        }

    }

    public void addNumberInDisplay(int num)
    {
        if(!numberLock)
        {
            String text = display.getText();
            text = text + numbers[num].getText();
            display.setText(text);
        }

    }


    public static void main(String[] args) {
        // new Calculator();
        SwingUtilities.invokeLater(Calculator::new);
    }
}