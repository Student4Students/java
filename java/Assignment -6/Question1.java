import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    Frame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,300);
        setTitle("Question 1");

        b1 = new JButton("RED");
        b1.setBounds(100,50,200,50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BLUE");
        b2.setBounds(100,110,200,50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("GREEN");
        b3.setBounds(100,170,200,50);
        b3.addActionListener(this);
        add(b3);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            getContentPane().setBackground(Color.RED);
        }
        else if (e.getSource()==b2)
        {
            getContentPane().setBackground(Color.BLUE);
        }
        else if(e.getSource()==b3)
        {
            getContentPane().setBackground(Color.GREEN);;
        }
    }
}

class Question1
{
    public static void main(String args[])
    {
        new Frame();
    }
}