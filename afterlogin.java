import javax.swing.*;
import java.awt.event.*;    
import java.awt.*;
/*import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;*/

public class afterlogin extends JFrame implements ActionListener
		{
			JFrame f;
			JButton login,sv,ex,b1,b2,b3,b4,b5,b6,b7,b8;
			JLabel l1,l2,l3,l4,l5,l6,l7,l8;
			
		afterlogin()
		{
		f=new JFrame();
		f.setLayout(null);
		f.setContentPane(new JLabel (new ImageIcon("Light-Wallpaper.jpg")));
		login=new JButton(new ImageIcon("Resized-15QD4.png"));
		login.setContentAreaFilled(false);
		login.setOpaque(false);
		login.setBorderPainted(false);
		sv=new JButton(new ImageIcon("Resized-X5N1X.png"));
		sv.setContentAreaFilled(false);
		sv.setOpaque(false);
		sv.setBorderPainted(false);
		ex=new JButton(new ImageIcon("Resized-SV7ER.png"));
		ex.setContentAreaFilled(false);
		ex.setOpaque(false);
		ex.setBorderPainted(false);
		b1=new JButton(new ImageIcon("Blank Document.png"));
		b2=new JButton(new ImageIcon("Normal Resume.png"));
		b3=new JButton(new ImageIcon("Crisp & Clean Resume.png"));
		b4=new JButton(new ImageIcon("Polished resume.png"));
		b5=new JButton(new ImageIcon("Cover Letter.png"));
		b6=new JButton(new ImageIcon("Spring Event Flyer.png"));
		b7=new JButton(new ImageIcon("Thank You.png"));
		b8=new JButton(new ImageIcon("Fax Cover sheet.png"));
		l1=new JLabel("Blank Document");
		l1.setFont(new Font("serif", Font.BOLD,15));
		l2=new JLabel("Normal Resume");
		l2.setFont(new Font("serif", Font.BOLD,15));
		l3=new JLabel("Crisp & Clean Resume");
		l3.setFont(new Font("serif", Font.BOLD,15));
		l4=new JLabel("Polished resume");
		l4.setFont(new Font("serif", Font.BOLD,15));
		l5=new JLabel("Cover Letter");
		l5.setFont(new Font("serif", Font.BOLD,15));
		l6=new JLabel("Spring Event Flyer");
		l6.setFont(new Font("serif", Font.BOLD,15));
		l7=new JLabel("Thank You");
		l7.setFont(new Font("serif", Font.BOLD,15));
		l8=new JLabel("Fax Cover sheet");
		l8.setFont(new Font("serif", Font.BOLD,15));
		login.setBounds(100,101,200,64);
		sv.setBounds(100,342,200,64);
		ex.setBounds(100,583,200,64);
		b1.setBounds(406,100,160,200);
		b2.setBounds(646,100,160,200);
		b3.setBounds(886,100,160,200);
		b4.setBounds(1126,100,160,200);
		b5.setBounds(406,448,160,200);
		b6.setBounds(646,448,160,200);
		b7.setBounds(886,448,160,200);
		b8.setBounds(1126,448,160,200);
		l1.setBounds(430,310,130,30);
		l2.setBounds(670,310,130,30);
		l3.setBounds(890,310,180,30);
		l4.setBounds(1145,310,130,30);
		l5.setBounds(440,658,130,30);
		l6.setBounds(665,658,180,30);
		l7.setBounds(930,658,130,30);
		l8.setBounds(1150,658,130,30);
		login.addActionListener(this);
		sv.addActionListener(this);
		ex.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		f.add(login);
		f.add(sv);
		f.add(ex);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
		
		public void actionPerformed(ActionEvent ea) 
		{ 
			if(ea.getSource()==login)
				{
				new whichtemplate();
				//dispose();
				setVisible(false);
				}
			if(ea.getSource()==sv)
				{JFileChooser saveFile = new JFileChooser();
				 saveFile.setDialogTitle("Specify a file to Save");
                 saveFile.showSaveDialog(null);
				 }
			if(ea.getSource()==ex)
				{
				System.exit(0);
				}
			if(ea.getSource()==b1)
				{
				new TE();
				}
			if(ea.getSource()==b2)
				{
				}
			if(ea.getSource()==b3)
				{
				}
			if(ea.getSource()==b4)
				{
				}
			if(ea.getSource()==b5)
				{
				}
			if(ea.getSource()==b6)
				{
				}
			if(ea.getSource()==b7)
				{
				}
			if(ea.getSource()==b8)
				{
				}
		}
    public static void main(String[] args) 
		{    
        new afterlogin();
    }
    }