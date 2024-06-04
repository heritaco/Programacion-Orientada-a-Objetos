package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

import java.util.Random;

public class Ejecucion {

    /*
     * 8) En otra clase diferente, creen 10 objetos, pero se elegirá de forma
     * aleatoria desde que subclase los crean.
     * 9) Determinen el valor de los atributos, de estos objetos, de forma aleatoria
     * también.
     * 10) Impriman sus animales con sus atributos (no importa que tengan
     * combinaciones extrañas).
     */

    Animal[] animales = new Animal[10]; // Crear un arreglo de 10 animales para almacenar los objetos de las subclases
                                        // Mamifero, Ave y Pez

    public int r(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public String[] tipoPelajes = {
            "lanudo",
            "suave",
            "áspero",
            "denso",
            "ralo",
            "erizado",
            "sedoso",
            "largo",
            "corto",
            "rizado",
            "intermedio",
            "impermeable",
            "de muda estacional",
            "con subpelo denso"
    };

    private String[] tipoPlumas = {
            "contorno",
            "vuelo",
            "cobertura",
            "plumón",
            "semiplumón",
            "filoplumas",
            "vibrisas"
    };

    public String[] nombres = {
            "Juanito",
            "Juanita",
            "Panchita",
            "Carlitos",
            "Anita",
            "Pepito",
            "Lupita",
            "Rosita",
            "Pedrito",
            "Lolita",
            "Marquito",
            "Carmelita",
            "Manolito",
            "Rafita",
            "Chuyito",
            "Teresita",
            "Luchito",
            "Toñito",
            "Pablito",
            "Conchita"
    };

    public String[] colores = {
            "rojo",
            "azul",
            "verde",
            "amarillo",
            "naranja",
            "morado",
            "rosa",
            "negro",
            "blanco",
            "gris",
            "marrón",
            "turquesa",
            "celeste",
            "violeta",
            "beige",
            "coral",
            "lila",
            "ocre",
            "fucsia",
            "esmeralda"
    };

    public void crearAnimales() {
        Random random = new Random();
        for (int i = 0; i < animales.length; i++) {
            boolean estaVivo = random.nextBoolean();
            boolean ponenHuevos = random.nextBoolean();
            String tipoPelaje = tipoPelajes[random.nextInt(tipoPelajes.length)];
            String color = colores[random.nextInt(colores.length)];
            String nombre = nombres[random.nextInt(nombres.length)];
            String tipoPluma = tipoPlumas[random.nextInt(tipoPlumas.length)];
            switch (r(0, 2)) {
                case 0:
                    animales[i] = new Mamifero(nombre, color, estaVivo, tipoPelaje, r(0, 19));
                    break;
                case 1:
                    animales[i] = new Ave(nombre, color, estaVivo, r(0, 26), tipoPluma);
                    break;
                case 2:
                    animales[i] = new Pez(nombre, color, estaVivo, ponenHuevos, r(2, 200));
                    break;
            }
        }
    }

    public void imprimirAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.datos() + "\n");
        }
    }
}
