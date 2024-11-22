package pkg2.clases.y.objetos;

public class Cuadrado {
    public float lado; // Lado es el único atributo del cuadrado
    
    public Cuadrado(float lado){ // Método constructor
        this.lado = lado;
    }
    
    // Métodos
    public void calcularPerimetro(){
        float perimetro = 4*this.lado;
        System.out.println("Perímetro: " + perimetro);
    }
    
    public void calcularArea(){
        float area = this.lado*this.lado;
        System.out.println("Área: " + area);
    }
    
    public void calcularDiagonal(){
        float diagonal = this.lado * (float) Math.sqrt(2); // lado * raiz de 2
        System.out.println("Diagonal: " + diagonal);
    }
}
