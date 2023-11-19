import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Panel extends JPanel implements MouseListener
{
    int i = 0;
    ArrayList<Integer> al = new ArrayList<Integer>();
    Panel()
    {
        addMouseListener(this);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Integer n: al)
        {
            if(n==1)
            {
                g.setColor(Color.RED);
                g.fillOval(100,100,300,300);
            }
            else if(n==2)
            {
                g.setColor(Color.GREEN);
                g.fillRect(100,100,250,350);
            }
            else if(n==3)
            {
                g.setColor(Color.BLUE);
                g.fillOval(100,100,350,250);
            }
        }

    }
    public void mouseClicked(MouseEvent e)
    {
        if(i==3)
        {
            i=1;
            al.add(1);
        }
        else
        {
            i++;
            al.add(i);
        }
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
}


class Question3
{
    public static void main(String args[])
    {
        JFrame f = new JFrame();
        f.setTitle("Question 3");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);

        f.add(new Panel());
        f.setVisible(true);
    }
}