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
public class DATIESAMI {
     
    String INSERT;
    String SELECT;
    Scanner in = new Scanner (System.in);
    //static String nome1; static int voto1; 
    public void LEGGIESAMI(){
        
        
        int voto;  int ID;     
        String materia; 
        String data;
    
        try {
            System.out.println("Connessione in corso.....");
            con=DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");               
            stat = con.createStatement();
             System.out.println("--------------------------------------");
              
             
            do{
            System.out.println("INSERIRE L'ID DELL'ALLIEVO");
              ID= in.nextInt();
                System.out.println("ID ALLIEVO : "+ID);
                in.nextLine();
                
            SELECT= "select * from allievi where ID_Allievo =" + ID;
                //fare un do while prima di inserire i dati degli esami
                ris = stat.executeQuery(SELECT);

                if (ris.next()) 
                    break;    
                else System.out.println("L'ID dell'allievo non esiste, Riprova.");
                
            }
            while(ris.next()==false);   

                System.out.println("INSERIRE LA DATA NEL FORMATO: ANNO-MM-GG :");
                data = in.nextLine();
                System.out.println("data inserita : " + data);
        
                System.out.println("INSERIRE IL VOTO :");
                voto= in.nextInt();
                System.out.println("voto inserito : "+voto);
                in.nextLine();
                
                System.out.println("INSERIRE LA MATERIA:");
                materia= in.nextLine();
                System.out.println("Nome inserito : "+materia);
                INSERT ="INSERT INTO esami (data_Esame,voto,materia,ID_Allievo) VALUES('"+data +"','"+voto +"','"+materia+"','"+ID+"')";
                stat.execute(INSERT);//eseguire l'inserimento
         
        }catch (Exception e) {
            System.out.println("** ERRORE CONNESIONE DATABASE");
        }
    }
    
    
     public void STAMPAESAMI(){

        try {   
            System.out.println("Connessione in corso.....");
            con=DriverManager.getConnection(url, userid, pass);
            System.out.println("Registrazione effettuata correttamente");      
            stat = con.createStatement();
            SELECT = "SELECT * from esami";
        } catch (Exception e) {
            System.out.println("** ERRORE CONNESIONE DATABASE");
        }
                 System.out.println("--------------------------------------");
        try {
           // stat.execute(INSERT); //   stmt.execute(CANC);
            ris = stat.executeQuery(SELECT); 
            while (ris.next()) {
                System.out.println("DATA = " +  ris.getString("data_Esame"));
                System.out.println("VOTO = " + ris.getString("voto"));
                System.out.println("MATERIA = " +  ris.getString("materia"));
                System.out.println("CODICE ALLIEVO = " + ris.getString("ID_Allievo"));
                System.out.println("--------------------------------------");
            } 
        } catch (Exception e) {
            System.out.println("** Errore  SQL \n"+ e);}         
    }
     
     public void CERCAESAMI1(){
         // ricerca di ogni campo 
         // ricerca anche con inner join di tutte le info dell id
        int VOTO;
        System.out.println("INSERISCI IL VOTO DA CERCARE :");
        VOTO= in.nextInt();
            try {
                System.out.println("Connessione in corso.....");
                con=DriverManager.getConnection(url, userid, pass);
                System.out.println("Registrazione effettuata correttamente");      
                stat = con.createStatement();
                                   
        SELECT = "SELECT * from esami where voto= '"+VOTO+"'";
         System.out.println("--------------------------------------");
        //System.out.println("voto  "+VOTO);
            try {
                // stat.execute(INSERT); //   stmt.execute(CANC);
                ris = stat.executeQuery(SELECT); 
                if (ris.next()==false){
                    System.out.println("IL VOTO NON ESISTE");}
                else{
                    do{ 
                        System.out.println("VOTO = " + ris.getString("voto"));
                    System.out.println("CODICE ESAME = " + ris.getString("ID_Esame"));
                    System.out.println("DATA = " +  ris.getString("data_Esame"));
                    System.out.println("MATERIA = " +  ris.getString("materia"));
                        System.out.println("--------------------------------------");            
                    }while (ris.next());         
                }                      
            } catch (Exception e) {
                System.out.println("** Errore  SQL \n"+ e);}  
            
            
            } catch (Exception e) {
                System.out.println("** ERRORE CONNESIONE DATABASE");
            }         
            
     }
            
                 public void CERCAESAMI2(){
         // ricerca di ogni campo 
         // ricerca anche con inner join di tutte le info dell id
        String MATERIA;
        System.out.println("INSERISCI LA MATERIA DA CERCARE :");
        MATERIA= in.nextLine();
            try {
                System.out.println("Connessione in corso.....");
                con=DriverManager.getConnection(url, userid, pass);
                System.out.println("Registrazione effettuata correttamente");      
                stat = con.createStatement();
                                   
        SELECT = "select * from esami INNER join allievi on allievi.ID_Allievo=esami.ID_Allievo where materia= '"+MATERIA+"'";
         System.out.println("--------------------------------------");
        //System.out.println("voto  "+VOTO);
            try {
                // stat.execute(INSERT); //   stmt.execute(CANC);
                ris = stat.executeQuery(SELECT); 
                if (ris.next()==false){
                    System.out.println("LA MATERIA NON ESISTE O NON CI SONO ALLIEVI RELATIVI");}
                else{
                    do{ 
                         System.out.println("MATERIA = " +  ris.getString("materia"));
                        System.out.println("NOME = " +  ris.getString("nome"));
                    System.out.println("CORSO = " +  ris.getString("Corso"));  
                    System.out.println("CODICE ESAME = " + ris.getString("ID_Esame"));
                    System.out.println("VOTO = " + ris.getString("voto"));
                    System.out.println("DATA = " +  ris.getString("data_Esame"));
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

    

