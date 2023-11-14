/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programanueveucuatro;

/**
 *
 * @author mrjig
 */
public class ProgramanueveUcuatro {
    public static void main(String[] args) {
        String[] nombres = {"Josue", "Roberto", "Humberto", "Miguel"};
        String[] apellidos = {"Godinez", "Hernandez", "Navejas", "Diaz"};

        String[] nombresCompletos = new String[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            nombresCompletos[i] = nombres[i] + " " + apellidos[i];
        }

        System.out.println("Nombres completos:");
        for (int c = 0; c < nombresCompletos.length; c++) {
            System.out.println(nombresCompletos[c]);
        }
    }
}

