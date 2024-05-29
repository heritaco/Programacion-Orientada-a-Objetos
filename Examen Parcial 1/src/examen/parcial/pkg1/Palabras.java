package examen.parcial.pkg1;

public class Palabras {
    private String palabra;

    // Método constructor
    public Palabras(String palabra) {
        this.palabra = palabra;
    }

    // public void convertirPrimeraMayuscula() {
    // String uppercase = this.palabra.toUpperCase();
    // char primera = this.palabra.charAt(0);
    // char primeraupper = uppercase.charAt(0);
    // String buena = this.palabra.replace(primera, primeraupper);
    // System.out.println(buena);
    // }

    public void convertirPrimeraMayuscula() {
        // Separar la primera letra de la palabra
        int longitud = this.palabra.length();
        String primera = this.palabra.substring(0, 1);
        String resto = this.palabra.substring(1, longitud);
        // Convertir la primera letra a mayúscula
        String primeraMayuscula = primera.toUpperCase();
        // Concatenar la primera letra con el resto de la palabra
        String palabraMayuscula = primeraMayuscula + resto;
        System.out.println("Primera letra mayúscula: " + palabraMayuscula);
    }

    public void invertirCadena() {
        String invertida = ""; // Variable para almacenar la palabra invertida
        int longitud = this.palabra.length();
        for (int i = longitud - 1; i >= 0; i--) {
            invertida += this.palabra.charAt(i); // Concatenar la letra en la posición i
        }
        System.out.println("Palabra al reves: " + invertida);
    }

    public void convertirVocalesMayuscula() {
        String reemplazoA = this.palabra.replace('a', 'A');
        String reemplazoE = reemplazoA.replace('e', 'E');
        String reemplazoI = reemplazoE.replace('i', 'I');
        String reemplazoO = reemplazoI.replace('o', 'O');
        String reemplazoU = reemplazoO.replace('u', 'U');
        System.out.println("Vocales en mayuscula: " + reemplazoU);
    }

    public void checarPalindromo() {
        // tenemos que quitar los espacios
        String minuscula = this.palabra.toLowerCase();
        String noespacio = minuscula.replace(" ", "");

        int longitud = noespacio.length();
        String invertida = "";

        for (int i = longitud - 1; i >= 0; i--) {
            invertida += noespacio.charAt(i); // Concatenar la letra en la posición i
        }

        Boolean palindromo = noespacio.equals(invertida);

        if (palindromo == true) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }
    }
}