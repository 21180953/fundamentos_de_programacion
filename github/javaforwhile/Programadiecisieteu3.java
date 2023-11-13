
package com.mycompany.programadiecisieteu3;
import java.util.Scanner;

public class Programadiecisieteu3 {

    public static void main(String[] args) {
        char c;
        Scanner sc= new Scanner (System.in);
        System.out.println("bien venido");

        do {
            System.out.println("para salir imprima n");
            c = sc.next().charAt(0);
        } while(c != 'n');

        System.out.println("saliste del programa");
    }
}

