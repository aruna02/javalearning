//program using swing component to add two numbers. use textfield for inputs and output. your program should display the result when the user presses a button
//importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Addition extends JFrame implements ActionListener{
	Container cntr;
	JTextField txt1;
	JTextField txt2;
	JButton  btn1;
	JTextField txt3; //for showing result
	
	Addition(){
	cntr=this.getContentPane();
	cntr.setLayout(null);

txt1=new JTextField();
txt1.setBounds(20,20,100,30);

txt2=new JTextField();
txt2.setBounds(20,70,100,30);
txt3=new JTextField();
txt3.setBounds(20,150,100,30);

btn1=new JButton("add");
btn1.setBounds(20, 200,100,30);
btn1.addActionListener(this);

//adding in container
cntr.add(txt1);
cntr.add(txt2);
cntr.add(txt3);
cntr.add(btn1);

}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==btn1){
	int a=Integer.parseInt(txt1.getText());
	int b=Integer.parseInt(txt2.getText());
	int c=a+b;
	txt3.setText(String.valueOf(c));
}
}

}
class examtest{

public static void main(String args[]){

Addition first=new Addition();
first.setVisible(true);
first.setBounds(50,50,500,500);
first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}}
