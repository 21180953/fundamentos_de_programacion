

package com.mycompany.programaseisu3;

import java.util.Scanner;
public class Programaseisu3 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);        
        System.out.println("ingresa un numero entero positivo");
        n=sc.nextInt();
         if (n <0) {
            System.out.println("el numero es negativo por favor ingresa otro numero");
        } else if (n % 2 == 0){
            System.out.println("es par" + n);
        }else{System.out.println("es impar " + n);
        }        
    }
}
