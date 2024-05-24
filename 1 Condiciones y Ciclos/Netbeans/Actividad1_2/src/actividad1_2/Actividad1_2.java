// El sistema de calificación americano (de EstadosUnidos) 

package actividad1_2;
import java.util.Scanner;

public class Actividad1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de calificación americano");
        
        while (true){
            System.out.println("\nIntroduce grado númerico del 0 al 100");
            float cal = sc.nextFloat(); //calificación
            
            if ((90<=cal)&&(cal<=100)){
                System.out.println("A");
            }
            else if ((80<=cal)&&(cal<90)){
                System.out.println("B");
            }
            else if ((70<=cal)&&(cal<80)){
                System.out.println("C");
            }
            else if ((60<=cal)&&(cal<70)){
                System.out.println("D");
            }
            else if ((0<=cal)&&(cal<60)){
                System.out.println("F");
            }
            else{
                System.out.println("??");
            }
            
        } 
        
    }   
}
