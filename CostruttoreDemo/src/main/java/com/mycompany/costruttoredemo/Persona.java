/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.costruttoredemo;

/**
 *
 * @author primu
 */
public class Persona {
      public String nome;
    public int eta;

    // Costruttore
    public Persona() {
        this.nome = "Mario";
        this.eta = 30;
        System.out.println("Costruttore Persona eseguito");
    }

    public void saluta() {
        System.out.println("Ciao! Sono " + nome + " e ho " + eta + " anni.");
    }
}
