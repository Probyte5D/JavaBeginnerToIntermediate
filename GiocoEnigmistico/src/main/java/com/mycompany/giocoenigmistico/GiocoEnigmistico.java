/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.giocoenigmistico;
import java.util.Scanner;
/**
 *
 * @author primu
 */
public class GiocoEnigmistico {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Enigmistica enigmistica = new Enigmistica();
        int punteggio = 0;
        
        System.out.println("Benvenuto nel gioco Enigmistico!");
        
        // Inizia il gioco
        while (true) {
            System.out.println("\nScegli un'opzione:");
            System.out.println("1. Indovina se una parola è palindroma");
            System.out.println("2. Trova l'anagramma di una parola");
            System.out.println("3. Crea una parola palindroma");
            System.out.println("4. Esci");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Per consumare la newline dopo l'input numerico
            
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci una parola per verificare se è palindroma: ");
                    String parola1 = scanner.nextLine();
                    enigmistica.setParola(parola1);
                    if (enigmistica.isPalindroma()) {
                        System.out.println("La parola è palindroma!");
                        punteggio++;
                    } else {
                        System.out.println("La parola NON è palindroma.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Inserisci una parola per trovarne un anagramma: ");
                    String parola2 = scanner.nextLine();
                    enigmistica.setParola(parola2);
                    String anagramma = enigmistica.anagramma();
                    System.out.println("Un anagramma della parola è: " + anagramma);
                    punteggio++;
                    break;
                
                case 3:
                    System.out.print("Inserisci una parola per creare un palindromo: ");
                    String parola3 = scanner.nextLine();
                    enigmistica.setParola(parola3);
                    String palindromo = enigmistica.parolaPalindroma();
                    System.out.println("Una parola palindroma che puoi creare è: " + palindromo);
                    punteggio++;
                    break;
                
                case 4:
                    System.out.println("Hai deciso di uscire dal gioco.");
                    System.out.println("Punteggio finale: " + punteggio);
                    scanner.close();
                    return; // Esce dal programma
                
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
    }
}

