import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StudentRegForm extends WindowAdapter implements ActionListener
{

	JFrame f= new JFrame("Student registration form");
	JButton b1,b2,b3;
	JTextArea ta1=new JTextArea();
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JCheckBox c1,c2,c3,c4,c5;
	JRadioButton rb1,rb2;
	Choice ch=new Choice();
	
	StudentRegForm()
	{
	b1=new JButton("Register");
	b2=new JButton("Get Data");
	b3=new JButton("Clear");
	l1=new JLabel("Reg Number:");
	l2=new JLabel("Student Name:");
	l3=new JLabel("Date Of Birth (DD/MM/YYYY):");
	tf1=new JTextField();
	tf2=new JTextField();
	tf3=new JTextField();
	
	l8=new JLabel("Gender:");
	rb1=new JRadioButton("Male");
	rb2=new JRadioButton("Female");
	
	l4=new JLabel("Branch:");
	l5=new JLabel("Pragramming Languages:");
	l6=new JLabel("Address:");
	tf4=new JTextField();
	l7=new JLabel("Operation:");
	
	l1.setBounds(30,50,150,50);
	tf1.setBounds(250,50,170,30);
	
	l2.setBounds(30,100,150,50);
	tf2.setBounds(250,100,170,30);
	
	l3.setBounds(30,150,150,50);
	tf3.setBounds(250,150,170,30);
	
	
	l8.setBounds(30,200,150,50);
	rb1.setBounds(250,200,100,30);
	rb2.setBounds(350,200,100,30);
	
	l4.setBounds(30,250,150,50);
	ch.addItem("CSE");
	ch.addItem("ECE");
	ch.addItem("IT");
	ch.addItem("AI&DS");
	ch.setBounds(250,250,150,50);
	
	l5.setBounds(30,300,150,30);
	c1=new JCheckBox("Java");
	c2=new JCheckBox("C");
	c3=new JCheckBox("C++");
	c4=new JCheckBox("Python");
	c1.setBounds(250,300,100,50);
	c2.setBounds(350,300,100,50);
	c3.setBounds(450,300,100,50);
	c4.setBounds(550,300,100,50);
	
	l6.setBounds(30,400,100,50);
	ta1.setBounds(250,400,200,50);
	
	l7.setBounds(30,550,150,50);
	b1.setBounds(100,550,100,30);
	b2.setBounds(200,550,100,30);
	b3.setBounds(310,550,100,30);
	
	
	f.add(ch);
	f.add(l1);
	f.add(l5);
	f.add(l6);
	f.add(l7);
	f.add(rb1);
	f.add(rb2);
	f.add(l8);
	f.add(c1);
	f.add(c2);
	f.add(c3);
	f.add(c4);
	f.add(tf1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(ta1);
	f.add(tf2);
	f.add(tf3);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.addWindowListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	f.setLayout(null);
	f.setSize(800,800);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Dialog d1=new Dialog(f,"Data Save Successfull!!!");
			d1.setBounds(250,250,150,100);
			d1.setVisible(true);
			d1.addWindowListener(this);
			f.add(d1);
		}else
		if(ae.getSource()==b2)
		{
			Dialog d1=new Dialog(f,"Data Save Successfull!!!");
			d1.setLayout(new GridLayout());
			
			d1.setVisible(true);
			d1.setSize(300,300);
			d1.addWindowListener(this);
			f.add(d1);
			d1.dispose();
		}else
		if(ae.getSource()==b3)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			ta1.setText("");
		}else{
			f.dispose();
		}
		try
		{
			String Regno =tf1.getText();
			String Stname = tf2.getText();
			String Gen = rb1.getText();
			String Add = ta1.getText();
			
			if (ae.getSource().equals(tf1)) 
			{
				//Get User By ID
				qry = "SELECT ID,NAME,AGE,CITY from users where ID=" + txtId.getText();
				stmt =con.createStatement();
				rs = stmt.executeQuery(qry);
				if (rs.next()) {
					txtId.setText(rs.getString("ID"));
					txtName.setText(rs.getString("NAME"));
					txtAge.setText(rs.getString("AGE"));
					txtCity.setText(rs.getString("CITY"));
 
				} else {
					clear();
					lblStatus.setText("Invalid ID");
 
				}
			}
	}

		
	public void windowClosing(WindowEvent we)
	{
		f.dispose();
	}
public static void main(String args[]){
   StudentRegForm s1=new StudentRegForm();
 }
}
