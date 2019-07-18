package pack2;

import pack1.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XO implements ActionListener
{
   JFrame frame=new JFrame("TIC-TAC-TOE Choice Window");
	  
   JButton b1=new JButton("Single Player(Undefeat-able)");
   JButton b2=new JButton("Double Player(VS. Friend)");
   JButton b3=new JButton("TIC-TAC-TOE");
   JButton b4=new JButton("Single Player(MiniMax algorithm)");
   
   public XO()
   {
      frame.setSize(400,400);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      b1.setBackground(Color.black);
      b2.setBackground(Color.black);
      b3.setBackground(Color.black);
      b4.setBackground(Color.black);
      b1.setForeground(Color.red);
      b2.setForeground(Color.red);
      b3.setForeground(Color.yellow);
      b4.setForeground(Color.red);
      
      b3.setPreferredSize(new Dimension(400,80));
      b1.setPreferredSize(new Dimension(300,50));
      b2.setPreferredSize(new Dimension(300,50));
      b4.setPreferredSize(new Dimension(300,50));
      
      frame.add(b3);
      frame.add(b1);
      frame.add(b2);
      frame.add(b4);
      
      frame.setVisible(true);
      
      frame.setLayout(new GridLayout(4,1));
      
      b3.addActionListener(this);
      b1.addActionListener(this);
	   b2.addActionListener(this);
      b4.addActionListener(this);
   }
   public void actionPerformed(ActionEvent a)
   {
      if(a.getSource()==b1)
	   {
         frame.dispose();
	      new mytictactoe2();
	   }
	   else if(a.getSource()==b2)
	   {
         frame.dispose();
	      new MyTicTacToe();
	   }
      else if(a.getSource()==b3)
      {
         frame.dispose();
	      new XO();
      }
      else if(a.getSource()==b4)
      {
         frame.dispose();
         new mytictactoe3();
      }
   }
   public static void main(String args[])
   {
      new XO();
   }   
}