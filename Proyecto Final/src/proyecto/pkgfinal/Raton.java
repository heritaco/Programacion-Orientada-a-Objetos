import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Raton {
    private char[][] laberinto;
    private List<String> movimientos;
    private int startX, startY;

    public Raton(String filePath) throws IOException {
        this.laberinto = leerLaberinto(filePath);
        this.movimientos = new ArrayList<>();
        buscarInicio();
    }

    private char[][] leerLaberinto(String filePath) throws IOException {
        List<char[]> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line.toCharArray());
        }
        reader.close();
        return lines.toArray(new char[0][]);
    }

    private void buscarInicio() {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j] == 'S') {
                    startX = i;
                    startY = j;
                    return;
                }
            }
        }
    }

    public List<String> resolverLaberinto() {
        if (mover(startX, startY)) {
            return movimientos;
        } else {
            return null; // No se encontró camino
        }
    }

    private boolean mover(int x, int y) {
        if (laberinto[x][y] == 'F') { // Llegamos a la meta
            return true;
        }

        laberinto[x][y] = '1'; // Marcamos como visitado

        if (esValido(x + 1, y)) {
            movimientos.add("abajo");
            if (mover(x + 1, y)) {
                return true;
            }
            movimientos.remove(movimientos.size() - 1);
        }

        if (esValido(x - 1, y)) {
            movimientos.add("arriba");
            if (mover(x - 1, y)) {
                return true;
            }
            movimientos.remove(movimientos.size() - 1);
        }

        if (esValido(x, y + 1)) {
            movimientos.add("derecha");
            if (mover(x, y + 1)) {
                return true;
            }
            movimientos.remove(movimientos.size() - 1);
        }

        if (esValido(x, y - 1)) {
            movimientos.add("izquierda");
            if (mover(x, y - 1)) {
                return true;
            }
            movimientos.remove(movimientos.size() - 1);
        }

        laberinto[x][y] = '0';
        return false;
    }

    private boolean esValido(int x, int y) {
        return x >= 0 && x < laberinto.length && y >= 0 && y < laberinto[0].length
                && (laberinto[x][y] == '0' || laberinto[x][y] == 'F');
    }

    public static void main(String[] args) {
        try {
            Raton raton = new Raton("LaberintoEjemplo(1).txt");
            List<String> solucion = raton.resolverLaberinto();
            if (solucion != null) {
                for (String movimiento : solucion) {
                    System.out.println(movimiento);
                }
            } else {
                System.out.println("No se encontró un camino");
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        }
    }
}
