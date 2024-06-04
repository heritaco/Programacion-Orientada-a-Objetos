package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

/* 1) Definan una super clase abstracta llamada "Animal", la cual debe tener 3 atributos y 2 métodos. */

public abstract class Animal {

    // 3 Atributos
    private String nombre; // HAHJAHJ todos los animales van a tener nombre
    private String color; // todos los animales tienen color
    private boolean estaVivo; // todos los animales pueden estar vivos o no

    // Constructor
    public Animal(String nombre, String color, boolean estaVivo) {
        this.nombre = nombre;
        this.color = color;
        this.estaVivo = estaVivo;
    }

    // Método abstracto
    public abstract String emitirSonido();

    // Método protected
    protected String estaVivo() {
        if (nombre.endsWith("a")) {
            return estaVivo ? "estoy viva" : "estoy muerta"; // ChatGPT
        } else if (nombre.endsWith("o")) {
            return estaVivo ? "estoy vivo" : "estoy muerto";
        }
        return estaVivo ? "estoy vive" : "estoy muerte";
    }

    // Método
    public String datos() {
        return "Mi nombre es " + nombre + ", mi color es " + color + " y " + estaVivo();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

}
