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
public class leggi {
   String INSERT;
    Scanner in = new Scanner (System.in);
    
    public void LEGGI(){
        String name; 
        int grade;
    
        try {
            System.out.println("Connessione in corso.....");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");               
            stat = con.createStatement();
            System.out.println("--------------------------------------");
            do {
                System.out.println("INSERISCI IL NOME:");
                name = in.nextLine();
                System.out.println("Nome inserito: " + name);
                
                System.out.println("INSERISCI IL VOTO (0 per uscire):");
                grade = in.nextInt();
                System.out.println("voto inserito: " + grade);

                if (grade > 0) {
                    INSERT = "INSERT INTO students (name, grade) VALUES('" + name + "','" + grade + "')";  // Modifica tabella e campi
                    stat.execute(INSERT);
                }
            } while (grade > 0);
        
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESSIONE DATABASE");
        }
    }       
}