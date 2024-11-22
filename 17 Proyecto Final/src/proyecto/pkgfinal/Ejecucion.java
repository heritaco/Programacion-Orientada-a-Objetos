package proyecto.pkgfinal;

import java.io.*;
import java.util.*;

public class Ejecucion {

    public String file = "LaberintoEjemplo(1).txt";

    public void iniciarPograma() {

        try {
            Raton raton = new Raton();
            raton.buscarInicio();
            raton.resolverLaberinto();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}