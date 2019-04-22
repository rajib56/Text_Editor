import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.UIManager;

public class dialog extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l2;
	JButton b1;

	dialog()
	{
		f=new JFrame();
		f.setLayout(new GridLayout());
		f.setContentPane(new JLabel (new ImageIcon("xyz.jpg")));
		l2=new JLabel("<html> Please <br> LOGIN <br> and Access Your Account !!!</html>");
		l2.setFont(UIManager.getFont("Label.font"));
		//l2.setFont(new Font("Serif", Font.BOLD, 30));
		b1=new JButton(new ImageIcon("Resized-5V3AY.png"));
		b1.setContentAreaFilled(false);
		b1.setOpaque(false);
		b1.setBorderPainted(false);
		b1.addActionListener(this);
		l2.setBounds(70, 210, 1000, 400);
		
		b1.setBounds(55, 370, 200,64);
		f.add(l2);
		f.add(b1);
		f.pack();
		f.setVisible(true);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public void actionPerformed(ActionEvent e) 
		{

		if(e.getSource()==b1)
			{
			new login();
			}}
		public static void main(String args[])
			{
			new dialog();
			}
}