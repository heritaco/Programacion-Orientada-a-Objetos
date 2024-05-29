package examen.parcial.pkg1;

import java.util.Scanner;

public class Ejecucion {
    public void iniciarPrograma() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPrograma para anita lava la tina: ");
        Palabras anitalavalatina = new Palabras("anita lava la tina");
        anitalavalatina.convertirPrimeraMayuscula();
        anitalavalatina.invertirCadena();
        anitalavalatina.convertirVocalesMayuscula();
        anitalavalatina.checarPalindromo();

        System.out.println("\nPrograma para hasta luego cocodrilo: ");
        Palabras hastaluegococodrilo = new Palabras("hasta luego cocodrilo");
        hastaluegococodrilo.convertirPrimeraMayuscula();
        hastaluegococodrilo.invertirCadena();
        hastaluegococodrilo.convertirVocalesMayuscula();
        hastaluegococodrilo.checarPalindromo();

        while (true) {
            System.out.println("\n¿Quieres ver el FizzBuzz hasta 100? \n(1) Sí\n(2) No\n" +
                    "(3) Quiero poner mis cadenas\n(4) Quiero el FizzBuzz hasta el numero que yo quiera\n" +
                    "(5) Salir\n");
            String opcion2 = sc.nextLine();
            opcion2 = opcion2.toLowerCase();
            System.out.println("");

            switch (opcion2) {
                case "sí":
                case "si":
                case "1":
                    Extra fizzbuzz = new Extra();
                    fizzbuzz.crearFizzBuzz(100);
                    break;

                case "no":
                case "2":
                    System.out.println("¿Salir? (1) Sí (2) No");
                    String salir = sc.nextLine();
                    salir = salir.toLowerCase();
                    switch (salir) {
                        case "sí":
                        case "si":
                        case "1":
                            System.out.println("Adiós");
                            System.exit(0);
                            break;
                        case "no":
                        case "2":
                            System.out.println("Okeii");
                            break;

                        default:
                            System.out.println(":p");
                            break;
                    }
                    break;

                case "quiero poner mis palabras":
                case "3":
                    System.out.println("\n¿Que palabra quieres?");
                    String palabraquequieroscan = sc.nextLine();
                    Palabras palabraquequiero = new Palabras(palabraquequieroscan);
                    palabraquequiero.convertirPrimeraMayuscula();
                    palabraquequiero.invertirCadena();
                    palabraquequiero.convertirVocalesMayuscula();
                    palabraquequiero.checarPalindromo();
                    break;

                case "quiero el fizzbuzz hasta el numero que yo quiera":
                case "fizzbuzz":
                case "4":
                    System.out.println("¿Hasta que número quieres el FizzBuzz?");
                    String numeroscan = sc.nextLine();
                    int numero = Integer.parseInt(numeroscan);
                    Extra fizzbuzz2 = new Extra();
                    fizzbuzz2.crearFizzBuzz(numero);
                    break;

                case "salir":
                case "5":
                    System.out.println("Adiós :C");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}