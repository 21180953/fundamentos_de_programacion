
package com.mycompany.programatrece;
import java.util.Scanner;

public class Programatrece {

    public static void main(String[] args) {
      double p, c1, c2, c3, c4, c5, c6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la primer calificación: ");
        c1 = sc.nextDouble();
        System.out.print("Escribe la segunda calificación: ");
        c2 = sc.nextDouble();
        System.out.print("Escribe la tercera calificación: ");
        c3 = sc.nextDouble();
        System.out.print("Escribe la cuarta calificación: ");
        c4 = sc.nextDouble();
        System.out.print("Escribe la quinta calificación: ");
        c5 = sc.nextDouble();
        System.out.print("Escribe la sexta calificación: ");
        c6 = sc.nextDouble();
        p = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
        System.out.println("Tu promedio es: " + p);
        if (p >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
