

package com.mycompany.programadiezu3;
import java.util.Scanner;

public class Programadiezu3 {

    public static void main(String[] args) {
        double ss,sh;
        int h,he;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el pago por hora");
        sh=sc.nextDouble();
        System.out.println("introduce el numero de horas trabajadas en la semana");
        h=sc.nextInt();
        if(h<=40){
        ss=sh*h;   
        }else{
             he=h-40;
       ss=40*sh+he*sh*2;
        }
       System.out.println("El sueldo semanal es: " +ss);
    }
}
