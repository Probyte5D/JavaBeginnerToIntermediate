/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.costru;

/**
 *
 * @author primu
 */
public class COSTRU {

    public static void main(String[] args) {
  System.out.println("=== AVVIO PROGRAMMA ===");

        COSTR co = new COSTR();     // crea oggetto COSTR
        co.pippo();                 // chiama pippo SOLO da co

        System.out.println();

        eredita ere = new eredita(); // crea oggetto eredita (costruttore ereditato)
        ere.pluto();                 // chiama metodo della sottoclasse
        ere.pippo();
    }
}