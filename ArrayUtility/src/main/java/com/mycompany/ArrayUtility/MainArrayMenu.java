/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ArrayUtility;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class MainArrayMenu {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayManager arrayManager = new ArrayManager();
        int scelta;

        do {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Inserisci valori nel vettore");
            System.out.println("2. Stampa valori del vettore");
            System.out.println("3. Cerca un numero nel vettore");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            while (!in.hasNextInt()) {
                System.out.print("Inserisci un numero valido: ");
                in.next(); // scarta input non valido
            }

            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    arrayManager.leggi();
                    break;
                case 2:
                    arrayManager.stampa();
                    break;
                case 3:
                    arrayManager.cerca();
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);
    }
}

