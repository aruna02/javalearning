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
txtname.setBounds(100,50,100,30);

txtnumber=new JTextField();
txtnumber.setBounds(100,90,100,30);

rmale=new JRadioButton("male");
rmale.setBounds(100,170,70,30);

rfemale=new JRadioButton("female");
rfemale.setBounds(200,170,70,30);
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
    
