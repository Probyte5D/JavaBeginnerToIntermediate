/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangoliclassi;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class TRIANGOLICLASSI {

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in); 

        float base, lato2, lato3, altezza;
        boolean triangoloValido;

        AREAPERIMETRO calcoliTriangolo = new AREAPERIMETRO();

        do {
            // Input per i lati del triangolo
            System.out.println("Inserisci la base del triangolo:");
            base = in.nextFloat();

            System.out.println("Inserisci il lato 2 del triangolo:");
            lato2 = in.nextFloat();

            System.out.println("Inserisci il lato 3 del triangolo:");
            lato3 = in.nextFloat();

            // Verifica se il triangolo è valido
            triangoloValido = calcoliTriangolo.validita(base, lato2, lato3);
            
            if (triangoloValido) {
                System.out.println("Il triangolo è valido!");
            } else {
                System.out.println("Il triangolo non è valido! Riprova.");
            }

        } while (!triangoloValido); // Continua finché il triangolo non è valido

        // Input per l'altezza
        System.out.println("Inserisci l'altezza del triangolo:");
        altezza = in.nextFloat();

        // Calcola e mostra i risultati
        calcoliTriangolo.tipo(base, lato2, lato3);
        calcoliTriangolo.perimetro(base, lato2, lato3);
        calcoliTriangolo.area(base, altezza);

        // Chiude lo scanner
        in.close();
    }
}