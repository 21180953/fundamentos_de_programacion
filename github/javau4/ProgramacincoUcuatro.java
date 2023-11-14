/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacincoucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramacincoUcuatro {
    public static void main(String[] args) {
        int total;
        String[] frutas = { "sandia", "kiwi", "manzana", "mora" };
        total = 4;
        String[] antifrutas = new String[4];
        for (int i = 0; i < total; i++) {
            antifrutas[i] = frutas[total - i - 1];
            System.out.println(antifrutas[i]);
        }
    }
}