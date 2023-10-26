
package programauno;
import java.util.Scanner;
public class Programauno {



    public static void main(String[] args){
   double m, p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce la cantidad de metros");
        m = scanner.nextDouble();
        p = m * 3.28084;
        System.out.print("La longitud en pies es: " + p);   
}
