

package com.mycompany.programadieciseisu3;
import java.util.Scanner;

public class Programadieciseisu3 {

    public static void main(String[] args) {
        int c=1,horas;
        double pago,sueldo;
        Scanner sc = new Scanner(System.in); 
        while (c<=20){
             System.out.println("introduce la cantidad de horas trabajadas");
             horas=sc.nextInt();
             System.out.println("introduce el pago");
             pago=sc.nextDouble();
             sueldo=horas*pago;
             System.out.println("El sueldo del empleado " + c + " es " + sueldo); 
             c++;
        }
    }
}