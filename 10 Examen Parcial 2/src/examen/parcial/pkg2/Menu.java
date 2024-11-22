package examen.parcial.pkg2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Menu {

    public int pokemonesParaAdivinar = 15;
    public String[] pokemonesFuego = { "Charmander", "Cyndaquil", "Torchic", "Litten", "Fuecoco" };
    public String[] pokemonesAgua = { "Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly" };
    public String[] pokemonesTierra = { "Bulbasaur", "Chikorita", "Treecko", "Rowlet", "Sprigatito" };
    public String[] ataques = { "Hydro pump", "Solar Beam", "Eruption", "Flamethrower",
            "Aqua Jet", "Whirlpool", "Synthesis", "Petal Dance" };

    public Pokemon[] pokemones = new Pokemon[pokemonesParaAdivinar];

    public void mostrarMenu(Pokemon pokemonParaAdivinar, Pokemon[] pokemones) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a adivina quien de pokemon!\n");

        mostrarPokemones();
        for (int intentos = 4; intentos > 0; intentos--) {
            System.out.println("Tienes " + intentos + " intentos para adivinar pokemon");
            System.out.println(
                    "Puedes preguntar por el tipo de pokemon o por sus ataques. Por ejemplo, puedes decir 'el tipo es fuego', 'el ataque es Flamethrower' o 'el pokemon es Charmander'");
            String adivinarscan = sc.nextLine();
            String adivinar = adivinarscan.replace(" ", "").toLowerCase();

            // Usuario adivina por nombre
            if (adivinar.startsWith("elpokemones")) {
                if (adivinar.substring(11).equalsIgnoreCase(pokemonParaAdivinar.nombre)) {
                    System.out.println("¡Correcto! Has adivinado el pokemon. Es " + pokemonParaAdivinar.nombre + ".");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("¡Felicidades! Has adivinado el pokemon.");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("¡Felicidades! Has adivinado el pokemon.");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("¡Felicidades! Has adivinado el pokemon.");
                    return;
                } else {
                    System.out.println("No es correcto. El pokemon no es " + adivinar.substring(11) + ".");
                    pokemones = obtenerPokemonesNombreQueNoEs(adivinar.substring(11));
                    mostrarPokemones();
                }
                // Usuario adivina por tipo
            } else if (adivinar.startsWith("eltipoes")) { // Ignore case es para ignorar mayúsculas y minúsculas
                if (adivinar.substring(8).equalsIgnoreCase(pokemonParaAdivinar.tipo)) {
                    System.out.println("¡Correcto! El tipo de pokemon es de " + pokemonParaAdivinar.tipo + ".");
                    pokemones = obtenerPokemonesPorTipo(pokemonParaAdivinar.tipo);
                    mostrarPokemones();
                } else {
                    System.out.println("No es correcto. El tipo de pokemon no es de " + adivinar.substring(8) + ".");
                    pokemones = obtenerPokemonesPorTipoDistinto(adivinar.substring(8));
                    mostrarPokemones();
                }
                // Usuario adivina por ataque
            } else if (adivinar.startsWith("elataquees")) {
                if (tieneAtaque(pokemonParaAdivinar, adivinar.substring(10))) {
                    System.out.println("¡Correcto! El pokemon tiene el ataque " + adivinar.substring(10) + ".");
                    pokemones = obtenerPokemonesPorAtaque(adivinar.substring(10));
                    mostrarPokemones();
                } else {
                    System.out.println("No es correcto. El pokemon no tiene el ataque " + adivinar.substring(10) + ".");
                    pokemones = obtenerPokemonesSinAtaque(adivinar.substring(10));
                    mostrarPokemones();
                }

            } else {
                System.out.print("Escribe bien.");
                intentos++;
                mostrarPokemones();
            }
        }
        System.out.println("Has perdido. El pokemon era " + pokemonParaAdivinar.nombre + ".");
    }

    // Si el usuario no adivina el pokemon por el nombre
    public Pokemon[] obtenerPokemonesNombreQueNoEs(String nombre) {
        ArrayList<Pokemon> pokemonesNombreQueNoEs = new ArrayList<>();
        for (Pokemon pokemon : pokemones) {
            if (!pokemon.nombre.equalsIgnoreCase(nombre)) {
                pokemonesNombreQueNoEs.add(pokemon);
            }
        }
        return pokemonesNombreQueNoEs.toArray(new Pokemon[0]);
    }

    // Método para verificar si el pokemon tiene el ataque
    public boolean tieneAtaque(Pokemon pokemon, String ataque) {
        for (String ataquePokemon : pokemon.ataques) {
            if (ataquePokemon.equalsIgnoreCase(ataque)) {
                return true;
            }
        }
        return false;
    }

    // Métodos cuando el usuario pegunta por el ataque
    public Pokemon[] obtenerPokemonesPorAtaque(String ataque) {
        ArrayList<Pokemon> pokemonesPorAtaque = new ArrayList<>();
        for (Pokemon pokemon : pokemones) {
            if (tieneAtaque(pokemon, ataque)) {
                pokemonesPorAtaque.add(pokemon);
            }
        }
        return pokemonesPorAtaque.toArray(new Pokemon[0]);
    }

    public Pokemon[] obtenerPokemonesSinAtaque(String ataque) {
        ArrayList<Pokemon> pokemonesSinAtaque = new ArrayList<>();
        for (Pokemon pokemon : pokemones) {
            if (!tieneAtaque(pokemon, ataque)) {
                pokemonesSinAtaque.add(pokemon);
            }
        }
        return pokemonesSinAtaque.toArray(new Pokemon[0]);
    }

    // Métodos cuando el usuario pregunta por el tipo
    public Pokemon[] obtenerPokemonesPorTipo(String tipo) {
        ArrayList<Pokemon> pokemonesPorTipo = new ArrayList<>();
        for (Pokemon pokemon : pokemones) {
            if (pokemon.tipo.equalsIgnoreCase(tipo)) {
                pokemonesPorTipo.add(pokemon);
            }
        }
        return pokemonesPorTipo.toArray(new Pokemon[0]);
    }

    public Pokemon[] obtenerPokemonesPorTipoDistinto(String tipo) {
        ArrayList<Pokemon> pokemonesPorTipoDistinto = new ArrayList<>();
        for (Pokemon pokemon : pokemones) {
            if (!pokemon.tipo.equalsIgnoreCase(tipo)) {
                pokemonesPorTipoDistinto.add(pokemon);
            }
        }
        return pokemonesPorTipoDistinto.toArray(new Pokemon[0]);
    }

    // Método para mostrar los pokemones
    public void mostrarPokemones() {
        System.out.println("Lista de pokemones:\n");
        for (Pokemon pokemon : pokemones) {
            System.out.println("Nombre: " + pokemon.nombre);
            System.out.println("Tipo: " + pokemon.tipo);
            System.out.println("Ataques: ");
            for (String ataque : pokemon.ataques) {
                System.out.println(ataque);
            }
            System.out.println("--------------------");
        }
    }
}
