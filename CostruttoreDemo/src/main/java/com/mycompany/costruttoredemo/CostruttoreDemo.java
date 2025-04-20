/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.costruttoredemo;

/**
 *
 * @author primu
 */
public class CostruttoreDemo {

    public static void main(String[] args) {
        System.out.println("=== ESEMPIO COSTRUTTORI ===");

        Persona persona = new Persona();
        persona.saluta();

        System.out.println();

        Studente studente = new Studente();
        studente.saluta();  // metodo ereditato
        studente.info();    // metodo proprio
    
    }
}
