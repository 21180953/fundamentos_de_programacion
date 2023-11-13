

package com.mycompany.programaveintiunou3;
import java.util.Scanner;

public class Programaveintiunou3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int cn,i;
        double n,cubo;
        System.out.println("ingresa la cantidad de numeros a los que les vas a sacar el cuadrado");
        cn=sc.nextInt();
        for (i=0;i<cn;i++){
            System.out.println("ingresa el numero");
            n=sc.nextDouble();
            cubo=n*n*n;
            System.out.println("el cubo es"+cubo);        
        }
    }
}
