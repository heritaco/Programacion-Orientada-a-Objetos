// Imprima el siguiente patron
// *
// **
// ***
// **
// *
// Aqui tamaño=3

package actividad1_3;
import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
        while (true)
        {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Tamaño de la escalera");
            int tamaño = sc.nextInt();
            
            for (int i=1; i<=tamaño; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i=(tamaño-1); i>=1; i--){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
}
