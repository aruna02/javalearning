//KeyListener 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyListenerTest extends JFrame implements KeyListener
{
    Container cntr;
    JTextField txt;
    JTextArea txtarea;
    KeyListenerTest()
    {
	cntr=this.getContentPane();
	cntr.setLayout(null);
	cntr.setBackground(new Color(200,100,20));

	txt=new JTextField();
	txt.setBounds(10,20,80,40);

	txtarea=new JTextArea();
	txtarea.setBounds(150,20,200,400);

	txt.addKeyListener(this);
	
	
	cntr.add(txt);
	cntr.add(txtarea);
    }

    public void keyPressed(KeyEvent e)
    {
	txtarea.append("Key pressed:"+e.getKeyChar()+"\n"); 
    }
  
      public void keyReleased(KeyEvent e)
     {
	 txtarea.append("Key released\n"); 
     }
      public void keyTyped(KeyEvent e)
    {
	txtarea.append("Key typed\n"); 
    }
}

class KeyListenerMain
{

    public static void main(String args[])
    {

	KeyListenerTest k=new KeyListenerTest();
	k.setVisible(true);
	k.setBounds(40,100,500,200);
	k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }	
}
