import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener
{
    JComboBox box1;
    JComboBox box2;
    JLabel header;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    Frame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setTitle("Question 4");

        header = new JLabel("Pratik");
        header.setBounds(0,0,500,200);
        add(header);

        JLabel l1 = new JLabel("Font Name(ComboBox):");
        l1.setBounds(0,200,500,30);
        add(l1);

        String[] fontNames = {"Arial","Times New Roman","Serif","SansSerif"};
        box1 = new JComboBox(fontNames);
        box1.setBounds(0,230,200,30);
        box1.addActionListener(this);
        add(box1);

        JLabel l2 = new JLabel("Font Size(ComboBox):");
        l2.setBounds(0,280,500,30);
        add(l2);

        Integer[] fontSize = {22,24,26,28,30,32};
        box2 = new JComboBox(fontSize);
        box2.setBounds(0,310,200,30);
        box2.addActionListener(this);
        add(box2);

        JLabel l3 = new JLabel("Font Style(Radio Buttons):");
        l3.setBounds(0,350,500,30);
        add(l3);


        rb1 = new JRadioButton("Bold");
        rb2 = new JRadioButton("Italics");
        rb3 = new JRadioButton("Plain");

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        ButtonGroup style = new ButtonGroup();
        style.add(rb1);
        style.add(rb2);
        style.add(rb3);

        add(rb1).setBounds(0,380,100,20);
        add(rb2).setBounds(0,400,100,20);
        add(rb3).setBounds(0,420,100,20);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==box1)
        {
            Font cf = header.getFont();
            Font f = new Font((String) box1.getSelectedItem(),cf.getStyle(),cf.getSize());
            header.setFont(f);
        }
        else if(e.getSource()==box2)
        {
            Font cf = header.getFont();
            Font f = new Font(cf.getFamily(),cf.getStyle(),(Integer)box2.getSelectedItem());
            header.setFont(f);
        }
        else if(e.getSource()==rb1)
        {
            Font cf = header.getFont();
            Font f = new Font(cf.getFamily(), Font.BOLD,cf.getSize());
            header.setFont(f);
        }
        else if(e.getSource()==rb2)
        {
            Font cf = header.getFont();
            Font f = new Font(cf.getFamily(), Font.ITALIC,cf.getSize());
            header.setFont(f);
        }
        else if(e.getSource()==rb2)
        {
            Font cf = header.getFont();
            Font f = new Font(cf.getFamily(), Font.PLAIN,cf.getSize());
            header.setFont(f);
        }
    }
}

class Practice
{
    public static void main(String args[])
    {
        new Frame();
    }
}