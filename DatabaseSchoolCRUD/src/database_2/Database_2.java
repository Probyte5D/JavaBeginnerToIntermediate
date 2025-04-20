/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author primu
 */
public class Database_2 {

    static  String url = "jdbc:mysql://localhost/school?useTimezone=true&serverTimezone=UTC";
    static  String userid = "root";
    static  String pass = "admin";
     
    static  Connection con= null;
    static  Statement stat =null;
    static  ResultSet ris=null; 
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        do{
            leggi leg = new leggi();
            stampa sta = new stampa();
            cerca cer=new cerca();

            System.out.println("* * * * MENU DI SELEZIONE * * * *");
            System.out.println(
    "        (1) INSERISCI DATI \n" +
    "        (2) STAMPA DATI\n" +
    "        (3) CERCA DATI\n" +
    "        (4) ESCI\n"                          
            );   
        System.out.println("Seleziona un'opzione da 1 a 4 : ");
        n = in.nextInt();
       
            if (n<1|| n>4) {
                System.out.println("SCELTA NON VALIDA! RIPROVA!");   
            }

            switch (n) {
                case 1: System.out.println("(1) Hai scelto INSERIRE:");
                leg.LEGGI();                
                break;
                case 2: System.out.println("(2) Hai scelto STAMPARE:");
                sta.STAMPA();
                break;
                case 3: System.out.println("(3) Hai scelto CERCARE ");
                    System.out.println("Scegli il tipo di ricerca :");
                    System.out.println("(1) cerca per nome");
                    System.out.println("(2) cerca per voto");
                    int scelta= in.nextInt();
                    if(scelta==1){
                        cer.CERCA1();}
                    else if (scelta==2){
                        cer.CERCA2();}
                    else{ 
                        System.out.println("SCELTA NON VALIDA PER CERCA");}
                break;
                case 4: System.out.println("4. HAI SCELTO:");
                System.out.println("SEI USCITO DAL MENU");
                break;
            }
        } while(n != 4);    
    }
}
       
      
        
      



