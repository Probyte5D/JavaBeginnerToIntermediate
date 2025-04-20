/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.ArrayClass;
/*
 * Classe principale che utilizza ArrayManager.
 * @author primu
 */
public class MainArrayClass  {

    public static void main(String[] args) {
      
        ArrayManager arrayManager = new ArrayManager();

        System.out.println("LEGGO IL VETTORE");
        arrayManager.leggi();

        System.out.println("STAMPO IL VETTORE");
        arrayManager.stampa();

        System.out.println("CERCO NEL VETTORE");
        arrayManager.cerca();
    }
}