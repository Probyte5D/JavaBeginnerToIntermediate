/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scuolacostruttore;

import java.util.Scanner;

/**
 *
 * @author primu
 */
public class profess extends persona {
    Scanner in = new Scanner(System.in);
     String materiaInsegnata;
    int anniAnzianita;
     
    // Costruttore
    public profess(String nome, String cognome, String materiaInsegnata, int anniAnzianita) {
     //qua passo i parametri sia della persona che della sottoclasse 
    super(nome, cognome); // devo richiamare pero il super cosi i due parametri li percepice da li
        this.materiaInsegnata = materiaInsegnata;
        this.anniAnzianita = anniAnzianita;
    }
    
    // Metodo per leggere i dati del professore
    public void leggiProfessore() {
        leggipersona();  //Prima legge nome e matricola uso il metodo leggiPersona() per leggere i dati specifici del professore
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci materia insegnata: ");
        this.materiaInsegnata = scanner.nextLine();
        System.out.print("Inserisci anni di anzianità: ");
        this.anniAnzianita = scanner.nextInt();
    }
    
    // Metodo per stampare i dati del professore
    public void stampaprofessore() {
        stampapersona();  
        System.out.println("Materia insegnata: " + this.materiaInsegnata);
        System.out.println("Anni di anzianità: " + this.anniAnzianita);
    }
    
    
}
