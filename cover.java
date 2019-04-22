import javax.swing.*;    
import java.awt.event.*;    
import java.awt.*;
import java.lang.*;

public class cover extends JFrame
{	
	ImageIcon image = new ImageIcon("editor.jpg");
	JLabel imageLabel = new JLabel(image);
	JProgressBar bar1;
	//JLabel l;
	int i=0,x=0;
	
	public cover()
		{
		setLayout(null);
		bar1=new JProgressBar(0,500);	
		bar1.setStringPainted(true);
		bar1.setBounds(0,321,450,15);
		imageLabel.setBounds(0,0,450,337);
		add(imageLabel);
		add(bar1);
		setSize(450,337);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setIconImage(new ImageIcon("Text-Edit-icon.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
public void pbar()
	{
	while(i<=500)
		{
	bar1.setValue(i);
	i=i+10;
	
	try{Thread.sleep(150);
	}
	catch(Exception e){}
	}
}
public static void main(String[] args)
	{
	cover p=new cover();
	p.setVisible(true);
	p.pbar();
	new login();
	p.setVisible(false);
}
}