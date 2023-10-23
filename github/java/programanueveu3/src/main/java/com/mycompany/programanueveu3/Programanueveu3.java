

package com.mycompany.programanueveu3;
import java.util.Scanner;

public class Programanueveu3 {

    public static void main(String[] args) {
        int he,s,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la hora de entrada");
        he=sc.nextInt();
        System.out.println("introduce la hora de salida");
        s=sc.nextInt();
        h = s - he;
        double c = 0;
        if (h <= 2) {
            c = h * 5.00;
        } else if (h<= 5) {
            c = 2 * 5.00 + (h - 2) * 4.00;
        } else if (h <= 10) {
            c = 2 * 5.00 + 3 * 4.00 + (h - 5) * 3.00;
        } else {
            c = 2 * 5.00 + 3 * 4.00 + 5 * 3.00 + (h - 10) * 2.00;
        }
         System.out.println("El costo total es: " + c);
    }
}
