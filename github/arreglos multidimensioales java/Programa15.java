/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa15;

/**
 *
 * @author mrjig
 */
public class Programa15 {
    public static void main(String[] args) {
        // Generar una matriz con números específicos
        double[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
        };

        int f = matriz.length;
        int c = matriz[0].length;
        for (int i = 0; i < f; i++) {
            double suma = 0;
            for (int a = 0; a < c; a++) {
                suma += matriz[i][a];
            }
            double media = suma / c;
            System.out.println("La media de la fila es: " + media);
        }
    }
}

