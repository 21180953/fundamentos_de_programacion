/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaochoucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramaochoUcuatro {
    public static void main(String[] args) {
        int[] numeros = {2, 2, 3, 4, 5, 6, 7};
        int impares = 0, pares = 0, numero = 0;
        for (int i = 0; i < 7; i++) {
            numero = numeros[i];
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}

