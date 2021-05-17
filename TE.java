/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text_editor;

/**
 *
 * @author Rajib
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Adjustable;
import java.awt.Color;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.undo.*;
import java.awt.Container;
import java.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class TE extends WindowAdapter implements ActionListener
{
	
		JFrame f;
		JMenuBar mb;
		JMenu fl, ed, frm, v, hl, fnt, clr;
		JMenuItem n, op, sv, svas, pr, ex, undo, redo, slct, slctl, ct, cp, pst,dlt, wrwr, st, br, vw, hlp,ab, srf, ssrf, crr, mspd, tclr,bclr;
		JPopupMenu popup;
		JToolBar tb1,tb2,tb3;
		JTextArea ta;
		JPanel p;
		JScrollBar sb1,sb2;
		String s,w;
	    JSlider slider;
		JLabel l1, l2;
		JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b26q,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37;

		
	    TE()
		{
			f=new JFrame();
			f.setLayout(new BorderLayout());
			l1=new JLabel();
			l1.setBounds(50,680,150,30);
			l2=new JLabel();
			l2.setBounds(210,680,150,30);
			b=new JButton("Update Counter");
			b.setFont(new Font("serif", Font.BOLD,18));
			b.setBackground(Color.LIGHT_GRAY);
			b.setForeground(Color.BLUE);
			b.setContentAreaFilled(true);
			//b.setOpaque(false);
			b.setBorderPainted(true);
			b.setBounds(380,680,200,30);
			b.repaint();
			b.addActionListener(this);
			p=new JPanel();
			slider=new JSlider(JSlider.HORIZONTAL, 0, 80, 18);
			slider.setMinorTickSpacing(2);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			ta=new JTextArea();
			ta.setLineWrap(true);
			ta.setWrapStyleWord(true);
			ta.setFont(new Font("Times New Roman",Font.BOLD,18));
			JScrollPane sp = new JScrollPane(ta);
			sb1=new JScrollBar();
			sb2=new JScrollBar();
			sb2.setOrientation(JScrollBar.HORIZONTAL);
			tb1=new JToolBar();
			tb2=new JToolBar(JToolBar.VERTICAL);
			tb3=new JToolBar();
			tb1.setRollover(true);
			tb2.setRollover(true);
			tb3.setRollover(true);
			JLabel tl = new JLabel();
			tl.setBounds(800,680,200,30);
			JLabel dl=new JLabel();
			dl.setBounds(800,680,200,30);
			String font[]={"Serif","SansSerif","Courier","MonoSpeed"};
			String size[]={"8","10","14","18","24","30","36","42","50","58","66","72","80"};
			JComboBox cb1=new JComboBox(font);
			JComboBox cb2=new JComboBox(size);
			JButton b1 = new JButton(new ImageIcon("Create New.png"));
			b1.setContentAreaFilled(true);
			b1.setOpaque(false);
			b1.setBorderPainted(false);
			b1.setToolTipText("Create New Document");
			JButton b2 = new JButton(new ImageIcon("TXT.png"));
			b2.setContentAreaFilled(true);
			b2.setOpaque(false);
			b2.setBorderPainted(false);
			b2.setToolTipText("Open");
			JButton b3 = new JButton(new ImageIcon("Save.png"));
			b3.setContentAreaFilled(true);
			b3.setOpaque(false);
			b3.setBorderPainted(false);
			b3.setToolTipText("Save");
			JButton b4 = new JButton(new ImageIcon("Print.png"));
			b4.setContentAreaFilled(true);
			b4.setOpaque(false);
			b4.setBorderPainted(false);
			b4.setToolTipText("Print");
			JButton b5 = new JButton(new ImageIcon("Exit.png"));
			b5.setContentAreaFilled(true);
			b5.setOpaque(false);
			b5.setBorderPainted(false);
			b5.setToolTipText("Exit");
			JButton b6 = new JButton(new ImageIcon("Select All.png"));
			b6.setContentAreaFilled(true);
			b6.setOpaque(false);
			b6.setBorderPainted(false);
			b6.setToolTipText("Select All");
			JButton b7 = new JButton(new ImageIcon("Cut.png"));
			b7.setContentAreaFilled(true);
			b7.setOpaque(false);
			b7.setBorderPainted(false);
			b7.setToolTipText("Cut");
			JButton b8 = new JButton(new ImageIcon("Copy.png"));
			b8.setContentAreaFilled(true);
			b8.setOpaque(false);
			b8.setBorderPainted(false);
			b8.setToolTipText("Copy");
			JButton b9 = new JButton(new ImageIcon("Paste.png"));
			b9.setContentAreaFilled(true);
			b9.setOpaque(false);
			b9.setBorderPainted(false);
			b9.setToolTipText("Paste");
			JButton b10 = new JButton(new ImageIcon("Rename.png"));
			b10.setContentAreaFilled(true);
			b10.setOpaque(false);
			b10.setBorderPainted(false);
			b10.setToolTipText("Rename");
			JButton b11 = new JButton(new ImageIcon("Bold.jpg"));
			b11.setContentAreaFilled(true);
			b11.setOpaque(false);
			b11.setBorderPainted(false);
			b11.setToolTipText("Bold");
			JButton b12 = new JButton(new ImageIcon("italic.jpg"));
			b12.setContentAreaFilled(true);
			b12.setOpaque(false);
			b12.setBorderPainted(false);
			b12.setToolTipText("Italic");
			JButton b13 = new JButton(new ImageIcon("underline.jpg"));
			b13.setContentAreaFilled(true);
			b13.setOpaque(false);
			b13.setBorderPainted(false);
			b13.setToolTipText("Underline");
			JButton b14 = new JButton(new ImageIcon("Resized-6H43F.png"));
			b14.setContentAreaFilled(true);
			b14.setOpaque(false);
			b14.setBorderPainted(false);
			b14.setToolTipText("Background Colour");
			JButton b15 = new JButton(new ImageIcon("Text Color.png"));
			b15.setContentAreaFilled(true);
			b15.setOpaque(false);
			b15.setBorderPainted(false);
			b15.setToolTipText("Text Colour");
			JButton b16 = new JButton(new ImageIcon("Generic Text.png"));
			b16.setContentAreaFilled(true);
			b16.setOpaque(false);
			b16.setBorderPainted(false);
			b16.setToolTipText("Generic Text");
			JButton b17 = new JButton(new ImageIcon("Decrease Font.png"));
			b17.setContentAreaFilled(true);
			b17.setOpaque(false);
			b17.setBorderPainted(false);
			b17.setToolTipText("Decrease Font Size");
			JButton b18 = new JButton(new ImageIcon("Increase Font.png"));
			b18.setContentAreaFilled(true);
			b18.setOpaque(false);
			b18.setBorderPainted(false);
			b18.setToolTipText("Increase Font Size");
			JButton b19 = new JButton(new ImageIcon("Undo.png"));
			b19.setContentAreaFilled(true);
			b19.setOpaque(false);
			b19.setBorderPainted(false);
			b19.setToolTipText("Undo");
			JButton b20 = new JButton(new ImageIcon("Redo.png"));
			b20.setContentAreaFilled(true);
			b20.setOpaque(false);
			b20.setBorderPainted(false);
			b20.setToolTipText("Redo");
			JButton b21 = new JButton(new ImageIcon("Type.png"));
			b21.setContentAreaFilled(true);
			b21.setOpaque(false);
			b21.setBorderPainted(false);
			b21.setToolTipText("Type");
			JButton b22 = new JButton(new ImageIcon("Strikethrough.png"));
			b22.setContentAreaFilled(true);
			b22.setOpaque(false);
			b22.setBorderPainted(false);
			b22.setToolTipText("Strikethrough");
			JButton b23 = new JButton(new ImageIcon("Lowercase.png"));
			b23.setContentAreaFilled(true);
			b23.setOpaque(false);
			b23.setBorderPainted(false);
			b23.setToolTipText("Lowercase");
			JButton b24 = new JButton(new ImageIcon("Uppercase.png"));
			b24.setContentAreaFilled(true);
			b24.setOpaque(false);
			b24.setBorderPainted(false);
			b24.setToolTipText("Uppercase");
			JButton b25 = new JButton(new ImageIcon("Expand.png"));
			b25.setContentAreaFilled(true);
			b25.setOpaque(false);
			b25.setBorderPainted(false);
			b25.setToolTipText("Expand");
			JButton b26 = new JButton(new ImageIcon("Collapse.png"));
			b26.setContentAreaFilled(true);
			b26.setOpaque(false);
			b26.setBorderPainted(false);
			b26.setToolTipText("Collapse");
			JButton b26q = new JButton(new ImageIcon("Quit.png"));
			b26q.setContentAreaFilled(true);
			b26q.setOpaque(false);
			b26q.setBorderPainted(false);
			b26q.setToolTipText("Quit");
			JButton b27 = new JButton(new ImageIcon("Align Left.png"));
			b27.setContentAreaFilled(true);
			b27.setOpaque(false);
			b27.setBorderPainted(false);
			b27.setToolTipText("Align Left");
			JButton b28 = new JButton(new ImageIcon("Align Justify.png"));
			b28.setContentAreaFilled(true);
			b28.setOpaque(false);
			b28.setBorderPainted(false);
			b28.setToolTipText("Align Justify");
			JButton b29 = new JButton(new ImageIcon("Align Center.png"));
			b29.setContentAreaFilled(true);
			b29.setOpaque(false);
			b29.setBorderPainted(false);
			b29.setToolTipText("Align Center");
			JButton b30 = new JButton(new ImageIcon("Align Right.png"));
			b30.setContentAreaFilled(true);
			b30.setOpaque(false);
			b30.setBorderPainted(false);
			b30.setToolTipText("Align Right");
			JButton b31 = new JButton(new ImageIcon("Numbered List.png"));
			b31.setContentAreaFilled(true);
			b31.setOpaque(false);
			b31.setBorderPainted(false);
			b31.setToolTipText("Numbered List");
			JButton b32 = new JButton(new ImageIcon("Table.png"));
			b32.setContentAreaFilled(true);
			b32.setOpaque(false);
			b32.setBorderPainted(false);
			b32.setToolTipText("Table");
			JButton b33 = new JButton(new ImageIcon("Drag List Down.png"));
			b33.setContentAreaFilled(true);
			b33.setOpaque(false);
			b33.setBorderPainted(false);
			b33.setToolTipText("Drag List Down");
			JButton b34 = new JButton(new ImageIcon("Drag Reorder.png"));
			b34.setContentAreaFilled(true);
			b34.setOpaque(false);
			b34.setBorderPainted(false);
			b34.setToolTipText("Drag Reorder");
			JButton b35 = new JButton(new ImageIcon("Drag List Up.png"));
			b35.setContentAreaFilled(true);
			b35.setOpaque(false);
			b35.setBorderPainted(false);
			b35.setToolTipText("Drag List Up");
			JButton b36 = new JButton(new ImageIcon("Indent.png"));
			b36.setContentAreaFilled(true);
			b36.setOpaque(false);
			b36.setBorderPainted(false);
			b36.setToolTipText("Indent");
			JButton b37 = new JButton(new ImageIcon("Outdent.png"));
			b37.setContentAreaFilled(true);
			b37.setOpaque(false);
			b37.setBorderPainted(false);
			b37.setToolTipText("Outdent");

			b1.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b1)
									new TE();
							}});
			b2.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b2)
								{
								JFileChooser openFile = new JFileChooser();
								openFile.showOpenDialog(null);
								}
							}});
			b3.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b3)
								{
								JFileChooser saveFile = new JFileChooser();
								saveFile.setDialogTitle("Specify a file to Save");
								saveFile.setSelectedFile(new File("File_to_save.txt"));
								saveFile.showSaveDialog(null);
								}
							}});
			b4.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b4)
								JOptionPane.showMessageDialog(f,"No Printing Device is Connected !!","Print",JOptionPane.PLAIN_MESSAGE);
							}});
			b5.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b5)
								{
									int a=JOptionPane.showConfirmDialog(f,"Do you want to Save your changes?","Text Editor",JOptionPane.INFORMATION_MESSAGE);
			     if(a==JOptionPane.YES_OPTION)
					 {  
				      JFileChooser saveFile = new JFileChooser();
                      saveFile.showSaveDialog(f);
				     }
				 else if(a==JOptionPane.NO_OPTION)
				{
					new afterlogin();
			    }}
							}});
			b6.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b6)
								{
								ta.selectAll();
								}
							}});
			b7.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b7)
									new TE();
							}});
			b8.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b8)
									new TE();
							}});
			b9.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b9)
									new TE();
							}});
			b10.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b10)
									new TE();
							}});
			b11.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b11)
									new TE();
							}});
			b12.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b12)
									new TE();
							}});
			b13.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b13)
									new TE();
							}});
			b14.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b14)
								{
								Color c=JColorChooser.showDialog(ta,"Select a Colour",Color.WHITE);
								ta.setBackground(c);
								}
							}});
			b15.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b15)
								{
								Color c=JColorChooser.showDialog(ta,"Select a Colour",Color.BLACK);
								ta.setForeground(c);
								}
							}});
			b16.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b16)
									new TE();
							}});
			b17.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b17)
									new TE();
							}});
			b18.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b18)
									new TE();
							}});
			b19.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b19)
									new TE();
							}});
			b20.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b20)
									new TE();
							}});
			b21.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b21)
									new TE();
							}});
			b22.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b22)
									new TE();
							}});
			b23.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b23)
									new TE();
							}});
			b24.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b24)
									new TE();
							}});
			b25.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b25)
									new TE();
							}});
			b26.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b26)
									new TE();
							}});
			b26q.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b26q)
									new TE();
							}});
			b27.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b27)
									new TE();
							}});
			b28.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b28)
									new TE();
							}});
			b29.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b29)
									new TE();
							}});
			b30.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b30)
									new TE();
							}});
			b31.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b31)
									new TE();
							}});
			b32.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b32)
									new TE();
							}});
			b33.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b33)
									new TE();
							}});
			b34.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b34)
									new TE();
							}});
			b35.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b35)
									new TE();
							}});
			b36.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b36)
									new TE();
							}});
			b37.addMouseListener(new MouseAdapter(){ 
							public void mouseClicked(MouseEvent m){
								if(m.getSource()==b37)
									new TE();
							}});
			sb1.addAdjustmentListener(new AdjustmentListener()
				{
				public void adjustmentValueChanged(AdjustmentEvent e)
					{
					//System.out.println("JScrollBar 1's current value = " + sb1.getValue());
					}});

			sb1.addAdjustmentListener(new AdjustmentListener()
				{
				public void adjustmentValueChanged(AdjustmentEvent e)
					{
					//System.out.println("JScrollBar 2's current value = " + sb2.getValue());
					}});

			slider.addChangeListener(new ChangeListener()
				{
				public void stateChanged(ChangeEvent e)
					{
					ta.setFont(new Font("Times New Roman",Font.BOLD,slider.getValue()));
					}});


					

			n=new JMenuItem("New");
			op=new JMenuItem("Open");
			sv=new JMenuItem("Save"); 
			svas=new JMenuItem("Save as...");
			pr=new JMenuItem("Print");
			ex=new JMenuItem("Exit");
			n.setMnemonic(KeyEvent.VK_N);
			op.setMnemonic(KeyEvent.VK_O);
			sv.setMnemonic(KeyEvent.VK_S);
			svas.setMnemonic(KeyEvent.VK_S);
			pr.setMnemonic(KeyEvent.VK_P);
			ex.setMnemonic(KeyEvent.VK_X);
			n.addActionListener(this);
			op.addActionListener(this);
			sv.addActionListener(this);
			svas.addActionListener(this); 
			pr.addActionListener(this);
			ex.addActionListener(this);
			undo=new JMenuItem("Undo");
			redo=new JMenuItem("Redo");
			slct=new JMenuItem("Select");
			slctl=new JMenuItem("Select All");
			ct=new JMenuItem("Cut");
			cp=new JMenuItem("Copy");
			pst=new JMenuItem("Paste");
			dlt=new JMenuItem("Delete");
			undo.setMnemonic(KeyEvent.VK_U);
			redo.setMnemonic(KeyEvent.VK_R);
			slctl.setMnemonic(KeyEvent.VK_S);
			slct.setMnemonic(KeyEvent.VK_S);
			ct.setMnemonic(KeyEvent.VK_T);
			cp.setMnemonic(KeyEvent.VK_C);
			pst.setMnemonic(KeyEvent.VK_P);
			dlt.setMnemonic(KeyEvent.VK_D);
			undo.addActionListener(this);
			redo.addActionListener(this);
			slctl.addActionListener(this);
			slct.addActionListener(this);
			ct.addActionListener(this);
			cp.addActionListener(this);
			pst.addActionListener(this);
			dlt.addActionListener(this);
			wrwr=new JMenuItem("Word Wrap");
			wrwr.setMnemonic(KeyEvent.VK_W);
			wrwr.addActionListener(this);
			vw=new JMenuItem("View");
			hlp=new JMenuItem("Help");
			ab=new JMenuItem("About");
			vw.setMnemonic(KeyEvent.VK_V);
			hlp.setMnemonic(KeyEvent.VK_H);
			ab.setMnemonic(KeyEvent.VK_A);
			vw.addActionListener(this);
			hlp.addActionListener(this);
			ab.addActionListener(this);

			srf=new JMenuItem("Serif");
			ssrf=new JMenuItem("SansSerif");
			crr=new JMenuItem("Courier");
			mspd=new JMenuItem("MonoSpeed");
			srf.setMnemonic(KeyEvent.VK_S);
			ssrf.setMnemonic(KeyEvent.VK_F);
			crr.setMnemonic(KeyEvent.VK_U);
			mspd.setMnemonic(KeyEvent.VK_M);
			srf.addActionListener(this);
			ssrf.addActionListener(this);
			crr.addActionListener(this);
			mspd.addActionListener(this);

			tclr=new JMenuItem("Text Colour");
			bclr=new JMenuItem("Background Colour");
			tclr.addActionListener(this);
			bclr.addActionListener(this);
		
			mb=new JMenuBar();
			fl=new JMenu("File");
			ed=new JMenu("Edit");
			frm=new JMenu("Format");
			fnt=new JMenu("Font");
			clr=new JMenu("Colour");
			hl=new JMenu("Help");
            
			fl.setMnemonic(KeyEvent.VK_F);
			ed.setMnemonic(KeyEvent.VK_E);
			frm.setMnemonic(KeyEvent.VK_F);
			fnt.setMnemonic(KeyEvent.VK_F);
			clr.setMnemonic(KeyEvent.VK_C);
			hl.setMnemonic(KeyEvent.VK_H);

			f.setIconImage(new ImageIcon("te1.ico").getImage());

			fnt.add(srf);fnt.addSeparator();fnt.add(ssrf);fnt.addSeparator();fnt.add(crr);fnt.addSeparator();fnt.add(mspd);
			clr.add(tclr);clr.addSeparator();clr.add(bclr);

			fl.add(n);fl.addSeparator();fl.add(op);fl.addSeparator();fl.add(sv);fl.addSeparator();fl.add(svas);fl.addSeparator();fl.add(pr);fl.addSeparator();fl.add(ex);
			ed.add(undo);ed.addSeparator();ed.add(redo);ed.addSeparator();ed.add(slct);ed.addSeparator();ed.add(slctl);ed.addSeparator();ed.add(ct);ed.addSeparator();ed.add(cp);ed.addSeparator();ed.add(pst);ed.addSeparator();ed.add(dlt);
			frm.add(wrwr);
			hl.add(vw);hl.addSeparator();hl.add(hlp);hl.addSeparator();hl.add(ab);
			mb.add(fl);mb.add(ed);mb.add(frm);mb.add(fnt);mb.add(clr);mb.add(hl);
		
			tb1.add(b1);tb1.add(b2);tb1.add(b3);tb1.add(b4);tb1.add(b5);tb1.addSeparator();tb1.addSeparator();tb1.add(b6);tb1.add(b7);tb1.add(b8);tb1.add(b9);tb1.add(b10);tb1.addSeparator();tb1.addSeparator();tb1.add(b11);tb1.add(b12);tb1.add(b13);tb1.addSeparator();tb1.addSeparator();tb1.add(b14);tb1.add(b15);tb1.addSeparator();tb1.addSeparator();tb1.add(cb1);tb1.addSeparator();tb1.add(cb2);tb1.addSeparator();tb1.addSeparator();tb1.add(b16);tb1.add(b17);tb1.add(b18);tb1.addSeparator();tb1.add(b19);tb1.add(b20);tb1.addSeparator();tb1.add(b21);tb1.add(b22);tb1.add(b23);tb1.add(b24);tb1.addSeparator();tb1.add(b25);tb1.add(b26);tb1.add(b26q);tb1.addSeparator();

			tb2.add(b27);tb2.add(b28);tb2.add(b29);tb2.add(b30);tb2.addSeparator();tb2.add(b31);tb2.add(b32);tb2.add(b33);tb2.add(b34);tb2.add(b35);tb2.add(b36);tb2.add(b37);
			p.setBounds(1142,670,200,45);
			p.add(slider);
			sb1.setBounds(1341,40,25,630);
			sb2.setBounds(44,645,1298,25);
			f.add(ta, BorderLayout.CENTER);
			f.add(sb1);
			f.add(sb2);
			f.add(l1);
			f.add(l2);
			f.add(b);
			f.add(p);

			f.add(tl);
			f.add(dl);
			ta.setBounds(45,40,1296,605);
			sp.setPreferredSize(new Dimension(986,670));
			f.add(sp);

			tb1.setFloatable(false);
			tb2.setFloatable(false);
			f.add(mb);
			f.add(tb1);
			f.add(tb2);
			f.getContentPane().add(tb1, BorderLayout.NORTH);
			f.getContentPane().add(tb2, BorderLayout.WEST);
			f.setJMenuBar(mb);
			f.setTitle("Untitled-Text Editor");
			f.setExtendedState(JFrame.MAXIMIZED_BOTH);
			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		    f.addWindowListener(this);
			f.pack();
			
			f.setVisible(true);

		final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
        ActionListener timerListener = new ActionListener()
			{

			public void actionPerformed(ActionEvent e)
            {
                Date date = new Date();
                String time = timeFormat.format(date);
				
                tl.setText(time);
				tl.setFont(new Font("serif", Font.BOLD,20));
				//dl.setText(date);
            }
        };
        Timer timer = new Timer(10, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
}
		public void windowClosing(WindowEvent e) 
			{  
                 int a=JOptionPane.showConfirmDialog(f,"Do you want to Save your changes?","Text Editor",JOptionPane.INFORMATION_MESSAGE);
			     if(a==JOptionPane.YES_OPTION)
					 {  
				      JFileChooser saveFile = new JFileChooser();
					  saveFile.setSelectedFile(new File("File_to_save.txt"));
                      saveFile.showSaveDialog(null);
				     }
				 else if(a==JOptionPane.NO_OPTION)
				{
					new afterlogin();
				}
		   }

		public void actionPerformed(ActionEvent e) 
		{
			s=ta.getText();
			if(e.getSource()==ct)
			{
				s=ta.getText();
				ta.setText("");
			}

			if(e.getSource()==b)
			{
			String w[]=s.split("\\s");
			l1.setText("No of Words: "+w.length);
			l2.setText("No of Characters: "+s.length());
			}
		     if(e.getSource()==op)
				{
				JFileChooser openFile = new JFileChooser();
				openFile.showOpenDialog(null);
				}
			if(e.getSource()==sv)
				{
				JFileChooser saveFile = new JFileChooser();
				saveFile.setDialogTitle("Specify a file to Save");
				saveFile.setSelectedFile(new File("File_to_save.txt"));
				saveFile.showSaveDialog(null);
				}
			if(e.getSource()==svas)
				{
				 JFileChooser saveFile = new JFileChooser();
				 saveFile.setDialogTitle("Specify a file to Save");
				 saveFile.setSelectedFile(new File("File_to_save.txt"));
                 saveFile.showSaveDialog(null);
				}    
			 if(e.getSource()==pst)
			   {
			    ta.setText(s);
			   }    
			 if(e.getSource()==ex)
			   {
				int a=JOptionPane.showConfirmDialog(f,"Do you want to Save your changes?","Text Editor",JOptionPane.INFORMATION_MESSAGE);
			     if(a==JOptionPane.YES_OPTION)
					 {  
				      JFileChooser saveFile = new JFileChooser();
                      saveFile.showSaveDialog(f);
				     }
				 else if(a==JOptionPane.NO_OPTION)
				{
					new afterlogin();
			    }
			   }
			
			 if(e.getSource()==n)
			  {
			   new TE();
			  }
			  
			  if(e.getSource()== undo){}

			  if(e.getSource()==slct)
			  {
			    ta.selectAll();
			  }
			  
			  if(e.getSource()==redo){}
			  
			  if(e.getSource()==wrwr)
				  {
				   ta.setLineWrap(true);
				   ta.setWrapStyleWord(true);
				  }

			  if(e.getSource()==v)
			  {
			  
			  }
			  
			  if(e.getSource()==dlt)
			  {
			    ta.setText("");
			  }
			  
			  if(e.getSource()==bclr)
			  {  
              Color c=JColorChooser.showDialog(ta,"Select a Colour",Color.WHITE);
              ta.setBackground(c);
			  }
			  
			  if(e.getSource()==tclr)
			  {  
              Color c=JColorChooser.showDialog(ta,"Select a Colour",Color.BLACK);
              ta.setForeground(c);
			  }

			  if(e.getSource()==slctl)
			  {
			  ta.selectAll();
			  }
			  
			   if(e.getSource()==pr)
			  {
			  JOptionPane.showMessageDialog(f,"No Printing Device is Connected !!","Print",JOptionPane.PLAIN_MESSAGE);
			  }

			  if(e.getSource()==srf)
			  {
			  Font font = new Font("Serif", Font.BOLD,18);
			  ta.setFont(font);
			  }

			  if(e.getSource()==ssrf)
			  {
			  Font font = new Font("SansSerif", Font.BOLD, 20);
			  ta.setFont(font);
			  }

			  if(e.getSource()==crr)
			  {
			    Font font = new Font("Courier", Font.BOLD,18);
				ta.setFont(font);
			  }

			  if(e.getSource()==mspd)
			  {
			  Font font = new Font("MonoSpeed", Font.BOLD,18);
			  ta.setFont(font);
			  }
}


public static void main(String args[])
    {
    new TE();
	}}
