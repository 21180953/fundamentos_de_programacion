/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programasieteucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramasieteUcuatro {
    public static void main(String[] args) {
        double media, mediana, total = 0;
        int[] numeros = {8, 9, 11, 11, 12};
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        media = total / numeros.length;
        mediana = numeros[2];
        System.out.println("La mediana es: " + mediana);
        System.out.println("La media es: " + media);
    }
}
