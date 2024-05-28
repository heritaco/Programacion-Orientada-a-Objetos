package pkg2.clases.y.objetos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular cosas de un círculo o de un cuadrado");
        
        while (true){
            System.out.println("¿Círculo (1) o cuadrado (2)?");
            int figura = sc.nextInt();
            
            switch (figura){
                case 1:
                    System.out.println("Radio: ");
                    float radio = sc.nextFloat();
                    
                    Circulo circulo = new Circulo(radio);
                    
                    circulo.calcularArea();
                    circulo.calcularCircunferencia();
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Lado: ");
                    float lado = sc.nextFloat();
                    // Creamos el objeto del cuadrado
                    Cuadrado cuadrado = new Cuadrado(lado);
                    // Llamamos a los métodos que puede hacer cuadrado
                    cuadrado.calcularPerimetro();
                    cuadrado.calcularArea();
                    cuadrado.calcularDiagonal();
                    
                    break;
                default:
                    System.out.println("?");
            }
        }
    }
}
