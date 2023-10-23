

package com.mycompany.programacinco;
import java.util.Scanner;

public class Programacinco {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double p1,p2,p3,total;
        System.out.println("escribe precio 1");
        p1=sc.nextDouble();
        System.out.println("escribe precio 2");
        p2=sc.nextDouble();
        System.out.println("escribe precio 3");
        p3=sc.nextDouble();
        total=p1+p2+p3;
        if(total >=1500){
            total= total-(total*0.30);
        System.out.println("el total (30%): " + total); 
        } else if (total>=1500 && total>=1000)  {
        total= total- (total*0.20);
        System.out.println("el total (20%desc): " + total);
        }else if (total<1000 && total>=700)  {
        total= total- (total*0.10);
        System.out.println("el total (10%desc): " + total);
        }else{
        System.out.println("el total (sin desc): " + total);
        }
    }
}
