/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progettodateanni;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class ProgettodateANNI {

 public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        String data1, data2;

        System.out.print("Inserisci la data di inizio  (GG/MM/AAAA):");
        data1 = in.nextLine();
       
        // Estrazione dei giorni, mesi e anni dalla data di inizio
        String giorno1 = data1.substring(0, 2); 
        String mese1 = data1.substring(3, 5); 
        String anno1 = data1.substring(6, 10);  
        int giornoUno = Integer.parseInt(giorno1);
        int meseUno = Integer.parseInt(mese1);
        int annoUno = Integer.parseInt(anno1);

        System.out.print("Inserisci la data di fine  (GG/MM/AAAA):");
        data2 = in.nextLine();
       
        // Estrazione dei giorni, mesi e anni dalla data di fine
        String giorno2 = data2.substring(0, 2); 
        String mese2 = data2.substring(3, 5); 
        String anno2 = data2.substring(6, 10);  
        int giornoDue = Integer.parseInt(giorno2);
        int meseDue = Integer.parseInt(mese2);
        int annoDue = Integer.parseInt(anno2);
        
        // Verifica validità delle date
        if (meseUno < 1 || meseUno > 12 || giornoUno < 1 || giornoUno > procedura_mese(meseUno, annoUno, annoDue)) {
            System.out.println("DATA INSERITA NON VALIDA ");
            return;
        }

        if (meseDue < 1 || meseDue > 12 || giornoDue < 1 || giornoDue > procedura_mese(meseDue, annoUno, annoDue)) {
            System.out.println("DATA INSERITA NON VALIDA");
            return;
        }

        // Calcolo della somma dei giorni per il mese iniziale e totale
        int somma = procedura_mese(meseUno, annoUno, annoDue) - giornoUno;
        int GiorniMese = procedura_mese(meseUno, annoUno, annoDue); 
        int GiorniIntermedi = somma_Intermedia(meseUno, meseDue, annoUno, annoDue);
        int GiorniTot = somma_Totale(meseUno, meseDue, somma, giornoUno, giornoDue, GiorniIntermedi, annoUno, annoDue);
    
        // Verifica che la data finale sia successiva alla data di inizio
        if (annoDue < annoUno) {
            System.out.println("Inserisci due date consecutive!");
        } else {
            System.out.println("SOMMA TOTALE:" + GiorniTot);
        }

    }

    // PROCEDURA PER IL CALCOLO DEI GIORNI DEI MESI
    static int procedura_mese(int meseUno, int annoUno, int annoDue) {
        switch (meseUno) {
            case 4: case 6: case 9: case 11:
                return 30; // Mesi con 30 giorni
            case 2:
                // Verifica se l'anno è bisestile per il mese di febbraio
                if (annoUno % 4 == 0 && annoUno % 100 != 0 || annoUno % 400 == 0) {
                    if (annoDue % 4 == 0 && annoDue % 100 != 0 || annoDue % 400 == 0) 
                        return 29; // Anno bisestile, febbraio ha 29 giorni
                    else 
                        return 28; // Non bisestile, febbraio ha 28 giorni
                }
                else {
                    return 28; // Non bisestile, febbraio ha 28 giorni
                }
            default:
                return 31; // Mesi con 31 giorni
        }
    }

    // Funzione per il calcolo con il for della somma intermedia dell'anno uguale
    static int somma_Intermedia(int meseUno, int meseDue, int annoUno, int annoDue) {
        int i = 0, j = 0, sommaIntermedia = 0;

        if (annoUno == annoDue) { // Mesi nello stesso anno
            if (meseDue > meseUno)
                for (i = meseUno + 1; i < meseDue; i++) {
                    sommaIntermedia = sommaIntermedia + procedura_mese(i, meseUno, annoUno);               
                }
        } else { // Se i due anni sono diversi

            // Mesi rimanenti nel primo anno
            for (i = meseUno + 1; i <= 12; i++) {
                sommaIntermedia = sommaIntermedia + procedura_mese(i, meseUno, annoUno);  
            }

            // Mesi interi negli anni di mezzo
            for (j = annoUno + 1; j < annoDue; j++)
                for (i = 1; i <= 12; i++) {
                    sommaIntermedia = sommaIntermedia + procedura_mese(i, annoUno, j);  
                }

            // Mesi rimanenti dalla fine del primo anno al mese finale
            for (i = 1; i < meseDue; i++) {
                sommaIntermedia = sommaIntermedia + procedura_mese(i, annoUno, annoDue);
            }
        }

        return sommaIntermedia;
    }

    // Funzione per calcolare il totale dei giorni
    static int somma_Totale(int meseUno, int meseDue, int somma, int giornoUno, int giornoDue, int GiorniIntermedi,
                 int annoUno, int annoDue) {
        int sommaTotale = 0;

        // Caso in cui le date siano nello stesso mese e anno
        if (meseUno == meseDue && annoUno == annoDue) {
            sommaTotale = giornoDue - giornoUno;
        } else {
            sommaTotale = somma + giornoDue + GiorniIntermedi;
        }
        return sommaTotale;
    }
}