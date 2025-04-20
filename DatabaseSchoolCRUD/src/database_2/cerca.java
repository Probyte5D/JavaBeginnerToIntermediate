/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import static database_2.Database_2.*;
/**
 *
 * @author primu
 */
public class cerca  {
    String SELECT;
    Scanner in = new Scanner (System.in);
       
    public void CERCA1(){
        String NAME;
        System.out.println("INSERISCI IL NOME DA CERCARE :");
        NAME = in.nextLine();
        
        try {
            System.out.println("Connessione in corso.....");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");      
            stat = con.createStatement();
            SELECT = "SELECT * FROM students WHERE name='" + NAME + "'";       // Modifica del nome della tabella e del campo
            System.out.println("--------------------------------------");
            
            try {                    
                ris = stat.executeQuery(SELECT); 
                if (ris.next() == false){
                    System.out.println("IL NOME NON ESISTE");
                } else {
                    do {
                        System.out.println("NOME = " + ris.getString("name"));  // Modifica del nome del campo
                        System.out.println("--------------------------------------");
                    } while (ris.next());
                }
            } catch (Exception e) {
                System.out.println("** Errore SQL \n" + e);
            }  

        } catch (Exception e) {
            System.out.println("** ERRORE CONNESSIONE DATABASE");
        }
    }
    
    public void CERCA2(){
        int GRADE;
        System.out.println("INSERISCI IL VOTO DA CERCARE :");
        GRADE = in.nextInt();
        
        try {
            System.out.println("Connessione in corso.....");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");      
            stat = con.createStatement();
                                   
            SELECT = "SELECT * FROM students WHERE grade='" + GRADE + "'";  // Modifica del nome della tabella e del campo
            System.out.println("--------------------------------------");

            try {
                ris = stat.executeQuery(SELECT); 
                if (ris.next() == false){
                    System.out.println("IL VOTO NON ESISTE");
                } else {
                    do { 
                        System.out.println("VOTO = " + ris.getString("grade"));  // Modifica del nome del campo
                        System.out.println("--------------------------------------");            
                    } while (ris.next());         
                }                      
            } catch (Exception e) {
                System.out.println("** Errore SQL \n" + e);  
            }  
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESSIONE DATABASE");
        }         
    }  
}