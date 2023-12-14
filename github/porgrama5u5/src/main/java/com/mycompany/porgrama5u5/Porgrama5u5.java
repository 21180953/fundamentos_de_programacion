/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.porgrama5u5;


public class Porgrama5u5{
    public static void main(String[] args) {
        String texto = "Hola, este es un ejemplo de contador de palabras.";
        int numeroDePalabras = contarPalabras(texto);
        System.out.println("El número de palabras es: " + numeroDePalabras);
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }
}

