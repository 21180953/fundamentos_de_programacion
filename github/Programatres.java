
package programatres;
 import java.util.Scanner;
public class Programatres {

  
    public static void main(String[] args) {
double a, l;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del lado del hexágono: ");
        l = scanner.nextDouble();
        a = (3 * Math.sqrt(3) / 2) * (l * l);
        System.out.print("El área del hexágono es: " + a);
    }
    
}
