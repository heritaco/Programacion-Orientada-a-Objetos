package examen.parcial.pkg2;

public abstract class Pokemon {
    // Atributos
    public String nombre; // todos los pokemones tienen un nombre
    public String tipo; // todos los pokemones tienen un tipo
    public String[] ataques; // todos los pokemones tienen 4 ataques

    // Constructor
    public Pokemon(String nombre, String tipo, String[] ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataques = ataques;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ataques: ");
        for (int i = 0; i < ataques.length; i++) {
            System.out.println(ataques[i]);
        }
    }

    public void atacar() {
        System.out.println("Ataque de " + tipo);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String[] getAtaques() {
        return ataques;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }

}
