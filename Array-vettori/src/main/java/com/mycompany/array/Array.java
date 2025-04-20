/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author primu
 */
/**
 * Un semplice esempio di utilizzo di array in Java.
 * Popola un array con multipli di 3 e li stampa a video.
 */
public class Array {

    public static void main(String[] args) {
        System.out.println("Esempio di array in Java:");

        int[] vet = new int[5]; // dichiaro e inizializzo l'array

        // Riempimento dell'array con multipli di 3
        System.out.println("\nPopolo l'array con multipli di 3:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i * 3;
            System.out.println("vet[" + i + "] = " + vet[i]);
        }

        // Stampa dei valori contenuti nell'array
        System.out.println("\nStampo i valori dell'array:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Elemento " + i + ": " + vet[i]);
        }
    }
}
