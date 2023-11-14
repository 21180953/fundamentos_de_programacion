/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaseisucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramaseisUcuatro {
    public static void main(String[] args) {
        int total;
        int[] desordenados = { 10, 9, 8, 7 };
        total = 4;
        int[] ordenados = new int[4];
        for (int i = 0; i < total; i++) {
            ordenados[i] = desordenados[total - i - 1];
            System.out.println(ordenados[i]);
        }
    }
}

