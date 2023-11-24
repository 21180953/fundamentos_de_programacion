/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programatresutres;

import java.util.Scanner;

public class ProgramatresUcuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total;
        System.out.print("Introduce la cantidad de temperaturas: ");
        total = scanner.nextInt();
        double[] temperaturas = new double[total];
        for (int i = 0; i < total; i++) {
            System.out.print("Introduce la temperatura en grados centígrados: ");
            temperaturas[i] = scanner.nextDouble();
        }
        for (int i = 0; i < total; i++) {
            double fahrenheit = temperaturas[i] * 9 / 5 + 32;
            double kelvin = temperaturas[i] + 273.15;
            System.out.println("Temperatura en °C: " + temperaturas[i] + ", en °F: " + fahrenheit + ", en °K: " + kelvin);
        }
        scanner.close();
    }
}

