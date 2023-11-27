/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa17;

/**
 *
 * @author mrjig
 */
import java.util.Scanner;

import java.util.Scanner;

public class Programa17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] resultado = new int[4][4];

        System.out.println("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < 4; i++) {
            for (int f = 0; f < 4; f++) {
                System.out.println("Ingrese el valor para la fila " + (i+1) + " y la columna " + (f+1));
                matriz1[i][f] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los valores para la segunda matriz:");
        for (int i = 0; i < 4; i++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Ingrese el valor para la fila " + (i+1) + " y la columna " + (c+1));
                matriz2[i][c] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println("El resultado de la multiplicación es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}

  