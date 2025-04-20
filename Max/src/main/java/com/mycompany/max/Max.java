/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.max;
import java.util.Scanner;
/**
 *
 * @author primu
 */
public class Max {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire i tre numeri
        System.out.print("Inserisci il 1° numero: ");
        int numero1 = in.nextInt();
        
        System.out.print("Inserisci il 2° numero: ");
        int numero2 = in.nextInt();
        
        System.out.print("Inserisci il 3° numero: ");
        int numero3 = in.nextInt();

        // Troviamo il numero massimo usando una funzione
        int maggiore = trovaMaggiore(numero1, numero2, numero3);
        
        // Mostriamo il risultato
        System.out.println("\nIl numero maggiore è: " + maggiore);
        
        in.close();
    }

    // Funzione che trova il maggiore tra tre numeri
    static int trovaMaggiore(int num1, int num2, int num3) {
        // Prima confrontiamo i primi due numeri
        int maggioreParziale = max(num1, num2);
        
        // Poi confrontiamo il risultato con il terzo numero
        return max(maggioreParziale, num3);
    }

    // Funzione che trova il maggiore tra due numeri
    static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}