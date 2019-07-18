package pack1;

import pack2.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mytictactoe2 implements ActionListener 
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
   int top=-1;
   int O[]=new int[4];
	   
	   public mytictactoe2()
	   {
	      frame.setSize(400,400);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
	      b1.setBackground(Color.BLACK);
	      b2.setBackground(Color.BLACK);
	      b3.setBackground(Color.BLACK);
	      b4.setBackground(Color.BLACK);
	      b5.setBackground(Color.BLACK);
	      b6.setBackground(Color.BLACK);
	      b7.setBackground(Color.BLACK);
	      b8.setBackground(Color.BLACK);
	      b9.setBackground(Color.BLACK);
         
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
         if(letter=="O")
         {
            if(a.getSource()==b1)
	         {
	            b1.setText(letter);
	            b1.setEnabled(false);
               top++;
               O[top]=1;
	         }
	         else if(a.getSource()==b2)
	         {
	             b2.setText(letter);
	             b2.setEnabled(false);
                top++;
                O[top]=2;
	         }
	         else if(a.getSource()==b3)
	         {
	             b3.setText(letter);
	             b3.setEnabled(false);
                top++;
                O[top]=3;
            }
	         else if(a.getSource()==b4)
	         {
	             b4.setText(letter);
	             b4.setEnabled(false);
                top++;
                O[top]=4;
            }
	         else if(a.getSource()==b5)
	         {
	             b5.setText(letter);
	             b5.setEnabled(false);
                top++;
                O[top]=5;
            }
	         else if(a.getSource()==b6)
	         {
	             b6.setText(letter);
	             b6.setEnabled(false);
                top++;
                O[top]=6;
            }
	         else if(a.getSource()==b7)
	         {
	             b7.setText(letter);
	             b7.setEnabled(false);
                top++;
                O[top]=7;
            }
	         else if(a.getSource()==b8)
	         {
	             b8.setText(letter);
	             b8.setEnabled(false);
                top++;
                O[top]=8;
	         }
         }
         else if(letter=="X")
         {
            xmove();
         }
      }
      public void xmove()
      {
         if(count==1)
         {
            b9.setText(letter);
            b9.setEnabled(false);
         }
         else if(O[0]==5)
         {
            if(count==3)
            {
               b1.setText(letter);
               b1.setEnabled(false);   
            }
            else if(count==5 && O[1]==7)
            {
               b3.setText(letter);
               b3.setEnabled(false);
               win=true;
               b3.setBackground(Color.green);
               b1.setBackground(Color.green);
               b2.setBackground(Color.green);
               b6.setBackground(Color.green);
               b9.setBackground(Color.green);   
            }
            else if(count==5 && O[1]==3)
            {
               b7.setText(letter);
               b7.setEnabled(false);
               win=true;
               b1.setBackground(Color.green);
               b4.setBackground(Color.green);
               b7.setBackground(Color.green);
               b8.setBackground(Color.green);
               b9.setBackground(Color.green);   
            }
            else if(count>=5)
            {
               if(b4.getText()==b5.getText() && b4.getText()=="O" && b6.getText()!="X")
               {
                  b6.setText(letter);
                  b6.setEnabled(false);   
               }
               else if(b5.getText()==b6.getText() && b6.getText()=="O" && b4.getText()!="X")
               {
                  b4.setText(letter);
                  b4.setEnabled(false);
               }
               else if(b5.getText()==b2.getText() && b2.getText()=="O" && b8.getText()!="X")
               {
                  b8.setText(letter);
                  b8.setEnabled(false);
               }
               else if(b5.getText()==b8.getText() && b8.getText()=="O" && b2.getText()!="X")
               {
                  b2.setText(letter);
                  b2.setEnabled(false);
               }
               else if(b5.getText()==b3.getText() && b3.getText()=="O" && b7.getText()!="X")
               {
                  b7.setText(letter);
                  b7.setEnabled(false);
               }
               else if(b5.getText()==b7.getText() && b7.getText()=="O" && b3.getText()!="X")
               {
                  b3.setText(letter);
                  b3.setEnabled(false);
               }
               if(b1.getText()==b2.getText() && b2.getText()==b3.getText() && b1.getText()!="")
	            {
	               b1.setBackground(Color.green);
                  b2.setBackground(Color.green);
                  b3.setBackground(Color.green);
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
               else if(b3.getText()==b6.getText() && b6.getText()==b9.getText() && b3.getText()!="")
	            {
	               b6.setBackground(Color.green);
                  b9.setBackground(Color.green);
                  b3.setBackground(Color.green);
                  win=true;
	            }
            }
         }
         else if(O[0]==1 ||O[0]==2 ||O[0]==3 |O[0]==6)
         {
            if(count==3)
            {
               b7.setText(letter);
               b7.setEnabled(false);
            }
            else if(count==5 && b8.getText()=="O" && O[0]==3 ||count==5 && b8.getText()=="O" && O[0]==2 ||count==5 && b8.getText()=="O" && O[0]==6)
            {
               b1.setText(letter);
               b1.setEnabled(false);
               win=true;
               b1.setBackground(Color.green);
               b5.setBackground(Color.green);
               b9.setBackground(Color.green);
               b4.setBackground(Color.green);
               b7.setBackground(Color.green);
            }
            else if(count==5 && b8.getText()=="O" && O[0]==1)
            {
               b3.setText(letter);
               b3.setEnabled(false);
               win=true;
               b3.setBackground(Color.green);
               b5.setBackground(Color.green);
               b7.setBackground(Color.green);
               b6.setBackground(Color.green);
               b9.setBackground(Color.green);
            }
            else if(count==5 && b8.getText()=="")
            {
               b8.setText(letter);
               b8.setEnabled(false);
               win=true;
               b7.setBackground(Color.green);
               b8.setBackground(Color.green);
               b9.setBackground(Color.green);
            }
         }  
         else if(O[0]==4 ||O[0]==7 || O[0]==8)
         {
            if(count==3)
            {
               b3.setText(letter);
               b3.setEnabled(false);
            }
            else if(count==5 && b6.getText()=="O")
            {
               b1.setText(letter);
               b1.setEnabled(false);
               win=true;
               b1.setBackground(Color.green);
               b5.setBackground(Color.green);
               b9.setBackground(Color.green);
               b2.setBackground(Color.green);
               b3.setBackground(Color.green);
            }
            else if(count==5 && b6.getText()=="")
            {
               b6.setText(letter);
               b6.setEnabled(false);
               win=true;
               b3.setBackground(Color.green);
               b6.setBackground(Color.green);
               b9.setBackground(Color.green);
            }
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