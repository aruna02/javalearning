//mouse motionlistener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyClass extends JFrame implements ActionListener
{
    Container cntr;
    JPanel panel;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton btnlogin;
    JLabel username;
    JLabel password;

    MyClass() {
	cntr=this.getContentPane();
	cntr.setLayout(null);
	cntr.setBackground(new Color(255,34,97));


	panel= new JPanel();
	panel.setBounds(200,200,250,200);
	// panel.setLocation(,100);
	panel.setSize(400,400);
	panel.setBackground(Color.GREEN);
	panel.setLayout(null);
	cntr.add(panel);
	
	username = new JLabel("Username:");
	password = new JLabel("Password");
	username.setBounds(10,20,200,40);
	password.setBounds(10,50,100,40);
	
	usernametxt = new JTextField();
	passwordtxt = new JPasswordField();

	btnlogin = new JButton("Submit");
	btnlogin.setBounds(150,150,100,50);



	btnlogin.addActionListener(this);

	
	usernametxt.setBounds(80,20,200,40);
	passwordtxt.setBounds(80,60,200,40);
	panel.add(usernametxt);
	panel.add(passwordtxt);
	panel.add(btnlogin);
	panel.add(username);
	panel.add(password);

	


    }




    public void actionPerformed(ActionEvent e) {


	if( e.getSource() == btnlogin ) { 
	    	String usernametaken = usernametxt.getText();
		String passwordtaken = passwordtxt.getText();	//if( usernametaken.equals(passwordtaken)) { 
		//  panel.setBackground(Color.BLUE);
		//	}
		if(usernametaken.equals("aruna") && passwordtaken.equals("aruna"))
		    {
			panel.setBackground(Color.BLUE);
			lblwritemsg.setBounds(50,100,200,50);
			panel.add(lblwritemsg);
			panel.remove(lblwrnmsg);
		    }
		else
		    {

			panel.setBackground(Color.RED);
			lblwrnmsg.setBounds(50,100,200,50);
			panel.add(lblwrnmsg);
			panel.remove(lblwritemsg);
			
		    }

	}
	
	
	
	
    }
    JLabel lblwritemsg=new JLabel("process continues");
    JLabel lblwrnmsg=new JLabel("username and password doesn't match");

}

class NewAfterMotion{
    public static void main(String[] args){
	
	MyClass meroclass = new MyClass();
	meroclass.setVisible(true);
	meroclass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	meroclass.setBounds(200,200,300,200);
	
    }

}
