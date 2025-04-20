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
public class DATIALLIEVI {

    String INSERT;
    String SELECT;
    Scanner in = new Scanner (System.in);
    //static String nome1; static int voto1; 
    public void LEGGIALLIEVI(){
        String nome; 
        String corso;
    
        try {
            System.out.println("Connessione in corso.....");
            con=DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");               
            stat = con.createStatement();
             System.out.println("--------------------------------------");
            
                System.out.println("INSERIRE IL NOME:");
                nome= in.nextLine();
                System.out.println("Nome inserito : "+nome);
                
                System.out.println("INSERIRE IL CORSO :");
                corso= in.nextLine();
                System.out.println("Corso inserito : "+corso);
             
                INSERT ="INSERT INTO ALLIEVI (nome,Corso) VALUES('"+nome +"','"+corso+"')";
                stat.execute(INSERT);
            
        }catch (Exception e) {
            System.out.println("** ERRORE CONNESIONE DATABASE");
        }
    }
   
    public void STAMPAALLIEVI(){

        try {   
            System.out.println("Connessione in corso.....");
            con=DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");      
            stat = con.createStatement();
            SELECT = "SELECT * from allievi";
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESIONE DATABASE");
        }
                 System.out.println("--------------------------------------");
        try {
           // stat.execute(INSERT); //   stmt.execute(CANC);
            ris = stat.executeQuery(SELECT); 
            while (ris.next()) {
                System.out.println("NOME = " +  ris.getString("nome"));
                System.out.println("CORSO = " + ris.getString("corso"));
                System.out.println("--------------------------------------");
            } 
        } catch (Exception e) {
            System.out.println("** Errore  SQL \n"+ e);}         
    }
    
    
    public void CERCAALLIEVI1(){
            String NOME;
        System.out.println("INSERISCI IL NOME DA CERCARE :");
        //in.nextLine();
        NOME=in.nextLine();
        //leggi leg = new leggi();//LEGGI();
            try {
                System.out.println("Connessione in corso.....");
                con=DriverManager.getConnection(url, userid, pass);
                System.out.println("Registrazione effettuata correttamente");      
                stat = con.createStatement();
                SELECT = "SELECT * from allievi where nome='"+NOME+"'";       //campo +nome //System.out.println("nome  " +NOME);
              System.out.println("--------------------------------------");
            try {                    
                // stat.execute(INSERT); // stmt.execute(CANC);
                ris = stat.executeQuery(SELECT); 
                if (ris.next()==false){
                     System.out.println("IL NOME NON ESISTE");}
                else{
                    do{
                        System.out.println("NOME = " +  ris.getString("nome"));
                        System.out.println("CORSO = " +  ris.getString("Corso"));       
                        System.out.println("CODICE ALLIEVO = " +  ris.getString("ID_Allievo"));       
                        //System.out.println("NOME = " +  ris.getString("nome"));       
                        System.out.println("--------------------------------------");
                    }while (ris.next());
                }
            } catch (Exception e) {
                    System.out.println("** Errore  SQL \n"+ e);
            }  

            } catch (Exception e) {
                    System.out.println("** ERRORE CONNESIONE DATABASE");
            }
    }


public void CERCAALLIEVI2(){
        String CORSO;
        System.out.println("INSERISCI IL CORSO DA CERCARE :");
        CORSO= in.nextLine();
        
            try {
                System.out.println("Connessione in corso.....");
                con=DriverManager.getConnection(url, userid, pass);
                System.out.println("Registrazione effettuata correttamente");      
                stat = con.createStatement();
                                   
        SELECT = "SELECT * from ALLIEVI where Corso= '"+CORSO+"'";
         System.out.println("--------------------------------------");
        //System.out.println("voto  "+VOTO);
            try {
                // stat.execute(INSERT); //   stmt.execute(CANC);
                ris = stat.executeQuery(SELECT); 
                if (ris.next()==false){
                    System.out.println("IL CORSO NON ESISTE");}
                else{
                    do{ 
                         System.out.println("NOME = " +  ris.getString("nome"));
                        System.out.println("CORSO = " +  ris.getString("Corso"));       
                        System.out.println("CODICE ALLIEVO = " +  ris.getString("ID_Allievo")); 
                        System.out.println("--------------------------------------");            
                    }while (ris.next());         
                }                      
            } catch (Exception e) {
                System.out.println("** Errore  SQL \n"+ e);}  
            } catch (Exception e) {
                System.out.println("** ERRORE CONNESIONE DATABASE");
            }         
    }  


public void CERCAALLIEVI3(){
        String NOME;
        System.out.println("INSERISCI IL NOME DA CERCARE :");
        NOME= in.nextLine();
            try {
                System.out.println("Connessione in corso.....");
                con=DriverManager.getConnection(url, userid, pass);
                System.out.println("Registrazione effettuata correttamente");      
                stat = con.createStatement();
                                   
SELECT="select * from allievi INNER join esami on allievi.ID_Allievo=esami.ID_Allievo where nome= '"+NOME+"'";
         System.out.println("--------------------------------------");
        //System.out.println("voto  "+VOTO);
            try {
                // stat.execute(INSERT); //   stmt.execute(CANC);
                ris = stat.executeQuery(SELECT); 
                if (ris.next()==false){
                    System.out.println("IL NOME NON ESISTE O NON CI SONO ESAMI");}
                else{
                    do{ 
                        
                    System.out.println("NOME = " +  ris.getString("nome"));
                    System.out.println("CORSO = " +  ris.getString("Corso"));  
                    System.out.println("CODICE ESAME = " + ris.getString("ID_Esame"));
                    System.out.println("VOTO = " + ris.getString("voto"));
                    System.out.println("DATA = " +  ris.getString("data_Esame"));
                    System.out.println("MATERIA = " +  ris.getString("materia"));
                    System.out.println("CODICE ALLIEVO = " +  ris.getString("ID_Allievo")); 
                    System.out.println("--------------------------------------");            
                    }while (ris.next());         
                }                      
            } catch (Exception e) {
                System.out.println("** Errore  SQL \n"+ e);}  
            } catch (Exception e) {
                System.out.println("** ERRORE CONNESIONE DATABASE");
            }         
    }  
}

    