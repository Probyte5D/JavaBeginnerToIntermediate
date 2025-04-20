/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giocoenigmistico;
import java.util.Random;
/**
 *
 * @author primu
 */
public class Enigmistica {
      // CAMPI
    private String parola;
    
    // COSTRUTTORI
    public Enigmistica(){
        parola = "";
    }

    public Enigmistica(String str){
        parola = str.trim();
    }
 
    // METODI
    public void setParola(String s){
        parola = s;
    }

    public String getParola(){
        return parola;
    }

    // Verifica se una parola è palindroma
    public boolean isPalindroma(){
        int i;
        int lunghezza = parola.length();

        for (i = 0; i < lunghezza / 2; i++)
            if (parola.charAt(i) != parola.charAt(lunghezza - i - 1))
                return false;
        return true;
    }

    // Restituisce un anagramma della parola
    public String anagramma(){
        String anag = "";              
        String str = parola;           
        Random rnd = new Random();     
        int indice = str.length() - 1; 
        int r;

        while (str.length() > 1) {
            r = rnd.nextInt(indice + 1);   
            anag = anag + str.charAt(r); 

            if (r == 0)
                str = str.substring(1, indice + 1); 
            else if (r == indice)
                str = str.substring(0, indice);  
            else
                str = str.substring(0, r) + str.substring(r + 1, indice + 1);
            indice--;
        }
        return anag + str;
    }
    
    // Metodo per restituire una parola che può essere un palindromo
    public String parolaPalindroma() {
        StringBuilder sb = new StringBuilder(parola);
        sb.reverse();
        return parola + sb.toString();
    }
}