/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacatoce;

/**
 *
 * @author mrjig
 */
public class Programacatoce {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {5, 6, 7},
            {8, 9, 10}
        };
        int suma = 0;
        for (int c = 0; c < matriz.length; c++) {
            for (int i = 0; i < matriz[c].length; i++) {
                suma += matriz[c][i];
            }
        }
        System.out.println(suma);
    }
}

