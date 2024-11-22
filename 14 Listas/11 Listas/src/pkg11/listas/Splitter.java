package pkg11.listas;

import java.util.List;
import java.util.ArrayList;

public class Splitter {

    public List<Integer> pares(Fibonacci fibonacciLista) {
        List<Integer> valoresPares = new ArrayList<>();
        for (Integer valor : fibonacciLista.fibonacciLista) {
            if (valor % 2 == 0) {
                valoresPares.add(valor);
            }
        }
        return valoresPares;
    }

    public List<Integer> impares(Fibonacci fibonacciLista) {
        List<Integer> valoresImpares = new ArrayList<>();
        for (Integer valor : fibonacciLista.fibonacciLista) {
            if (valor % 2 != 0) {
                valoresImpares.add(valor);
            }
        }
        return valoresImpares;
    }
}
