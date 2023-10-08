/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa2;
import java.util.Scanner;

public class Programa2 {

  
    public static void main(String[] args) {
        double m, p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce la cantidad de metros");
        m = scanner.nextDouble();
        p = m * 3.28084;
        System.out.print("La longitud en pies es: " + p);

    }
    
}
