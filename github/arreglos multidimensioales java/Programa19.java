/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa19;

/**
 *
 * @author mrjig
 */
public class Programa19 {
    public static void main(String[] args) {
        // Generar una matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int Pares = 0;
        int Impares = 0;

        // Contar los números pares e impares
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    Pares++;
                } else {
                    Impares++;
                }
            }
        }

        System.out.println("Cantidad de números pares: " + Pares);
        System.out.println("Cantidad de números impares: " + Impares);
    }
}

    
