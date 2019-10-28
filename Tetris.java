

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

package tetris;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Tetris extends Applet {

   
    public void paint (Graphics g){
        
        //declaration frame background 
         int rval,gval,bval;
       
       for (int j = 30; j<(size().height-25);j+=10)
       for (int i = 5; i<(size().width-25);i+=10){
           
             rval = (int)Math.floor(Math.random()*256);
           gval = (int)Math.floor(Math.random()*256);
           bval = (int)Math.floor(Math.random()*256);
           
           g.setColor(new Color(rval,gval,bval));
           g.fillRect(i,j,25,25);
          
           g.drawRect(i-1,i-j,25,25);
       }
        
      
        
        //kerangka luar
        g.setColor(Color.white);
        g.fillRoundRect(500, 120, 350, 500,20,20);
        
        //frame dalam
        g.setColor(Color.black);
        g.fill3DRect(520, 150, 310, 300,true);
        
        //ruang button
        g.setColor(Color.yellow);
        g.fillRoundRect(530, 470, 110, 120,20,20);
        
        //button kiri
        g.setColor(Color.black);
        g.fillOval(541, 530, 30, 30);
        
        //btn atas
        g.setColor(Color.black);
        g.fillOval(573, 490, 30, 30);
        
        //btn kanan
        g.setColor(Color.black);
        g.fillOval(600, 530, 30, 30);
        
        
        
        //buttonn start
          //ruang button
        g.setColor(Color.yellow);
        g.fill3DRect(720, 488, 110, 120,true);
        
        //btn atas
        g.setColor(Color.black);
        g.fill3DRect(763, 494, 30, 30,true);
        
         //btn kanan
        g.setColor(Color.black);
        g.fill3DRect(730, 530, 30, 30,true);
        
         //btn kiri
        g.setColor(Color.black);
        g.fill3DRect(793, 530, 30, 30,true);
        
          //btn bawah
        g.setColor(Color.black);
        g.fill3DRect(762, 558, 30, 30,true);
        
        //frame game 
        g.setColor(Color.yellow);
        g.drawRect(550, 200, 90, 90);
        g.drawRect(550, 200, 70, 70);
        
        
          g.setColor(Color.yellow);
          g.drawRect(700, 200, 90, 90);
          g.drawRect(700, 200, 70, 70);
        
        //mouth
        g.setColor(Color.yellow);
        g.drawArc(500, 340, 280, 280, 50, 50);
        
        //retina 1
        g.setColor(Color.white);
        g.fill3DRect(590, 240, 30, 30,true);
        
        //retina 2
        g.setColor(Color.white);
        g.fill3DRect(740, 240, 30, 30,true);
    
    }    
    
}
