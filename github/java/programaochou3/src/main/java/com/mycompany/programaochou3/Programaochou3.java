

package com.mycompany.programaochou3;
import java.util.Scanner;

public class Programaochou3 {

    public static void main(String[] args) {
        double n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el primer numero");
        n1=sc.nextDouble();
        System.out.println("introduce el segundo numero");
        n2=sc.nextDouble();
        if(n1<n2){
        System.out.println("El segundo número " + n2 + "es mayor");   
        }else if(n1>n2){
        System.out.println("El primer número " + n1 + "es mayor");      
        }else{
        System.out.println("ambos numeros son iguales");   
        }
    }
}
