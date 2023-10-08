
package programacinco;
import java.util.Scanner;


public class Programacinco {

    public static void main(String[] args) {
   double y, a, x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de y: ");
        y = scanner.nextDouble();
        System.out.print("Ingresa el valor de a: ");
        a = scanner.nextDouble();
        x = y + a + 3;
        System.out.println("x es " + x);
    }
    
}
