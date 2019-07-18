package pack1;

import pack2.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class mytictactoe3 implements ActionListener 
{
   JFrame frame=new JFrame("TIC-TAC-TOE");
   JButton b[][]=new JButton[3][3];
   String letter="";
   int count=0;   
   boolean win=false;
   boolean iscomp=false;
   String player="O";
   String comp="X";
   String none="";
   public mytictactoe3()
   {
      frame.setSize(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            b[i][j]=new JButton("");
            b[i][j].setBackground(Color.black);
            b[i][j].setFont(new Font("Arial",Font.PLAIN,40));
            frame.add(b[i][j]);
         }
      }
      frame.setVisible(true);
      frame.setLayout(new GridLayout(3,3));
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            b[i][j].addActionListener(this);
         }
      }
   }
   public void actionPerformed(ActionEvent a)
   {
      count=count+1;
      if(count==2 || count==4 || count==6 || count==8)
      {
         letter="O";
      }
      else if(count==1 ||count==3 ||count==5 ||count==7 || count==9) 
      {
         iscomp=true;
         letter="X";
      }
      if(letter=="O")
      {
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<3;j++)
            {
               if(a.getSource()==b[i][j])
               {
                  b[i][j].setText(letter);
                  b[i][j].setEnabled(false);  
               }
            }
         }
      }
      else if(letter=="X" && count==1)
      {
         Random rn=new Random();
         int pos1=rn.nextInt(3);
         int pos2=rn.nextInt(3);
         b[pos1][pos2].setText(letter);
         b[pos1][pos2].setEnabled(false);
      }
      else if(letter=="X")
      {
         xmove();
      }
      if(b[0][0].getText()==b[0][1].getText() && b[0][1].getText()==b[0][2].getText() && b[0][0].getText()!="")
      {
         b[0][0].setBackground(Color.green);
         b[0][1].setBackground(Color.green);
         b[0][2].setBackground(Color.green);
         win=true;
      }
      else if(b[1][0].getText()==b[1][1].getText() && b[1][1].getText()==b[1][2].getText() && b[1][0].getText()!="")
      {
         b[1][0].setBackground(Color.green);
         b[1][1].setBackground(Color.green);
         b[1][2].setBackground(Color.green);
         win=true;
      }
      else if(b[2][0].getText()==b[2][1].getText() && b[2][1].getText()==b[2][2].getText() && b[2][0].getText()!="")
      {
         b[2][0].setBackground(Color.green);
         b[2][1].setBackground(Color.green);
         b[2][2].setBackground(Color.green);
         win=true;
      }
       
      else if(b[0][0].getText()==b[1][0].getText() && b[1][0].getText()==b[2][0].getText() && b[0][0].getText()!="")
      {
         b[0][0].setBackground(Color.green);
         b[1][0].setBackground(Color.green);
         b[2][0].setBackground(Color.green);
         win=true;
      }
      else if(b[0][1].getText()==b[1][1].getText() && b[1][1].getText()==b[2][1].getText() && b[0][1].getText()!="")
      {
         b[0][1].setBackground(Color.green);
         b[1][1].setBackground(Color.green);
         b[2][1].setBackground(Color.green);
         win=true;
      }
      else if(b[0][2].getText()==b[1][2].getText() && b[1][2].getText()==b[2][2].getText() && b[0][2].getText()!="")
      {
         b[0][2].setBackground(Color.green);
         b[1][2].setBackground(Color.green);
         b[2][2].setBackground(Color.green);
         win=true;
      }
        
      else if(b[0][0].getText()==b[1][1].getText() && b[1][1].getText()==b[2][2].getText() && b[0][0].getText()!="")
      {
         b[0][0].setBackground(Color.green);
         b[1][1].setBackground(Color.green);
         b[2][2].setBackground(Color.green);
         win=true;
      }
      else if(b[0][2].getText()==b[1][1].getText() && b[1][1].getText()==b[2][0].getText() && b[0][2].getText()!="")
      {
         b[0][2].setBackground(Color.green);
         b[1][1].setBackground(Color.green);
         b[2][0].setBackground(Color.green);
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
   public void xmove()
   {
      int bestvalue=-1000;
      int bestmovei=-1;
      int bestmovej=-1;
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            if(b[i][j].getText()=="")
            {
               b[i][j].setText(comp);
               int movevalue=minimax(b,0,false);
               b[i][j].setText(none);
               if(movevalue > bestvalue)
               {
                  bestvalue=movevalue;
                  bestmovei=i;
                  bestmovej=j;
               }
            }
         }
      }
      b[bestmovei][bestmovej].setText(comp);
      b[bestmovei][bestmovej].setEnabled(false);
   }
   public int minimax(JButton[][] board,int depth,boolean iscomputer)
   {
      int value=eval(board);
      if(value==10)
      {
         return value;
      }
      if(movesleft(board)==false)
      {
         return 0;
      }
      if(iscomputer==true)
      {
         int best=-1000;
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<3;j++)
            {
               if(board[i][j].getText()=="")
               {
                  board[i][j].setText(comp);
                  best=maxi(best,minimax(board,depth+1,false));
                  board[i][j].setText(none);
               }
            }
         }
         return best-depth;
      }
      else
      {
         int best=1000;
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<3;j++)
            {
               if(board[i][j].getText()=="")
               {
                  board[i][j].setText(player);
                  best=mini(best,minimax(board,depth+1,true));
                  board[i][j].setText(none);
               }
            }
         }
         return best+depth;
      }
   }
   public int eval(JButton[][] game)
   {
      for(int i=0;i<3;i++)
      {
         if(game[i][0].getText()==game[i][1].getText() && game[i][1].getText()==game[i][2].getText())
         {
            if(game[i][0].getText()==comp)
            {
               return 10;
            }
            else if(game[i][0].getText()==player)
            {
               return -10;
            }
         } 
      }
      for(int i=0;i<3;i++)
      {
         if(game[0][i].getText()==game[1][i].getText() && game[1][i].getText()==game[2][i].getText())
         {
            if(game[0][i].getText()==comp)
            {
               return 10;
            }
            else if(game[0][i].getText()==player)
            {
               return -10;
            }
         } 
      }
      if(game[0][0].getText()==game[1][1].getText() && game[1][1].getText()==game[2][2].getText())
      {
         if(game[0][0].getText()==comp)
         {
            return 10;
         }
         else if(game[0][0].getText()==player)
         {
            return -10;
         }
      }
      if(game[0][2].getText()==game[1][1].getText() && game[1][1].getText()==game[2][0].getText())
      {
         if(game[0][2].getText()==comp)
         {
            return 10;
         }
         else if(game[0][2].getText()==player)
         {
            return -10;
         }
      }
      return 0;
   }
   public boolean movesleft(JButton[][] game)
   {
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
            if(game[i][j].getText()=="")
            {
               return true;
            }
         }
      }
      return false;
   }
   public int mini(int a,int b)
   {
      if(a>b)
      {
         return b;
      }
      else
      {
         return a;
      }
   }
   public int maxi(int a,int b)
   {
      if(a>b)
      {
         return a;
      }
      else
      {
         return b;
      }
   }
}