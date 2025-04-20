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
public class stampa {
   String SELECT;
   
   public void STAMPA() {
        try {   
            System.out.println("Connessione in corso.....");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");      
            stat = con.createStatement();
            SELECT = "SELECT * from students";  // Modifica tabella a "students"
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESSIONE DATABASE");
        }
        
        System.out.println("--------------------------------------");
        
        try {
            // stat.execute(INSERT); //   stmt.execute(CANC);
            ris = stat.executeQuery(SELECT); 
            while (ris.next()) {
                System.out.println("Nome = " +  ris.getString("name"));  // Modifica campo "nome" a "name"
                System.out.println("Voto = " + ris.getString("grade"));  // Modifica campo "voto" a "grade"
                System.out.println("--------------------------------------");
            } 
        } catch (Exception e) {
            System.out.println("** Errore SQL \n" + e);  
        }         
    }
}