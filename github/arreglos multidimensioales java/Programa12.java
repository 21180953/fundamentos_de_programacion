/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa12;

/**
 *
 * @author mrjig
 */
public class Programa12 {
    public static void main(String[] args) {
        int[][] calf = {
            {5, 7, 9, 5},
            {6, 8, 7, 5},
            {1, 0, 3, 1}
        };
        int fila = calf.length;
        int columna = calf[0].length;
        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                System.out.print(calf[f][c] + ",");
            }
            System.out.println();
        }
    }
}

