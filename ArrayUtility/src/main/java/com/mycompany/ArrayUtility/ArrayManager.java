/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package com.mycompany.ArrayUtility;
import java.util.Scanner;

/**
 *
 * @author primu
 */
public class ArrayManager {  
   private Scanner in = new Scanner(System.in); 
    private int[] vet = new int[10];

    public void leggi() {
        System.out.println("Inserisci 10 numeri interi:");
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vet[i] = in.nextInt();
        }
    }

    public void stampa() {
        System.out.println("\nValori contenuti nell'array:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("vet[" + i + "] = " + vet[i]);
        }
    }

    public void cerca() {
        System.out.print("\nInserisci un numero da cercare: ");
        int num = in.nextInt();
        boolean trovato = false;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                System.out.println("Numero trovato alla posizione: " + i);
                trovato = true;
            }
        }

        if (!trovato) {
            System.out.println("Numero non presente nel vettore.");
        }
    }
}
