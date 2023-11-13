

package com.mycompany.programadiecinueveu3;
import java.util.Scanner;

public class Programadiecinueveu3 {

    public static void main(String[] args) {
        int c,cn,cantidadceros=0,numerosnegativos=0,numerospositvos=0;
        double n;
        Scanner sc= new Scanner (System.in);
        System.out.println("ingresa la cantidad de nuemros");
        cn=sc.nextInt();
        for(c=0;c<cn;c++){
        System.out.println("ingresa un nuemros"); 
        n=sc.nextDouble();
        if(n==0){
            cantidadceros++;
        }else if(n>0){
            numerospositvos++;
        }else{
            numerosnegativos++;
        }
        }
              System.out.println("cantidad de ceros"+cantidadceros);
              System.out.println("cantidad de positivos"+numerospositvos);  
              System.out.println("cantidad de negativos"+numerosnegativos);  
    }
}
