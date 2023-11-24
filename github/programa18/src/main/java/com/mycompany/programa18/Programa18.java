/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa18;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa18 {

    public static void main(String[] args) {
        int diag[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("diagonal principal");
        for (int c=0;c< diag.length;c++)
        {
                System.out.println(diag[c][c]+"");
        }
        System.out.println("diagonal inversa...");
        for(int i=0;i<3;i++){
        System.out.println(diag[i][diag.length-1-i]+"");
        }
             System.out.println("diagonal secundaria...");
           for(int i=1;i<3;i++){
            System.out.println(diag[i][i-1]+"");
           }
    }
}
