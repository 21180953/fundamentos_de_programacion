/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa16;

/**
 *
 * @author mrjig
 */
public class Programa16 {
    public static void main(String[] args) {
        char[][] letras = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'}
        };
        for (int f = 1; f >= 0; f--) {
            for (int c = 2; c >= 0; c--) {
                System.out.println(letras[f][c] + ",");
            }
            System.out.println();
        }
    }
}

