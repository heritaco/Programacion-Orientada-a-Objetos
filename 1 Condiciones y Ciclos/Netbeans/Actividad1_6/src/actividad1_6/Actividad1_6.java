// Calcular la cantidad de números pares e impares comprendidos entre dos numeros dados.

package actividad1_6;
import java.util.Scanner;
import java.lang.Math;

public class Actividad1_6 {
        public static void main(String[] args) {
            while (true){
               
                Scanner sc = new Scanner(System.in);

                System.out.println("Ingresa un entero");
                int num1 = sc.nextInt(); // numero 1
                System.out.println("Ingresa otro entero");
                int num2 = sc.nextInt(); // numero 2

                int totalnums =  Math.abs(num1 - num2); // importamos Math para el abs
                int pares = 0;
                int impares = 0;

                if (num1<num2){
                    for(int i=num1+1; i<num2; i++){
                        if( (i%2) == 0){
                            pares++;
                        }
                        else{
                            impares++;
                        }
                    }
                    System.out.println("Numeros entre " + num1 + " y " + num2);
                }

                else if (num1 == num2){
                    System.out.println("??");
                    System.out.println("Numeros entre HJAJH no hay");
                }

                else{
                    for(int i=num2+1; i<num1; i++){
                        if( (i%2) == 0){
                            pares++;
                        }
                        else{
                            impares++;
                        }
                    }
                    System.out.println("Numeros entre " + num2 + " y " + num1);
                }
                System.out.println("Numeros pares: " + pares);
                System.out.println("Numeros impares: " + impares + "\n");
            }
            
        }
}