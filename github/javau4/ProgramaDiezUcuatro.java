/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programadiezucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramaDiezUcuatro {
    public static void main(String[] args) {
        int numerodeletras = 0;
        double promedio;
        String[] paises = {"brazil", "bolivia", "reinounido", "argentina"};
        for (int i = 0; i < paises.length; i++) {
            numerodeletras += paises[i].length();
        }
        promedio = (double) numerodeletras / paises.length;
        System.out.println("El promedio de letras del nombre de cada país es: " + promedio);
    }
}

