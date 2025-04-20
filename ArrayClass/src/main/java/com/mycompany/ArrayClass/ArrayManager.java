/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ArrayClass;

import java.util.Scanner;

/**
 *
 * @author primu
 */
/**
 * Classe che gestisce un array di interi.
 * Offre funzionalità per:
 * - Lettura (popolamento automatico)
 * - Stampa
 * - Ricerca di un valore con indicazione della posizione
 */
public class ArrayManager {  
      private int[] vet = new int[10];
    private Scanner in = new Scanner(System.in);

    public void leggi() {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i + 20;
        }
    }

    public void stampa() {
        System.out.println("\nValori contenuti nell'array:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet[" + i + "] = " + vet[i]);
        }
    }

    public void cerca() {
        System.out.print("\nInserisci il valore da cercare: ");
        int valore = in.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == valore) {
                System.out.println("Valore trovato alla posizione: " + i);
                return;
            }
        }
        System.out.println("Valore non presente nel vettore.");
    }
}