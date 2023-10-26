

package com.mycompany.programatrecefor;
import java.util.Scanner;

public class Programatrecefor {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n,c,totalp,totaln;
        totalp=0;
        totaln=0;        
        for (c=1;c<=5;c++){
            System.out.println("ingresa un numero");
            n=sc.nextInt();
            if (n>=0){
            totalp=totalp+1;
        }else {
            totaln=+totaln+1;
            }
           System.out.println("cantiad de umeros positivos"+totalp);
           System.out.println("cantiad de umeros negativos"+totaln);
        }    
    }
}
