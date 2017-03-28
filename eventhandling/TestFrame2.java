//event handling

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe1 extends JFrame implements ActionListener //implementing ActionListener interface
{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    Container cntr;
    JTextField txt;
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
       
	btn1.addActionListener(this);
	btn2.addActionListener(this);

        btn3.addActionListener(this);


	cntr.add(btn1);
	cntr.add(btn2);
	cntr.add(btn3);
	cntr.add(txt);
	
    }

     public void actionPerformed(ActionEvent e)
	 
    {
	if(e.getSource()==btn1)
	    {
	cntr.setBackground(Color.BLUE);
	txt.setText("BLUE");
	txt.setEnabled(false);
	    }
	if(e.getSource()==btn2)
	    {
	cntr.setBackground(Color.RED);
	txt.setText("RED");
	    }
	if(e.getSource()==btn3)
	    {
	cntr.setBackground(Color.ORANGE);
	txt.setText("ORANGE");
	    }
	

}
}

class TestFrame2
{
    public static void main(String args[])
    {
	Myframe1 f=new Myframe1();
	f.setVisible(true);
	f.setBounds(50,50,700,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
}
