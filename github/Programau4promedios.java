

package com.mycompany.programau4promedios;


public class Programau4promedios {

    public static void main(String[] args) {
         int[] calificaciones = {90, 85, 95, 88, 92, 87};
         double promedio,suma=0;
         for(int i=0;i<calificaciones.length;i++){
         suma+=calificaciones[i];           
         }
         promedio=suma / calificaciones.length;
         System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
