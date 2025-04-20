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
public class esami {
    
    static  String url = "jdbc:mysql://localhost/universita?useTimezone=true&serverTimezone=UTC";
    static  String userid = "root";
    static  String pass = "admin";
     
    static  Connection con= null;
    static  Statement stat =null;
    static  ResultSet ris=null; 
    
    
    public void menuEsami(){
    DATIESAMI DAT = new DATIESAMI();
    int n;
        Scanner in = new Scanner(System.in);
        do{
            //leggi leg = new leggi();
            //stampa sta = new stampa();
            //cerca cer=new cerca();

            System.out.println("* * * * MENU DI SELEZIONE ESAMI * * * *");
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
                DAT.LEGGIESAMI();       
                break;
                case 2: System.out.println("(2) Hai scelto STAMPARE:");
                DAT.STAMPAESAMI();
                break;
                case 3: System.out.println("(3) Hai scelto CERCARE ");
                 System.out.println("(1) cerca per voto");
                   // System.out.println("(2) cerca per Corso");
                        System.out.println("(2) cerca per materia con i relativi dati allievo");
                    int scelta= in.nextInt();
                    if(scelta==1){
                          DAT.CERCAESAMI1();}
                    else if (scelta==2){
                        DAT.CERCAESAMI2();}
                    //else if (scelta==3){
                      //  DAT.CERCAESAMI3();}                   
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

