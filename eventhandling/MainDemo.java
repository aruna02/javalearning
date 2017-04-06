import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationDemo extends JFrame
{
Container c;
    JLabel lblname;
    JLabel lblnumber;
    JLabel lbldob;
    JLabel lblgender;
    JLabel lbladdress;
    JTextField txtname;
    JTextField txtnumber;
    JRadioButton rmale;
    JRadioButton rfemale;
    JComboBox cday,cmonth,cyear;
    JTextField txtaddress;
    JCheckBox box1;
    JButton btnlogin;
    JTextArea txtarea1;
    
RegistrationDemo()
{
c=this.getContentPane();
c.setLayout(null);
c.setBackground(Color.YELLOW);


lblname=new JLabel("name:");
lblname.setBounds(30,50,70,30);

lblnumber=new JLabel("number:");
lblnumber.setBounds(30,90,70,30);

lbldob=new JLabel("DOB");
lbldob.setBounds(30,130,70,30);



lblgender=new JLabel("gender");
lblgender.setBounds(30,170,70,30);


lbladdress=new JLabel("address");
lbladdress.setBounds(30,210,70,30);

txtname=new JTextField();
txtname.setBounds(100,50,150,30);

txtnumber=new JTextField();
txtnumber.setBounds(100,90,150,30);

rmale=new JRadioButton("male");
rmale.setBounds(100,170,70,30);



rfemale=new JRadioButton("female");
rfemale.setBounds(170,170,70,30);

ButtonGroup gendergroup=new ButtonGroup();
gendergroup.add(rmale);
gendergroup.add(rfemale);

String day[]=new String[31];
for(int i=1;i<=31;i++)
    {
	day[i-1]=Integer.toString(i);
    }
cday=new JComboBox(day);
cday.setBounds(100,130,70,30);

String month[]={"jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};
cmonth=new JComboBox(month);
cmonth.setBounds(180,130,70,30);
    
String year[]=new String[50];
for(int i=1990;i<2015;i++)
    {
	year[i-1990]=Integer.toString(i);
    }
cyear=new JComboBox(year);
cyear.setBounds(260,130,70,30);

txtaddress=new JTextField();
txtaddress.setBounds(100,210,150,50);

box1=new JCheckBox("I accept the terms and conditions");
box1.setBounds(30,270,300,20);

btnlogin=new JButton("login");
btnlogin.setBounds(60,320,100,50);

txtarea1=new JTextArea();
txtarea1.setBounds(500,30,300,500);

c.add(lblname);
c.add(lblnumber);
c.add(lbldob);
c.add(lbladdress);
c.add(lblgender);
c.add(txtname);
c.add(txtnumber);
c.add(cday);
c.add(cmonth);
c.add(cyear);
c.add(rmale);
c.add(rfemale);
c.add(txtaddress);
c.add(box1);
c.add(btnlogin);
c.add(txtarea1);
}

}

class MainDemo
{
public static void main(String args[])
{
RegistrationDemo r=new RegistrationDemo();
r.setVisible(true);
r.setBounds(100,100,1000,500);
r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
    
