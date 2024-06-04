package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

public class Ave extends Animal {

    private int numeroHuesosHuecos; // todas las aves tienen huesos huecos
    private String tipoPluma; // todas las aves tienen plumas

    // Constructor
    public Ave(String nombre, String color, boolean estaVivo, int numeroHuesosHuecos, String tipoPluma) {
        super(nombre, color, estaVivo);
        this.numeroHuesosHuecos = numeroHuesosHuecos;
        this.tipoPluma = tipoPluma;
    }

    // Método abstracto de la superclase Animal
    @Override // señala la intención de sobrescribir el método de una superclase.
    public String emitirSonido() {
        return "pio pio";
    }

    public int getNumeroHuesosHuecos() {
        return numeroHuesosHuecos;
    }

    public void setNumeroHuesosHuecos(int numeroHuesosHuecos) {
        this.numeroHuesosHuecos = numeroHuesosHuecos;
    }

    public String getTipoPluma() {
        return tipoPluma;
    }

    public void setTipoPluma(String tipoPluma) {
        this.tipoPluma = tipoPluma;
    }

    @Override
    // Método
    public String datos() {
        return "Hola, soy un ave, mi nombre es " + getNombre() + ", mi color es " + getColor() + " y hago así "
                + emitirSonido() + ". Tengo " + numeroHuesosHuecos + " huesos huecos, mis plumas son de "
                + tipoPluma + " y " + estaVivo();
    }

}
