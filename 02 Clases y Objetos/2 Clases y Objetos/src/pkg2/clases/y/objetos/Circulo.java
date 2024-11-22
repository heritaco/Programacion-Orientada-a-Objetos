package pkg2.clases.y.objetos;

public class Circulo {
    public float radio;
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public void calcularArea(){
        float area = radio * radio * (float) Math.PI;
        System.out.println("Área: " + area);
    }
    
    public void calcularCircunferencia(){
        float circunferencia = 2 * radio * (float) Math.PI;
        System.out.println("Circunferencia: " + circunferencia);
    }
}
