/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.costruttoredemo;

/**
 *
 * @author primu
 */
public class Studente extends Persona  {
    
     public String scuola;

    // Costruttore
    public Studente() {
        super(); // chiama il costruttore di Persona
        this.scuola = "Liceo Scientifico";
        System.out.println("Costruttore Studente eseguito");
    }

    public void info() {
        System.out.println("Frequento: " + scuola);
    }
}


