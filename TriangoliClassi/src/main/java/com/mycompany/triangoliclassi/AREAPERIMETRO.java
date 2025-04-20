/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triangoliclassi;

import java.util.Scanner;
/**
 *
 * @author primu
 */
public class AREAPERIMETRO {
   
  // Metodo per calcolare l'area del triangolo
    public float area(float base, float altezza) {
        float area = (base * altezza) / 2;
        System.out.println("Area del triangolo = " + area);
        return area;
    }

    // Metodo per calcolare il perimetro del triangolo
    public float perimetro(float lato1, float lato2, float lato3) {
        float perimetro = lato1 + lato2 + lato3;
        System.out.println("Perimetro del triangolo = " + perimetro);
        return perimetro;
    }

    // Metodo per determinare il tipo di triangolo
    public String tipo(float latoA, float latoB, float latoC) {
        String tipoTriangolo;

        if (latoA == latoB && latoB == latoC) {
            tipoTriangolo = "Triangolo Equilatero";
        } else if (latoA != latoB && latoB != latoC && latoA != latoC) {
            tipoTriangolo = "Triangolo Scaleno";
        } else {
            tipoTriangolo = "Triangolo Isoscele";
        }

        System.out.println("Tipo di triangolo: " + tipoTriangolo);
        return tipoTriangolo;
    }

    // Metodo per verificare la validità del triangolo
    public boolean validita(float latoA, float latoB, float latoC) {
        return latoA + latoB > latoC && latoB + latoC > latoA && latoA + latoC > latoB;
    }
}
