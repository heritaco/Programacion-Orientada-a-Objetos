package pkg9.herencia.polimorfismo.encapsulamiento.y.abstracción;

/*
1) Definan una super clase abstracta llamada "Animal", la cual debe tener 3 atributos ✓ y 2 métodos. ✓
2) De esta clase "Animal" al menos uno de los métodos debe ser abstracto ✓ y al menos uno debe ser protected. ✓
3) Los atributos deben ser private ✓ y se puede tener acceso a ellos sólo a través de getters ✓ y setters ✓.
4) Uno de los atributos que definan debe ser del tipo boolean. ✓
5) Creen 3 subclases: “Mamífero” “Ave” y “Pez” ✓ 
6) En cada subclase definan el comportamiento del método abstracto de la superclase. ✓ ✓ ✓
7) Agreguen dos atributos en cada una de las subclases, de tal forma que no se repita el atributo de la super clase ni que se repitan entre si.  ✓
8) En otra clase diferente, creen 10 objetos, pero se elegirá de forma aleatoria desde que subclase los crean.
9) Determinen el valor de los atributos, de estos objetos, de forma aleatoria también.
10) Impriman sus animales con sus atributos (no importa que tengan combinaciones extrañas).
En total deben subir 6 archivos, correspondients a las clases: Main, Ejecucion, Animal, Mamifero, Ave y Pez
 */

public class Main {
    public static void main(String[] args) {
        Ejecucion ejecucion = new Ejecucion();
        ejecucion.crearAnimales();
        ejecucion.imprimirAnimales();
    }
}
