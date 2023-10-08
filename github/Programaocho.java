
package programaocho;
import java.util.Scanner;

public class Programaocho {

    public static void main(String[] args) {
 double c1, c2, c3, c4, c5, c6, p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa calificación 1: ");
        c1 = scanner.nextDouble();
        System.out.print("Ingresa calificación 2: ");
        c2 = scanner.nextDouble();
        System.out.print("Ingresa calificación 3: ");
        c3 = scanner.nextDouble();
        System.out.print("Ingresa calificación 4: ");
        c4 = scanner.nextDouble();
        System.out.print("Ingresa calificación 5: ");
        c5 = scanner.nextDouble();
        System.out.print("Ingresa calificación 6: ");
        c6 = scanner.nextDouble();
        p = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
        System.out.println("El promedio es " + p);
    }
    
}
