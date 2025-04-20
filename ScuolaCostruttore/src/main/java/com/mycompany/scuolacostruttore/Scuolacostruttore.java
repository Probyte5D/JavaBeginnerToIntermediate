/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scuolacostruttore;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class Scuolacostruttore {

    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
            System.out.println("=== GESTIONE UNIVERSITÀ ===\n");
            
            // Test Professore
            System.out.println("Inserimento dati Professore:");
            System.out.println("---------------------------");
            profess prof = new profess("mario", "rossi", "ita", 10); //una istanza per chiamre classe Proff
           // prof.leggiProfessore();// se voglio leggere i parametri professore tramite scan
           // non inserisco i parametri nell istanza new
            
            System.out.println("\nDati del Professore inserito:");
            System.out.println("---------------------------");
            prof.stampaprofessore();
            
          
        
        
    }
}
