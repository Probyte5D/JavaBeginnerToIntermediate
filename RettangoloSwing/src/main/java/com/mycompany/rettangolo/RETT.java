/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rettangolo;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author primu
 */
public class RETT extends JFrame implements ActionListener{
    
    JLabel l1;JTextField t1;JLabel l2;JTextField t2; JButton b1; JButton b2; JLabel ris; JLabel ris2;
    int altezza;
    int base;
    int area;
    int perimetro;
    
    public void rettangolo (){
        
    JFrame f =new JFrame("GESTIONE RETTANGOLO");
    f.setBounds(400, 200, 600, 500);
    Container c = f.getContentPane();
    c.setLayout(new GridLayout(4, 1));
    
    JPanel p1=new JPanel();
    p1.setBackground(Color.orange);
    c.add(p1);
    JPanel p2=new JPanel();
    p2.setBackground(Color.green);
    c.add(p2);
    JPanel p3=new JPanel();
    p3.setBackground(Color.CYAN);
    c.add(p3);
    JPanel p4=new JPanel();
    p4.setBackground(Color.YELLOW);
    c.add(p4);
    
    l1 = new JLabel("INSERIRE LA BASE");
    p1.add(l1);
    p1.setLayout(new FlowLayout(FlowLayout.LEFT));
    t1 = new JTextField(7);
    p1.add(t1);
    
    l2 = new JLabel("INSERIRE L'ALTEZZA");
    p2.add(l2);
    p2.setLayout(new FlowLayout(FlowLayout.LEFT));
    t2 = new JTextField(7);
    p2.add(t2);
    
    b1 = new JButton("CALCOLA AREA");
    p3.add(b1);
    b1.addActionListener(this);
    
    ris = new JLabel("______0");
    ris.setOpaque(true);
    p3.add(ris);
    
    b2 = new JButton("CALCOLA PERIMETRO");
    p4.add(b2);
    b2.addActionListener(this);
    
    ris2 = new JLabel("______0");
    ris2.setOpaque(true);
    p4.add(ris2);
   
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource()==b1){
     
            altezza= Integer.parseInt(t2.getText());
            base= Integer.parseInt(t1.getText());
            area=base*altezza;
            ris.setText(Integer.toString(area));
       
        }
     
        else if (e.getSource()==b2){
     
            perimetro= (base+altezza)*2;
            ris2.setText(Integer.toString(perimetro));
        }  
    
           
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
}
