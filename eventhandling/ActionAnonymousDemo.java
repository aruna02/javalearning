//event handling using anonymous class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe1 extends JFrame
{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    Container cntr;
    JTextField txt;
    JTextField newtxt;
    Myframe1() //overriding construtor
    {
	cntr=this.getContentPane();
	cntr.setLayout(null);

	btn1=new JButton("BLUE");
	btn1.setBounds(10,10,80,30);
	btn2=new JButton("red");
	btn2.setBounds(100,10,80,30);
	btn3=new JButton("orange");
	btn3.setBounds(200,10,80,30);

	txt=new JTextField();
	txt.setBounds(200,50,100,30);
	newtxt=new JTextField();
	newtxt.setBounds(400,10,80,30);
	newtxt.addActionListener(new ActionListener()
	    {
		public void actionPerformed(ActionEvent a)
		{
		    String aa=newtxt.getText();
		    String b=aa.toLowerCase();
		    newtxt.setText(b);
		}
	    });
	
	btn1.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e)
		{

		    cntr.setBackground(Color.BLUE);
		}
		
	    });
	btn2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
		    cntr.setBackground(Color.RED);
		}
	    }
			       );

	btn3.addActionListener(new ActionListener()
	    {
				public void actionPerformed(ActionEvent e)
		{
		    cntr.setBackground(Color.ORANGE);
		}    
	    });

	txt.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e)
		{
		    // cntr.setBackground(new Color(100,250,234));
		    String text=txt.getText();
		    String newtext=text.toUpperCase();
		    txt.setText(newtext);
		    
		}
	    });
	cntr.add(btn1);
	cntr.add(btn2);
	cntr.add(btn3);
	cntr.add(txt);
	cntr.add(newtxt);
	
    }

     
}
    

class ActionAnonymousDemo
{
    public static void main(String args[])
    {
	Myframe1 f=new Myframe1();
	f.setVisible(true);
	f.setBounds(50,50,700,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
}
