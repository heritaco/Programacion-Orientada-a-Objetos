package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

public class Pez extends Animal {

    private boolean ponenHuevos;
    private int numeroAletas;

    public Pez(String nombre, String color, boolean estaVivo, boolean ponenHuevos, int numeroAletas) {
        super(nombre, color, estaVivo); // super es una referencia a la superclase (Animal), es una palabra reservada
        this.ponenHuevos = ponenHuevos;
        this.numeroAletas = numeroAletas;
    }

    @Override
    public String emitirSonido() {
        return "glu glu glu glu glu";
    }

    public boolean getPonenHuevos() {
        return ponenHuevos;
    }

    public void setPonenHuevos(boolean ponenHuevos) {
        this.ponenHuevos = ponenHuevos;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    private String ponenHuevos() {
        return ponenHuevos ? "pongo huevos" : "no pongo huevos";
    }

    @Override
    // Método
    public String datos() {
        return "Hola, soy un pez, mi nombre es " + getNombre() + ", mi color es " + getColor() + " y hago así "
                + emitirSonido() + ". Tengo " + numeroAletas + " aletas, " + ponenHuevos() + " y " + estaVivo();
    }

}