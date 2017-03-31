//mouse listener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseListenerTest extends JFrame implements MouseListener
{
    Container cntr;
    JTextField txt;
    JTextArea txtarea;
    MouseListenerTest()
    {
	cntr=this.getContentPane();
	cntr.setLayout(null);
	cntr.setBackground(new Color(200,100,20));

	txt=new JTextField();
	txt.setBounds(10,20,80,40);

	txtarea=new JTextArea();
	txtarea.setBounds(150,20,200,400);

	//	txt.addKeyListener(this);
	

	txt.addMouseListener(this);
		cntr.add(txt);
	cntr.add(txtarea);
    }

    public void mouseEntered(MouseEvent e)
    {
	txtarea.append("mouse enter\n");
    }
    public void mouseExited(MouseEvent e)

    {
	txtarea.append("mouse exit\n");
    }
    public void mouseReleased(MouseEvent e)
    {
	txtarea.append("mouse released\n");
	
    }
    public void mousePressed(MouseEvent e)
    {
	txtarea.append("mouse pressed\n");
	
    }
    public void mouseClicked(MouseEvent e)
    {
	txtarea.append("mouse clicked\n");
    }
    public void mouseMoved(MouseEvent e){
	txtarea.append("Mouse moved");
    }
    
}

class MouseListenerMain
{

     public static void main(String args[])
    {

	MouseListenerTest k=new MouseListenerTest();
	k.setVisible(true);
	k.setBounds(40,100,500,200);
	k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }	
}
