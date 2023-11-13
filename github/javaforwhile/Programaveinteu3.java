
package com.mycompany.programaveinteu3;
import java.util.Scanner;


public class Programaveinteu3 {

    public static void main(String[] args) {
        int c,i;
        double ahorrod=3,ahorroa=3;
        Scanner sc= new Scanner (System.in);
        System.out.println("ahorro diario "+ ahorrod);
        for(i=0;i<364;i++){
        ahorrod=ahorrod*3;
        System.out.println("ahorro diario "+ ahorrod);
        ahorroa=ahorroa+ahorrod;
        }
        System.out.println("ahorro anual "+ ahorroa);
    }
}
