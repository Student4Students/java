import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener
{
    JButton btn;
    JTextField tf1;
    JTextField tf2;
    Frame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setLayout(null);
        setTitle("Question 2");

        JLabel l1 = new JLabel("Username :");
        l1.setBounds(100,50,200,50);
        add(l1);

        tf1 = new JTextField();
        tf1.setBounds(100,100,200,30);
        add(tf1);

        JLabel l2 = new JLabel("Password :");
        l2.setBounds(100,150,200,50);
        add(l2);

        tf2 = new JTextField();
        tf2.setBounds(100,200,200,30);
        add(tf2);

        btn = new JButton("SUBMIT");
        btn.setBounds(150,250,100,30);
        btn.addActionListener(this);
        add(btn);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn)
        {
            if(tf1.getText().equals("pratik") && tf2.getText().equals("java"))
            {
                JOptionPane.showMessageDialog(this,"Successful Login!!!","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Wrong Inputs!!!","Result",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class Question2
{
    public static void main(String args[])
    {
        new Frame();
    }
}