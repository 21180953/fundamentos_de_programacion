

package com.mycompany.programaunou3;
import java.util.Scanner;

public class Programaunou3 {

    public static void main(String[] args) {
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu edad");
        e=sc.nextInt();
        if(e>=18){
        System.out.println("eres mayor de edad");
        }else{
        System.out.println("eres menor de edad");    
        }        
    }
}
