/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabellina;

/**
 *
 * @author primu
 */
public class Tabellina {

    public static void main(String[] args) {
        System.out.println("TAVOLA PITAGORICA"); 
        int i=0;int j=0;
       
        for (i=1;i<=10;i++){
            for(j=1;j<=10;j++)
            {
                 //System.out.print(i*j);
                 String prodotto = String.format("%5d", i*j);
                 System.out.print(prodotto);
            }
            System.out.println();
        }
    }
}
