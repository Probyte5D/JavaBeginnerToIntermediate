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
public class persona {
   
     Scanner in = new Scanner(System.in);
    
    //attributi privati della classe persona
    public String nome;
    public String cognome;
    //creo un metodo costruttore che prende il nome della classe ci passo i parametri e con this li setto come attributi
    public persona(String nome, String cognome){ // se qua passo i parametri poi devo chiamare il super e passare
    this.nome= nome; // oltre ai parametri questi anche i parametri di professore materia ecc  di la
    this.cognome=cognome;
    
    }
    
    public void leggipersona(){
        
        System.out.println("Inserisci un nome");
        this.nome=in.nextLine();
        System.out.println("Inserisci un cognome");
         this.cognome=in.nextLine();
    
    }
    
    
    public void stampapersona(){
        System.out.println("nome"+ this.nome);   
        System.out.println("cognome" + this.cognome);
    }
    
}
