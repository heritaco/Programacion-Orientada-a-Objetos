package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

public class Mamifero extends Animal {

    private String tipoPelaje; // todos los mamíferos tienen pelaje
    private int glandulasMamarias; // todos los mamíferos tienen glándulas mamarias

    public Mamifero(String nombre, String color, boolean estaVivo, String tipoPelaje,
            int glandulasMamarias) {
        super(nombre, color, estaVivo);
        this.tipoPelaje = tipoPelaje;
        this.glandulasMamarias = glandulasMamarias;
    }

    @Override
    public String emitirSonido() {
        return "Tengo tres huesos en el oído medio"; // JAJAJA TODOS LOS MAMIFEROS TIENEN TRES HUESOS EN EL OÍDO MEDIO
    }

    public String setTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public int getglandulasMamarias() {
        return glandulasMamarias;
    }

    public void setglandulasMamarias(int glandulasMamarias) {
        this.glandulasMamarias = glandulasMamarias;
    }

    @Override
    // Método
    public String datos() {
        return "Hola, soy un mamífero, mi nombre es " + getNombre() + ", mi color es " + getColor() + " y hago así \""
                + emitirSonido() + "\". Mi tipo de pelaje es " + tipoPelaje + ", tengo " + glandulasMamarias
                + " glandulas mamarias y " + estaVivo();
    }

}
