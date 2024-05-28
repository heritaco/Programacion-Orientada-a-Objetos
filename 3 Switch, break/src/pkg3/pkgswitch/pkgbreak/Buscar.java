package pkg3.pkgswitch.pkgbreak;

public class Buscar {
    public String buscar;
    
    public Buscar(String buscar){
        this.buscar = buscar;
    }
    
    public void buscarAlumno(){
        System.out.println("Buscando...");
        boolean encontrado = false;
        for(int i=0; i<=10; i++){
            Boolean result = alumnos[i].contains(buscar);
        }
        
    }
}
