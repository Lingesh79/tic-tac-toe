package pack1;

import pack2.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyTicTacToe implements ActionListener 
{
	   JFrame frame=new JFrame("TIC-TAC-TOE");
	   
	   JButton b1=new JButton("");
	   JButton b2=new JButton("");
	   JButton b3=new JButton("");
	   JButton b4=new JButton("");
	   JButton b5=new JButton("");
	   JButton b6=new JButton("");
	   JButton b7=new JButton("");
	   JButton b8=new JButton("");
	   JButton b9=new JButton("");
	   
	   String letter="";
	   int count=0;
	   boolean win=false;
	   
	   public MyTicTacToe()
	   {
	      frame.setSize(400,400);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
         b1.setBackground(Color.black);
         b2.setBackground(Color.black);
         b3.setBackground(Color.black);
         b4.setBackground(Color.black);
         b5.setBackground(Color.black);
         b6.setBackground(Color.black);
         b7.setBackground(Color.black);
         b8.setBackground(Color.black);
         b9.setBackground(Color.black);
         
         b1.setFont(new Font("Arial",Font.PLAIN,40));
         b2.setFont(new Font("Arial",Font.PLAIN,40));
         b3.setFont(new Font("Arial",Font.PLAIN,40));
         b4.setFont(new Font("Arial",Font.PLAIN,40));
         b5.setFont(new Font("Arial",Font.PLAIN,40));
         b6.setFont(new Font("Arial",Font.PLAIN,40));
         b7.setFont(new Font("Arial",Font.PLAIN,40));
         b8.setFont(new Font("Arial",Font.PLAIN,40));
         b9.setFont(new Font("Arial",Font.PLAIN,40));
	   
	      frame.add(b1);
	      frame.add(b2);
	      frame.add(b3);
	      frame.add(b4);
	      frame.add(b5);
	      frame.add(b6);
	      frame.add(b7);
	      frame.add(b8);
	      frame.add(b9);
         
         frame.setVisible(true);
         
         frame.setLayout(new GridLayout(3,3));
	   
	      b1.addActionListener(this);
	      b2.addActionListener(this);
	      b3.addActionListener(this);
	      b4.addActionListener(this);
	      b5.addActionListener(this);
	      b6.addActionListener(this);
	      b7.addActionListener(this);
	      b8.addActionListener(this);
	      b9.addActionListener(this);
	   }
	   
	   public void actionPerformed(ActionEvent a)
	   {
	      count=count+1;
	      if(count==1 || count==3 || count==5 || count==7 || count==9)
	      {
	          letter="X";
	      }
	      else if(count==2 ||count==4 ||count==6 ||count==8) 
	      {
	          letter="O";
	      }
	      if(a.getSource()==b1)
	      {
	          b1.setText(letter);
	          b1.setEnabled(false);
	      }
	      else if(a.getSource()==b2)
	      {
	          b2.setText(letter);
	          b2.setEnabled(false);
	      }
	      else if(a.getSource()==b3)
	      {
	          b3.setText(letter);
	          b3.setEnabled(false);
	      }
	      else if(a.getSource()==b4)
	      {
	          b4.setText(letter);
	          b4.setEnabled(false);
	      }
	      else if(a.getSource()==b5)
	      {
	          b5.setText(letter);
	          b5.setEnabled(false);
	      }
	      else if(a.getSource()==b6)
	      {
	          b6.setText(letter);
	          b6.setEnabled(false);
	      }
	      else if(a.getSource()==b7)
	      {
	          b7.setText(letter);
	          b7.setEnabled(false);
	      }
	      else if(a.getSource()==b8)
	      {
	          b8.setText(letter);
	          b8.setEnabled(false);
	      }
	      else if(a.getSource()==b9)
	      {
	          b9.setText(letter);
	          b9.setEnabled(false);
	      }
	      
	      if(b1.getText()==b2.getText() && b2.getText()==b3.getText() && b1.getText()!="")
	      {
	         b1.setBackground(Color.green);
            b2.setBackground(Color.green);
            b3.setBackground(Color.green);
            win=true;
	      }
	      else if(b4.getText()==b5.getText() && b5.getText()==b6.getText() && b4.getText()!="")
	      {
	         b4.setBackground(Color.green);
            b5.setBackground(Color.green);
            b6.setBackground(Color.green);
            win=true;
	      }
	      else if(b7.getText()==b8.getText() && b8.getText()==b9.getText() && b7.getText()!="")
	      {
	         b7.setBackground(Color.green);
            b8.setBackground(Color.green);
            b9.setBackground(Color.green);
            win=true;
	      }
	      
	      else if(b1.getText()==b4.getText() && b4.getText()==b7.getText() && b1.getText()!="")
	      {
	         b1.setBackground(Color.green);
            b4.setBackground(Color.green);
            b7.setBackground(Color.green);
            win=true;
	      }
	      else if(b2.getText()==b5.getText() && b5.getText()==b8.getText() && b2.getText()!="")
	      {
	         b5.setBackground(Color.green);
            b2.setBackground(Color.green);
            b8.setBackground(Color.green);
            win=true;
	      }
	      else if(b3.getText()==b6.getText() && b6.getText()==b9.getText() && b3.getText()!="")
	      {
	         b6.setBackground(Color.green);
            b9.setBackground(Color.green);
            b3.setBackground(Color.green);
            win=true;
	      }
	      
	      else if(b1.getText()==b5.getText() && b5.getText()==b9.getText() && b1.getText()!="")
	      {
	         b1.setBackground(Color.green);
            b5.setBackground(Color.green);
            b9.setBackground(Color.green);
            win=true;
	      }
	      else if(b3.getText()==b5.getText() && b5.getText()==b7.getText() && b3.getText()!="")
	      {
	         b5.setBackground(Color.green);
            b7.setBackground(Color.green);
            b3.setBackground(Color.green);
            win=true;
	      }
	      
	      if(win==true)
	      {
	    	  JOptionPane.showMessageDialog(null,letter+" WINS!!!");
	    	  frame.dispose();
           new XO();
	      }
	      else if(count==9 && win==false)
	      {
	    	  JOptionPane.showMessageDialog(null,"TIE GAME!!!");
           frame.dispose();
	    	  new XO();
	      }
	   }
}