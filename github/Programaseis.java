
package programaseis;
import java.util.Scanner;

public class Programaseis {

    public static void main(String[] args) {
 double c1, c2, c3, subtotal, total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio del producto 1: ");
        c1 = scanner.nextDouble();
        System.out.print("Ingresa el precio del producto 2: ");
        c2 = scanner.nextDouble();
        System.out.print("Ingresa el precio del producto 3: ");
        c3 = scanner.nextDouble();
        total = c1 + c2 + c3;
        subtotal = total / 1.16;
        System.out.println("El IVA subtotal es " + subtotal);
        System.out.println("El total es " + total);

    }
    
}
