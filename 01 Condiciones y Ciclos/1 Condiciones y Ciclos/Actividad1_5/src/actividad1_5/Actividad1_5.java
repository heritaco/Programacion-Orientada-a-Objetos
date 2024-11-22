// Escriba un programa que solicite una contraseña (el texto de la contraseña
// no es importante) y la vuelva a solicitar hasta que las dos contraseñas coincidan.

package actividad1_5;
import java.util.Scanner;

public class Actividad1_5 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            boolean a = true;
            
            while(a){
                System.out.println("Ingresa contraseña");
                String con1 = sc.nextLine(); // contraseña 1
                System.out.println("Verifica contraseña");
                String con2 = sc.nextLine(); // contraseña 2

                if (con1.equals(con2)){ // para comparar cadenas es con equals()
                    System.out.println("wuuu");
                    a = false;
                }

                else{
                    System.out.println("Las contraseñas no coinciden\n");
                }
                
            }
        }
}
