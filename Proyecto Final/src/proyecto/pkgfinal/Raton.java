package proyecto.pkgfinal;

import java.io.*;
import java.util.*;

public class Raton {
    // Atributos
    public char[][] laberinto; // El laberinto es una matriz
    public List<String> movimientos; // Es una lista de movimientos
    public int iniciox; // La posicion de inicio de x
    public int inicioy; // La posicion de inicio de y

    // Constructor
    public Raton() throws IOException { // throws IOException es para manejar excepciones por si no se encuentra el
                                        // archivo
        this.laberinto = leerLaberinto(); // Lee el laberinto
        this.movimientos = new ArrayList<String>(); // Inicializa la lista de movimientos
        this.iniciox = 0; // Inicializa la posicion de inicio de x
        this.inicioy = 0; // Inicializa la posicion de inicio de y
    }

    public char[][] leerLaberinto() throws IOException {

        Ejecucion ejecucion = new Ejecucion();
        String file = ejecucion.file; // Obtiene el nombre del archivo
        List<char[]> lineas = new ArrayList<>(); // Crea una lista de lineas

        File inFile = new File(file);
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String linea = bufReader.readLine();

        // Para cada linea del archivo, si la linea no es nula, la agrega a la lista de
        while (linea != null) {
            lineas.add(linea.toCharArray()); // toCharArray convierte la linea en un arreglo de caracteres
            linea = bufReader.readLine(); // Lee la siguiente linea
        }

        // Convierte la lista de lineas en una matriz
        char[][] laberinto = new char[lineas.size()][]; // Crea una matriz de caracteres con el tamaño de la lista de
                                                        // lineas
        // Recorre la lista de lineas y la convierte en una matriz
        for (int i = 0; i < lineas.size(); i++) {
            laberinto[i] = lineas.get(i); // Agrega la linea a la matriz
        }

        return laberinto;
    }

    public void buscarInicio() {
        for (int i = 0; i < laberinto.length; i++) { // lee las filas
            for (int j = 0; j < laberinto[i].length; j++) { // lee las columnas
                if (laberinto[i][j] == 'S') { // cuando encuentre 'S'
                    iniciox = i;
                    inicioy = j;
                    return;
                }
            }
        }
    }

    private boolean mover(int x, int y) {

        if (laberinto[x][y] == 'F') { // Si llegamos a la salida
            return true; // Terminamos
        }

        laberinto[x][y] = '1'; // Marcamos como visitado

        // Verificamos si podemos movernos
        if (x + 1 >= 0 && x + 1 < laberinto.length && y >= 0 && y < laberinto[0].length
                && (laberinto[x + 1][y] == '0' || laberinto[x + 1][y] == 'F')) {

            movimientos.add("abajo");

            // Llamamos recursivamente a mover para la nueva posicion
            if (mover(x + 1, y)) {
                // Si se llega a la salida, retornamos true
                return true;
            }
        }

        if (x - 1 >= 0 && x - 1 < laberinto.length && y >= 0 && y < laberinto[0].length
                && (laberinto[x - 1][y] == '0' || laberinto[x - 1][y] == 'F')) {
            movimientos.add("arriba");
            if (mover(x - 1, y)) {
                return true;
            }
        }

        if (x >= 0 && x < laberinto.length && y + 1 >= 0 && y + 1 < laberinto[0].length
                && (laberinto[x][y + 1] == '0' || laberinto[x][y + 1] == 'F')) {
            movimientos.add("derecha");
            if (mover(x, y + 1)) {
                return true;
            }
        }

        if (x >= 0 && x < laberinto.length && y - 1 >= 0 && y - 1 < laberinto[0].length
                && (laberinto[x][y - 1] == '0' || laberinto[x][y - 1] == 'F')) {

            movimientos.add("izquierda");

            if (mover(x, y - 1)) {
                return true;
            }
        }

        return false;
    }

    public void resolverLaberinto() {

        Ejecucion ejecucion = new Ejecucion();
        String filen = ejecucion.file;

        File file = new File("Solucion de " + filen);
        FileWriter miFileWriter = null;
        PrintWriter miPrintWriter = null;

        // Para que se sobreescriva lo comente :p
        // if (file.exists()) {
        // System.out.println("Ya existe un archivo");
        // } else {
        System.out.println("Creando archivo...");
        try {
            file.createNewFile();
            miFileWriter = new FileWriter(file);
            miPrintWriter = new PrintWriter(miFileWriter);
            if (mover(iniciox, inicioy)) { // Si retorna true, se llego a la salida
                for (String movimiento : movimientos) {
                    miPrintWriter.println(movimiento);
                }
            } else {
                miPrintWriter.println("No se encontró un camino que lleve al objetivo :c"); // Ya agruegué que pasa si
                                                                                            // no se encuentra un camino
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close resources
            try {
                miFileWriter.close();
                miPrintWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // }
    }
}
