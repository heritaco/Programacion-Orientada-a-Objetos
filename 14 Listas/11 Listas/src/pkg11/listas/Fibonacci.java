package pkg11.listas;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> fibonacciLista = new ArrayList<>(); // Creamos una lista de enteros
    int valor = 0;
    int limite = 1000000;

    public List<Integer> fibonacci() {
        fibonacciLista.add(0); // Añadimos el primer número de la serie
        fibonacciLista.add(1); // Añadimos el segundo número de la serie
        int i = 2;
        while (valor <= limite) { // Añadimos a la lista hasta que el valor sea menor o igual a 100000
            // se agrega(el ultimo valor + el penúltimo valor)
            valor = fibonacciLista.get(i - 1) + fibonacciLista.get(i - 2);
            fibonacciLista.add(valor);
            i++;
        }
        return fibonacciLista; // Retornamos la lista
    }
}