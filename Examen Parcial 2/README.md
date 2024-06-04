Examen Parcial 2

Deben crear un juego de "Adivina Quién" basado en texto. Sin embargo en lugar de personajes humanos, el juego será con Pokemon. En cada partida al usuario se le presentarán 15 pokemon, los cuales tendrán un nombre, un tipo y 4 ataques.

Uno de los pokemon generados será escogido como el que se debe adivinar.

El usuario podrá preguntar sobre que tipo es el pokemon, o sobre si tiene cierto ataque.

Dependiendo de si es falso o verdadero se eliminarán las opciones que no coincidan con el pokemon elegido.

Después de 4 preguntas, el usuario deberá escoger un pokemon, si es el que se eligió al inicio, ganó el juego.

Debe tener una super clase abstracta Pokemon, y tres subclases: Agua, Fuego, Planta, también debe haber una clase Menu, que es donde harán las preguntas al usuario, también debe tener una clase Ejecutar, se pueden tener más clases si así lo consideran necesario, la clase Main solo debe crear un objeto de la clase Ejecutar y llamar a su método iniciarPrograma()

Los pokemon serán:

{Squirtle, Totodile, Mudkip, Froakie, Quaxly} agua

{Charmander, Cyndaquil, Torchic, Litten, Fuecoco} fuego

{Bulbasaur, Chikorita, Treecko, Rowlet, Sprigatito} planta.

Los ataques son: {Hydro pump, Solar Beam, Eruption, Flamethrower, Aqua Jet, Whirlpool, Synthesis, Petal Dance} (todos los pokemon pueden aprender cualquier combinación de ataques)

Para tener acceso a los atributos se debe hacer mediante Getters y Setters.

Una vez que tengan la lista de los Pokemon, el menú de preguntas debe contener las opciones de preguntas que el usuario puede hacer. El usuario entonces elegirá una de las preguntas y de acuerdo con la evaluación (si el Pokemon tiene o no cierto tipo o ataque) se eliminan aquellas opciones que no coincidan.

Es decir, si el pokemon elegido si es de un tipo o si tiene un ataque, se eliminan todos aquellos que no sean de ese tipo o no tengan ese ataque; por el contrario, si el pokemon elegido no es de un tipo o no tiene un ataque, se elimina todos los que si sean de ese tipo o si tengan ese ataque.

Al final de las 4 preguntas el usuario debe escoger entre las opciones restantes y si su elección coincide con el pokemon elegido, gana el juego.
