import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class login extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,bi;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;

	login()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setContentPane(new JLabel (new ImageIcon("xyz.jpg")));
		l1=new JLabel(new ImageIcon("member.png"));
		l2=new JLabel("User Name:-");
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l3=new JLabel("Password:-");
		l3.setFont(new Font("Serif", Font.BOLD, 20));
		tf=new JTextField();
		tf.setFont(new Font("Courier new",Font.BOLD,20));
		pf=new JPasswordField();
		b1=new JButton(new ImageIcon("Resized-5V3AY.png"));
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b2=new JButton(new ImageIcon("Resized-64WFB.png"));
		b2.setContentAreaFilled(false);
		b2.setOpaque(false);
		b2.setBorderPainted(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
		l1.setBounds(0, 0, 580, 154);
		l2.setBounds(70, 210, 200, 30);
		l3.setBounds(70, 280, 200, 30);

		tf.setBounds(230, 210, 300, 30);
		pf.setBounds(230, 280, 300, 30);
		
		b1.setBounds(55, 370, 200,64);
		b2.setBounds(322, 370, 200,64);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		//bi.setIcon(new ImageIcon(getClass().getResource("BACKLOGIN.jpg")));getContentPane().add(bi);
		//bi.setBounds(-560, -170, 1800, 900);
		f.setUndecorated(false);
		f.setVisible(true);
		f.setSize(578, 500);
		//setIconImage(new ImageIcon("").getImage());
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		public void windowClosing(WindowEvent e) 
			{
			  new whichtemplate();
			}
		public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			{
			new signup();
			}}


public void b2actionPerformed(ActionEvent e){
	int found=0;
		try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select uname, npswd from new_user");
            String us=tf.getText();
            String ps=pf.getText();
            while(rs.next())
            {  
                if(us.equals(rs.getString(1)) && ps.equals(rs.getString(2)))
                {
					new afterlogin();
                    //JOptionPane.showMessageDialog(null,"Correct Username & Password");
                    //found=1;
                    //break;
                }
            }
            if (found==0)
            {
                JOptionPane.showMessageDialog(null,"Incorrect Username or Password...!!!");
            }
            } 
        catch (ClassNotFoundException | SQLException evt) {
            JOptionPane.showMessageDialog(null,evt);
        }}



		public static void main(String args[])
			{
			new login();
			}
}