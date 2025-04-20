/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.changevalues;
import java.util.Scanner;
/**
 *
 * @author primu
 */
public class Changevalues {
 // Variabili globali per i due numeri
    static int primoNumero, secondoNumero;

    // Funzione che scambia i valori tra le due variabili
    static void scambiaValori() {
        int temporaneo;
        temporaneo = primoNumero;
        primoNumero = secondoNumero;
        secondoNumero = temporaneo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Saluto personalizzato
        System.out.print("Ciao! Come ti chiami? ");
        String nome = input.nextLine();
        System.out.println("Benvenuto, " + nome + "!");

        // Chiediamo all'utente di inserire due numeri
        System.out.print("\nInserisci il primo numero: ");
        primoNumero = input.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        secondoNumero = input.nextInt();

        // Scambia i valori
        scambiaValori();

        // Mostra i risultati dopo lo scambio
        System.out.println("\nDopo lo scambio:");
        System.out.println("Il primo numero ora è: " + primoNumero);
        System.out.println("Il secondo numero ora è: " + secondoNumero);

        // Aggiungiamo la possibilità di ripetere l'operazione
        System.out.print("\nVuoi ripetere lo scambio con nuovi numeri? (si/no): ");
        String risposta = input.next();
        
        if (risposta.equalsIgnoreCase("si")) {
            main(args);  // Chiama ricorsivamente il main per ripetere l'operazione
        } else {
            System.out.println("Grazie per aver usato il programma, " + nome + "! Alla prossima!");
        }

        input.close();
    }
}