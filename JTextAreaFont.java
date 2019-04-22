import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class JTextAreaFont extends JFrame
{

JTextArea jt;
JScrollPane js;
JSlider jl;

 public JTextAreaFont()
 {

 setTitle("Increase JTextArea Font Size");
 setLayout(new GridLayout());
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setVisible(true);

 jt=new JTextArea();
 jt.setLineWrap(true);
 jt.setWrapStyleWord(true);
 jt.setFont(new Font("Times New Roman",Font.BOLD,20));
 js=new JScrollPane(jt);
 add(js);

 jl=new JSlider(1,200);
 jl.setValue(20);
 add(jl);

 jl.addChangeListener(new ChangeListener(){
       public void stateChanged(ChangeEvent ce)
       {
       jt.setFont(new Font("Times New Roman",Font.BOLD,jl.getValue()));
       }
 });

 setExtendedState(MAXIMIZED_BOTH);

 }

 public static void main(String args[])
 {
 new JTextAreaFont();
 }

}