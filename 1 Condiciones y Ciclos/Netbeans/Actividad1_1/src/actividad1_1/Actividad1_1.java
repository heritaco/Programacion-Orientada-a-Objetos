//Un ángulo se considera agudo si es menor de 90 grados, obtuso si es mayor de 
// 90 grados y recto si es igual a 90 grados. Utilizando esta información, 
// escribir un algoritmo que acepte un ángulo en grados y visualice el tipo de 
// ángulo correspondiente a los grados introducidos.

package actividad1_1;
import java.util.Scanner;

public class Actividad1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("Introduce un ángulo");
            float angulo = sc.nextInt();
            if ((angulo+90)%180 == 0){
                System.out.println("Es un ángulo recto");
            }
            else if ((angulo)%180 == 0){
                System.out.println("Es un ángulo llano");
            }
            else if ((angulo < 90)&&(0 < angulo)){
                System.out.println("Es un ángulo agudo");
            }
            else if ((angulo > 90)&&(angulo < 360)){
                System.out.println("Es un ángulo obtuso");
            }
            else {
                System.out.println("No le hice para eso D:");
            }
        }
        
    }
}