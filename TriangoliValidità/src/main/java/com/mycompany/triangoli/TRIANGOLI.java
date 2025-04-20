/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangoli;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class TRIANGOLI {


    public static void main(String[] args){
       
 
        // Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Variabili per i lati del triangolo
        int latoA, latoB, latoC;
        String tipoTriangolo = "";

        try {
            // Ciclo fino a che l'utente non inserisce un triangolo valido
            do {
                System.out.println("Inserisci i lati del triangolo (A, B, C):");
                latoA = scanner.nextInt();
                latoB = scanner.nextInt();
                latoC = scanner.nextInt();

                // Verifica se i lati formano un triangolo valido
                if (latoA + latoB > latoC && latoB + latoC > latoA && latoA + latoC > latoB) {
                    System.out.println("Questo triangolo è valido!");
                    break; // Esce dal ciclo quando il triangolo è valido
                } else {
                    System.out.println("Questo triangolo non è valido! Riprova.");
                }
            } while (true); // Ciclo continuo fino a triangolo valido

            // Determinazione del tipo di triangolo
            if (latoA == latoB && latoB == latoC) {
                tipoTriangolo = "Triangolo Equilatero";
            } else if (latoA != latoB && latoB != latoC && latoA != latoC) {
                tipoTriangolo = "Triangolo Scaleno";
            } else {
                tipoTriangolo = "Triangolo Isoscele";
            }

            // Stampa il tipo di triangolo
            System.out.println("Il tipo di triangolo è: " + tipoTriangolo);

        } catch (Exception e) {
            // Gestione degli errori in caso di input non valido
            System.out.println("Errore: input non valido. Riprova.");
        } finally {
            scanner.close(); // Chiude lo scanner per evitare memory leak
        }
    }
}