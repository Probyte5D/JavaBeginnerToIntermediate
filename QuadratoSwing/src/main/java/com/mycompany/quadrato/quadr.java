/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quadrato;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author primu
 */
public class quadr extends JFrame implements ActionListener{
    
    JLabel l1;JTextField t1;JButton b1;JLabel ris;
    
    public void qua (){
    JFrame f =new JFrame("GESTIONE QUADRATO");
    f.setBounds(400, 200, 600, 500);
    Container c = f.getContentPane();
    c.setLayout(new GridLayout(2, 1));
    
    JPanel p1=new JPanel();
    p1.setBackground(Color.orange);
    c.add(p1);
    JPanel p2=new JPanel();
    p2.setBackground(Color.green);
    c.add(p2);
        
    l1 = new JLabel("INSERIRE IL LATO");
    p1.add(l1);
    p1.setLayout(new FlowLayout(FlowLayout.LEFT));
    
    t1 = new JTextField(7);
    p1.add(t1);
    
    b1 = new JButton("CALCOLA AREA");
    p2.add(b1);
    b1.addActionListener(this);
    
    ris = new JLabel("______0");
    ris.setOpaque(true);
    p2.add(ris);
   
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
              
         if(e.getSource()==b1)
         {
         int lato= Integer.parseInt(t1.getText());
         int area=lato*lato;
         ris.setText(Integer.toString(area));       
         }
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
