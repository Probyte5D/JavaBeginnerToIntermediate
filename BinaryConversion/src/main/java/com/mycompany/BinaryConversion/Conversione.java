/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.BinaryConversion;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class Conversione {

    public static void main(String[] args) {
 
        int num;
        // Richiesta del numero all'utente
        try (Scanner in = new Scanner(System.in)) {
            // Richiesta del numero all'utente
            System.out.println("INSERISCI UN NUMERO DECIMALE");
            num = in.nextInt();
            // Array per memorizzare i resti (massimo 100 per sicurezza)
            int vettore[] = new int[100];
            // Conversione del numero in binario usando il ciclo for
            for (int i = 0; num > 0; i++) {
                vettore[i] = num % 2;  // Salvo il resto nel vettore
                num = num / 2;         // Divido il numero per 2
            }   // Stampa del risultato in ordine corretto (inverso rispetto all'ordine in cui sono stati inseriti)
            System.out.print("Il numero in binario è: ");
            for (int j = 99; j >= 0; j--) {
                if (vettore[j] != 0) {  // Stampa solo i valori diversi da zero
                    System.out.print(vettore[j]); // Stampo il vettore dal fondo verso l'inizio
                }
            }
        }
    }
}