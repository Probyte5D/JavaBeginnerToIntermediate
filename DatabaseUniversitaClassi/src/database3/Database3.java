/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author primu
 */
public class Database3 {
    
    //public static void connessione()
    static  String url = "jdbc:mysql://localhost/universita?useTimezone=true&serverTimezone=UTC";
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
        
         try {
            // connn al database 
            System.out.println("Connessione in corso...");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");
        
        
        do{
            allievi all = new allievi();
            esami esa = new esami();
            //leggi leg = new leggi();//stampa sta = new stampa();//cerca cer=new cerca();

            System.out.println("* * * * MENU DI SELEZIONE * * * *");
            System.out.println(
    "        (1) GESTIONE ALLIEVI \n" +
    "        (2) GESTIONE ESAMI\n" +
    "        (3) ESCI\n"                          
            );   
            
        System.out.println("Seleziona un'opzione da 1 a 3 : ");
        n = in.nextInt();
       
            if (n<1|| n>3) {
                System.out.println("SCELTA NON VALIDA! RIPROVA!");   
            }

            switch (n) {
                case 1: System.out.println("(1) Hai scelto ALLIEVI:");
                //leg.LEGGI();    
                all.menuAllievi();
                break;
                case 2: System.out.println("(2) Hai scelto ESAMI:");
                esa.menuEsami();
                break;               
                case 3: System.out.println("(3) HAI SCELTO: esci");
                System.out.println("SEI USCITO DAL MENU");
                break;
            }
        } while(n != 3);    
         } catch (Exception e) {
                System.out.println("Errore durante la chiusura della connessione");
            }
    }
}
       
   