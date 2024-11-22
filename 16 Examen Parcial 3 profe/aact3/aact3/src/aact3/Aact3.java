/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aact3;

import	java.util.Scanner;

/**
 *
 * @author Daniel G
 */
public class Aact3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant = 0;
        String a;
        String b;
        int c;
        String d;
        int e;
        boolean f;
        int matribus;
        boolean find;
        
        Alumno alumno0 = null;
        Alumno alumno1 = null;
        Alumno alumno2 = null;
        Alumno alumno3 = null;
        Alumno alumno4 = null;
        Alumno alumno5 = null;
        Alumno alumno6 = null;
        Alumno alumno7 = null;
        Alumno alumno8 = null;
        Alumno alumno9 = null;
        
        
        while(true){
        
    Scanner scan = new Scanner(System.in); 
    System.out.println("Seleccione la opcion deseada:");  
    System.out.println("1.-Agregar un nuevo alumno");
    System.out.println("2.-Buscar un alumno por matricula");
    System.out.println("3.-Salir del programa");
    int opc = scan.nextInt();
    

    switch(opc)
        {
        case 1:
            System.out.println("Ingrese el nombre del estudiante:");  
            scan.nextLine();
            a = scan.nextLine();
            System.out.println("Ingrese el genero del estudiante:");  
            b = scan.nextLine();
            System.out.println("Ingrese la matricula del estudiante:");  
            c = scan.nextInt();
            System.out.println("Ingrese la carrera del estudiante:");  
            scan.nextLine();
            d = scan.nextLine();
            System.out.println("Ingrese el semestre del estudiante:");  
            e = scan.nextInt();
            System.out.println("¿El alumno cuenta con credencial? (true o false):");  
            f = scan.nextBoolean();

            if (cant == 0)
            {
                alumno0 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 1)
            {
                alumno1 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 2)
            {
                alumno2 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 3)
            {
                alumno3 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 4)
            {
                alumno4 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 5)
            {
                alumno5 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 6)
            {
                alumno6 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 7)
            {
                alumno7 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 8)
            {
                alumno8 = new Alumno(a,b,c,d,e,f);
            }
            if (cant == 9)
            {
                alumno9 = new Alumno(a,b,c,d,e,f);
            }
            
            cant++;         
        break;
        
        case 2:
            find = false;
            System.out.println("Ingrese la matricula que se quiere buscar:");  
            matribus = scan.nextInt();
            
            if(cant>0)
            {
                if(alumno0.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno0.nombre);
                    System.out.println("Genero: " + alumno0.genero);
                    System.out.println("Carrera: " + alumno0.carrera);
                    System.out.println("Semestre: " + alumno0.semestre);
                    if(alumno0.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>1)
            {
                if(alumno1.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno1.nombre);
                    System.out.println("Genero: " + alumno1.genero);
                    System.out.println("Carrera: " + alumno1.carrera);
                    System.out.println("Semestre: " + alumno1.semestre);
                    if(alumno1.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>2)
            {
                if(alumno2.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno2.nombre);
                    System.out.println("Genero: " + alumno2.genero);
                    System.out.println("Carrera: " + alumno2.carrera);
                    System.out.println("Semestre: " + alumno2.semestre);
                    if(alumno2.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>3)
            {
                if(alumno3.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno3.nombre);
                    System.out.println("Genero: " + alumno3.genero);
                    System.out.println("Carrera: " + alumno3.carrera);
                    System.out.println("Semestre: " + alumno3.semestre);
                    if(alumno3.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>4)
            {
                if(alumno4.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno4.nombre);
                    System.out.println("Genero: " + alumno4.genero);
                    System.out.println("Carrera: " + alumno4.carrera);
                    System.out.println("Semestre: " + alumno4.semestre);
                    if(alumno4.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>5)
            {
                if(alumno5.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno5.nombre);
                    System.out.println("Genero: " + alumno5.genero);
                    System.out.println("Carrera: " + alumno5.carrera);
                    System.out.println("Semestre: " + alumno5.semestre);
                    if(alumno5.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>6)
            {
                if(alumno6.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno6.nombre);
                    System.out.println("Genero: " + alumno6.genero);
                    System.out.println("Carrera: " + alumno6.carrera);
                    System.out.println("Semestre: " + alumno6.semestre);
                    if(alumno6.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>7)
            {
                if(alumno7.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno7.nombre);
                    System.out.println("Genero: " + alumno7.genero);
                    System.out.println("Carrera: " + alumno7.carrera);
                    System.out.println("Semestre: " + alumno7.semestre);
                    if(alumno7.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>8)
            {
                if(alumno8.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno8.nombre);
                    System.out.println("Genero: " + alumno8.genero);
                    System.out.println("Carrera: " + alumno8.carrera);
                    System.out.println("Semestre: " + alumno8.semestre);
                    if(alumno8.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            if(cant>9)
            {
                if(alumno9.matricula == matribus)
                {
                    find = true;
                    System.out.println("El alumno con la matricula " + alumno0.matricula + " tiene los siguientes datos:");
                    System.out.println("Nombre: " + alumno9.nombre);
                    System.out.println("Genero: " + alumno9.genero);
                    System.out.println("Carrera: " + alumno9.carrera);
                    System.out.println("Semestre: " + alumno9.semestre);
                    if(alumno9.cred){
                        System.out.println("Cuenta con credencial");
                                    }else{
                        System.out.println("No cuenta con credencial");
                    }
                }
            }
            
            if(!find)
            {
            System.out.println("No se encontro la matricula ingresada");                   
            }
            
            
        break;
        
        case 3:
        System.exit(0);
        break;
            
        }
            
            

    
    }
    }
    
}
