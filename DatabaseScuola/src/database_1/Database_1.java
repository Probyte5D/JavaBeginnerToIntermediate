/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author primu
 */
public class Database_1 {

    
    public static void main(String[] args) {
     
        String url = "jdbc:mysql://localhost/scuola?useTimezone=true&serverTimezone=UTC";
        String userid = "root";
        String pass = "admin";
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        String nome = "PIPPI";
        int vot = 18;
        
        // Modifica: inserimento nella tabella STUDENTI
        String INSERT = "INSERT INTO STUDENTI (Nome, voto) VALUES('" + nome + "', '" + vot + "')";
        
        // Modifica: seleziona dalla tabella STUDENTI con voto specifico
        String SELECT = "SELECT * from STUDENTI WHERE voto = " + vot;
        
        try {
            System.out.println("Connessione in corso.....");
            con = DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");
            stmt = con.createStatement();
            
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESSIONE DATABASE");
            e.printStackTrace(); // Aggiungi questo per avere più dettagli sull'errore
        }
        
        try {
            // Esegui l'inserimento
            stmt.execute(INSERT);
            
            // Esegui la query SELECT
            rs = stmt.executeQuery(SELECT);
            
            while (rs.next()) {
                // Modifica: Stampa i risultati dalla tabella STUDENTI
                System.out.println("Nome: " + rs.getString("Nome") + ", Voto: " + rs.getString("voto"));
                System.out.println("--------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("** Errore SQL \n" + e);
            e.printStackTrace(); // Aggiungi questo per avere più dettagli sull'errore SQL
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace(); // Gestisci eventuali errori durante la chiusura delle risorse
            }
        }
    }  
}