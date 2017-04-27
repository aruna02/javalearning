//add event handling ,,action listener-in submit button in menuitem and in entering in textbox

//for menu
//checkbox in menu
//menu is always set in frame not in container
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Demo extends JFrame implements ActionListener{

    Container c;
    JMenuBar menubar;
    JMenu file;
    JMenuItem i1,i2;
    JMenuItem add;
    JMenu zm;
    JMenu edit;
    Demo(){

	c=this.getContentPane();
	c.setLayout(null);

	//c.setBounds()

	//adding menubar
	menubar=new JMenuBar();
	
	menubar.setBackground(Color.GREEN);

	//menu file
	file=new JMenu("file");
	file.setMnemonic('i');

	//menu edit
	edit=new JMenu("edit");
	edit.setMnemonic('e');

	//adding file and edit menus in menubar
	menubar.add(file);
	menubar.add(edit);

	//menu item i1
	i1=new JMenuItem("new");
	i1.setBackground(Color.RED);

	//adding menu item in the menu file
	file.add(i1);
	//adding separator
	file.addSeparator();
	//next menuitem i2
	i2=new JMenuItem("save");
	i2.addActionListener(this);
	file.add(i2);
	file.addSeparator();

	//adding next menuitem add in the file menu
	add=new JMenuItem("add");
	file.add(add);
	
	file.setForeground(Color.RED);
	zm=new JMenu("zoom");
	edit.add(zm);
	
	this.setJMenuBar(menubar);
    }

    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource()==i2)
	    {	JFileChooser f=new JFileChooser(".");
    f.showOpenDialog(null);
    }
    }
}

class MainMenu{

    public static void main(String args[]){
	Demo d=new Demo();
	d.setVisible(true);
	d.setBounds(10,10,1000,500);
	d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
}
