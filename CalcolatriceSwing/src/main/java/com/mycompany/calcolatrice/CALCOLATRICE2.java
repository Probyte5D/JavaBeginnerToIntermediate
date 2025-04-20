/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcolatrice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;


/**
 *
 * @author primu
 */
public class CALCOLATRICE2 extends JFrame implements ActionListener{
    JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    JLabel ris;
    JButton uguale, somma, sottr, molt, div, canc;
    float op1 = 0, op2 = 0;
    int flag = 0; // flag per determinare l'operazione
    float ris2 = 0; // risultato
    boolean risultato = false;
    
    public CALCOLATRICE2(){
    // Font
        Font fo = new Font("CenturyGothic", Font.BOLD, 60);
        Font fo2 = new Font("CenturyGothic", Font.BOLD, 20);
        Font fo3 = new Font("CenturyGothic", Font.ITALIC, 60);
        Font foBottoni = new Font("Century Gothic", Font.BOLD, 30);

        // JFrame
        JFrame f = new JFrame("CALCOLATRICE");
        f.setBounds(450, 150, 550, 600);
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        JPanel sopra = new JPanel();
        sopra.setLayout(new GridLayout(4, 4));
        sopra.setBackground(Color.GRAY);

        JPanel sotto = new JPanel();
        sotto.setBackground(Color.DARK_GRAY);
        ris = new JLabel("0");
        ris.setForeground(Color.white);
        ris.setFont(fo3);
        sotto.add(ris);  
        c.add(sotto, BorderLayout.NORTH);
        c.add(sopra, BorderLayout.CENTER);

        // Bottoni numerici
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        num0 = new JButton("0");

        // Bottoni operazioni
        somma = new JButton("+");
        sottr = new JButton("-");
        molt = new JButton("*");
        div = new JButton("/");

        // Bottoni stampa e cancella
        uguale = new JButton("=");
        canc = new JButton("C");

        // Aggiungi tutti i bottoni al pannello sopra
        sopra.add(num1);
        sopra.add(num2);
        sopra.add(num3);
        sopra.add(somma);

        sopra.add(num4);
        sopra.add(num5);
        sopra.add(num6);
        sopra.add(sottr);

        sopra.add(num7);
        sopra.add(num8);
        sopra.add(num9);
        sopra.add(molt);

        sopra.add(canc);
        sopra.add(num0);
        sopra.add(uguale);
        sopra.add(div);

        // Ascoltatori per tutti i bottoni
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        somma.addActionListener(this);
        sottr.addActionListener(this);
        molt.addActionListener(this);
        div.addActionListener(this);
        uguale.addActionListener(this);
        canc.addActionListener(this);

        // Imposta il font per ogni bottone
        num1.setFont(foBottoni);
        sottr.setFont(foBottoni);
        num2.setFont(foBottoni);
        num3.setFont(foBottoni);
        num4.setFont(foBottoni);
        num5.setFont(foBottoni);
        num6.setFont(foBottoni);
        num7.setFont(foBottoni);
        num8.setFont(foBottoni);
        num9.setFont(foBottoni);
        num0.setFont(foBottoni);
        somma.setFont(foBottoni);
        molt.setFont(foBottoni);
        div.setFont(foBottoni);
        uguale.setFont(foBottoni);
        canc.setFont(foBottoni);

        // Numeri colorati bianco con testo nero
        num1.setBackground(Color.WHITE);
        num1.setForeground(Color.BLACK);
        num2.setBackground(Color.WHITE);
        num2.setForeground(Color.BLACK);
        num3.setBackground(Color.WHITE);
        num3.setForeground(Color.BLACK);
        num4.setBackground(Color.WHITE);
        num4.setForeground(Color.BLACK);
        num5.setBackground(Color.WHITE);
        num5.setForeground(Color.BLACK);
        num6.setForeground(Color.BLACK);
        num6.setBackground(Color.WHITE);
        num7.setForeground(Color.BLACK);
        num7.setBackground(Color.WHITE);
        num8.setBackground(Color.WHITE);
        num8.setForeground(Color.BLACK);
        num9.setBackground(Color.WHITE);
        num9.setForeground(Color.BLACK);
        num0.setBackground(Color.WHITE);
        num0.setForeground(Color.BLACK);

        somma.setBackground(Color.ORANGE);
        somma.setForeground(Color.BLACK);
        sottr.setBackground(Color.ORANGE);
        sottr.setForeground(Color.BLACK);
        molt.setBackground(Color.ORANGE);
        molt.setForeground(Color.BLACK);
        div.setBackground(Color.ORANGE);
        div.setForeground(Color.BLACK);

        uguale.setBackground(Color.LIGHT_GRAY);
        uguale.setForeground(Color.black);
        canc.setBackground(Color.RED);
        canc.setForeground(Color.WHITE);

        // Aggiungi bordi ai bottoni
        num1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        num0.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        somma.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        sottr.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        molt.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        div.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        uguale.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        canc.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        // Imposta la finestra visibile
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = ris.getText().replace(",", "."); 
        // Gestione dei tasti numerici
        if (e.getSource() == num1) {
            if (ris.getText().equals("0")) {
                ris.setText("1");
            } else {
                ris.setText(ris.getText() + "1");
            }
        }
        if (e.getSource() == num2) {
            if (ris.getText().equals("0")) {
                ris.setText("2");
            } else {
                ris.setText(ris.getText() + "2");
            }
        }
        if (e.getSource() == num3) {
            if (ris.getText().equals("0")) {
                ris.setText("3");
            } else {
                ris.setText(ris.getText() + "3");
            }
        }
        if (e.getSource() == num4) {
            if (ris.getText().equals("0")) {
                ris.setText("4");
            } else {
                ris.setText(ris.getText() + "4");
            }
        }
        if (e.getSource() == num5) {
            if (ris.getText().equals("0")) {
                ris.setText("5");
            } else {
                ris.setText(ris.getText() + "5");
            }
        }
        if (e.getSource() == num6) {
            if (ris.getText().equals("0")) {
                ris.setText("6");
            } else {
                ris.setText(ris.getText() + "6");
            }
        }
        if (e.getSource() == num7) {
            if (ris.getText().equals("0")) {
                ris.setText("7");
            } else {
                ris.setText(ris.getText() + "7");
            }
        }
        if (e.getSource() == num8) {
            if (ris.getText().equals("0")) {
                ris.setText("8");
            } else {
                ris.setText(ris.getText() + "8");
            }
        }
        if (e.getSource() == num9) {
            if (ris.getText().equals("0")) {
                ris.setText("9");
            } else {
                ris.setText(ris.getText() + "9");
            }
        }
        if (e.getSource() == num0) {
            if (ris.getText().equals("0")) {
                ris.setText("0");
            } else {
                ris.setText(ris.getText() + "0");
            }
        }

        // Gestione delle operazioni
        if (e.getSource() == somma || e.getSource() == sottr || e.getSource() == molt || e.getSource() == div) {
            // Se il display non è vuoto, salva l'operando precedente
            if (!ris.getText().equals("0") && !ris.getText().equals("")) {
                op1 = Float.parseFloat(inputText);
            }

            if (!ris.getText().equals("")) {
                ris.setText("");  
            }

            if (e.getSource() == somma) {
                flag = 1;
            } else if (e.getSource() == sottr) {
                flag = 2;
            } else if (e.getSource() == molt) {
                flag = 3;
            } else if (e.getSource() == div) {
                flag = 4;
            }
        }

        // Gestione del tasto "="
        if (e.getSource() == uguale) {
            op2 = Float.parseFloat(inputText);
            switch (flag) {
                case 1: // Somma
                    ris2 = op1 + op2;
                    break;
                case 2: // Sottrazione
                    ris2 = op1 - op2;
                    break;
                case 3: // Moltiplicazione
                    ris2 = op1 * op2;
                    break;
                case 4: // Divisione
                    if (op2 != 0) {
                        ris2 = op1 / op2;
                    } else {
                        ris.setText("Errore");
                        return;
                    }
                    break;
                default:
                    ris.setText("Errore");
                    return;
            }

            // Formattazione del risultato con 2 decimali
            String result = String.format("%.2f", ris2); // Formattiamo il numero con 2 decimali

            // Sostituiamo il punto con la virgola per visualizzare il risultato
            result = result.replace(".", ","); // La virgola è usata per il display

            ris.setText(result); // Imposta il risultato formattato

            op1 = ris2; // Impostazione dell'operando iniziale per il prossimo calcolo
            flag = 0; // Reset dell'operatore
        }

        // Gestione del tasto "C" (cancella)
        if (e.getSource() == canc) {
            ris.setText("0");
            op1 = 0;
            op2 = 0;
            flag = 0;
        }
    }

}