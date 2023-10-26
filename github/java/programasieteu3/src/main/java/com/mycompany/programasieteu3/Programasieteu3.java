
package com.mycompany.programasieteu3;

import java.util.Scanner;
public class Programasieteu3 {

    public static void main(String[] args) {
        double t;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la temperatura");
        t=sc.nextDouble();
        if(t>27){
        System.out.println("hace calor"); 
        }else if(t>20){
        System.out.println("clima agradable"); 
        }else{
        System.out.println("hace frio");     
        }
    }
}
