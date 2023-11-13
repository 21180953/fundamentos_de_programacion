
package com.mycompany.programadicieochou3;


public class Programadicieochou3 {

    public static void main(String[] args) {
        double salario=1500;
        int c;
        for(c=1;c<=6;c++){
            System.out.println("salario" + salario);
            salario += salario * 0.10;
        }
        System.out.println("El salario al cabo de 6 años es: $" + salario);
    }
}
