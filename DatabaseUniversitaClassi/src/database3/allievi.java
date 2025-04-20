/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import static database3.Database3.*;
/**
 *
 * @author primu
 */
public class allievi {
    
   
    public void menuAllievi(){
    DATIALLIEVI dat = new DATIALLIEVI();
     try {
            System.out.println("Connessione in corso.....");
            con=DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");               
            stat = con.createStatement();
             System.out.println("--------------------------------------");
              }catch (Exception e) {
            System.out.println("** ERRORE CONNESIONE DATABASE");
        }
     int n;
        Scanner in = new Scanner(System.in);
        do{
            //leggi leg = new leggi();
            //stampa sta = new stampa();
            //cerca cer=new cerca();

            System.out.println("* * * * MENU DI SELEZIONE ALLIEVI * * * *");
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
                dat.LEGGIALLIEVI();      
                break;
                case 2: System.out.println("(2) Hai scelto STAMPARE:");
                dat.STAMPAALLIEVI();
                break;
                case 3: System.out.println("(3) Hai scelto CERCARE ");
                 System.out.println("(1) cerca per nome");
                    System.out.println("(2) cerca per Corso");
                        System.out.println("(3) cerca per nome con i relativi esami");
                    int scelta= in.nextInt();
                    if(scelta==1){
                        dat.CERCAALLIEVI1();}
                    else if (scelta==2){
                        dat.CERCAALLIEVI2();}
                    else if (scelta==3){
                        dat.CERCAALLIEVI3();}                   
                    else{ 
                        System.out.println("SCELTA NON VALIDA PER CERCA");}
                break;
                case 4: System.out.println("4. HAI SCELTO ESCI:");
                System.out.println("SEI USCITO DAL MENU");
                break;
            }
        } while(n != 4);    
    }
    
}
