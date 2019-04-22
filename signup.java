import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10/*,l11,l12*/;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JPasswordField pf1,pf2;
	JComboBox cb;
	JButton b1,b2,b3,b4;
	String sq;

	signup()
	{
	f=new JFrame();
	f.setContentPane(new JLabel (new ImageIcon("Light.jpg")));
	l1=new JLabel("Create Your New Account & Get Started");
	l1.setFont(new Font("serif", Font.BOLD,29));
	l1.setForeground(Color.BLUE);
	l1.setBounds(35,10, 600,50);
	l2=new JLabel("Full Name :");
	l2.setFont(new Font("serif", Font.BOLD,15));
	l2.setBounds(40,90, 200,30);
	l3=new JLabel("User Name :");
	l3.setFont(new Font("serif", Font.BOLD,15));
	l3.setBounds(40,140, 200,30);
	l4=new JLabel("Email ID :");
	l4.setFont(new Font("serif", Font.BOLD,15));
	l4.setBounds(40,190, 200,30);
	l5=new JLabel("Gender :");
	l5.setFont(new Font("serif", Font.BOLD,15));
	l5.setBounds(40,240, 200,30);
	l6=new JLabel("Age :");
	l6.setFont(new Font("serif", Font.BOLD,15));
	l6.setBounds(435,240, 200,30);
	l7=new JLabel("New Password :");
	l7.setFont(new Font("serif", Font.BOLD,15));
	l7.setBounds(40,290, 200,30);
	l8=new JLabel("Re-Enter Password :");
	l8.setFont(new Font("serif", Font.BOLD,15));
	l8.setBounds(40,340, 200,30);
	l9=new JLabel("Security Question :");
	l9.setFont(new Font("serif", Font.BOLD,15));
	l9.setBounds(40,390, 200,30);
	l10=new JLabel("Answer :");
	l10.setFont(new Font("serif", Font.BOLD,15));
	l10.setBounds(40,440, 200,30);
	//l11=new JLabel("(This may be your nick-name with combination of characters)");
	//l11.setBounds(50,50, 100,30);
	//l12=new JLabel("i.e. abc@gmail.com, def@yahoo.com or xyz@hotmail.com");
	//l12.setBounds(50,50, 100,30);
	tf1=new JTextField();
	tf1.setBounds(210,90, 317,30);
	tf2=new JTextField();
	tf2.setBounds(210,140, 317,30);
	tf3=new JTextField();
	tf3.setBounds(210,190, 317,30);
	tf4=new JTextField();
	tf4.setBounds(475,240, 50,30);
	tf5=new JTextField();
	tf5.setBounds(210,440, 317,30);
	pf1=new JPasswordField();
	pf1.setBounds(210,290, 317,30);
	pf2=new JPasswordField();
	pf2.setBounds(210,340, 317,30);
	String sq[]={"What is your mother's maiden name?","What was your childhood nickname?","What school did you attend for sixth grade?","What is the name of your Best Friend?","What was the name of your first stuffed animal?"};
	cb=new JComboBox(sq);
	cb.setBounds(210, 390,317,30);
	b1=new JButton(new ImageIcon("Resized-1X4WM.png"));
	b1.setBounds(528,144,18,18);
	b1.setToolTipText("This may be your nick-name with combination of characters");
	b1.setContentAreaFilled(false);
	b1.setOpaque(false);
	b1.setBorderPainted(false);
	b2=new JButton(new ImageIcon("Resized-1X4WM.png"));
	b2.setBounds(528,194,18,18);
	b2.setToolTipText("i.e. abc@gmail.com, def@yahoo.com or xyz@hotmail.com");
	b2.setContentAreaFilled(false);
	b2.setOpaque(false);
	b2.setBorderPainted(false);
	b3=new JButton(new ImageIcon("Resized-NKEPA.png"));
	b3.setBounds(55,510,200,66);
	b3.setContentAreaFilled(false);
	b3.setOpaque(false);
	b3.setBorderPainted(false);
	b3.addActionListener(this);
	b4=new JButton(new ImageIcon("Resized-J1TL5.png"));
	b4.setBounds(317,510,200,66);
	b4.setContentAreaFilled(false);
	b4.setOpaque(false);
	b4.setBorderPainted(false);
	JRadioButton r1=new JRadioButton("Male");
	JRadioButton r2=new JRadioButton("Female");
	JRadioButton r3=new JRadioButton("Others");
	r1.setBounds(210,240,60,30);
	r1.setContentAreaFilled(false);
	r1.setOpaque(false);
	r1.setBorderPainted(false);
	r2.setBounds(270,240,70,30);
	r2.setContentAreaFilled(false);
	r2.setOpaque(false);
	r2.setBorderPainted(false);
	r3.setBounds(340,240,70,30);
	r3.setContentAreaFilled(false);
	r3.setOpaque(false);
	r3.setBorderPainted(false);
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);bg.add(r2);bg.add(r3);
	b4.addActionListener(this);
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	f.add(l6);
	f.add(l7);
	f.add(l8);
	f.add(l9);
	f.add(l10);
	//f.add(l11);
	//f.add(l12);
	f.add(tf1);
	f.add(tf2);
	f.add(tf3);
	f.add(tf4);
	f.add(tf5);
	f.add(pf1);
	f.add(pf2);
	f.add(cb);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.setSize(595,650);
	f.setLayout(null);
	f.setLocationRelativeTo(null);
	f.setResizable(false);
	f.setUndecorated(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
}

public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b3)
			
			{
			new login();
			f.setVisible(false);
			}
        }

public void b4actionPerformed(ActionEvent e)
{
	int found=0;
	try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","12345");
			PreparedStatement ps=con.prepareStatement("insert into project.new_user values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1,tf1.getText());
			ps.setString(2,tf2.getText());
			ps.setString(3,tf3.getText()); 

			//ps.setActionCommand(4,(String)bg.getText());
			//maleButton.setActionCommand( maleButton.getText() );

			ps.setInt(5,Integer.parseInt(tf4.getText()));
			ps.setString(6,pf1.getText());
			ps.setString(7,pf2.getText());
			ps.setString(8,(String)cb.getSelectedItem());
			ps.setString(9,tf5.getText());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null,"You are added...!!!");
			}
	catch (Exception ev)
		{
			JOptionPane.showMessageDialog(null,ev);
		}
			}
		
public static void main(String args[])
	{
		new signup();
	}
}