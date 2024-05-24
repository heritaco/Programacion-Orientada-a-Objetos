// Dado un número, cuente el número total de dígitos de un número
// Por ejemplo, el número es 75869, por lo que la salida debería ser 5.

package actividad1_4;
import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        System.out.println("Número de dígitos\n");
        while (true){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un entero");
            int num = sc.nextInt();
            int dig = 0;
            int i = 1;
            
            // vamos a usar un while porque no sabemos cuando va a parar
            
            while ((num/i)>0){ // Cuando Java divide un entero se trunca el decimal
                               // si declaramos a 1 como entero, 1 / 2 = 0
                dig++;
                i *= 10;
            }
    
            System.out.println(dig + "\n");
            
        }
    }
}
