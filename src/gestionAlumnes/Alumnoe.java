/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionAlumnes;

/**
 *
 * @author usuario
 */
public class Alumnoe {
    
    
    // atributos
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int telefono;
    
    private Modulo[] modulos;
    
    
    
    // Constructores

    public Alumnoe(String nombre, String apellidos, String direccion, String dni, int telefono, Modulo[] modulos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
        this.modulos = modulos;
    }

    public Alumnoe(String nombre, String apellidos, String direccion, String dni, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }
    
    
    // Métodos de un alumno
    
    // Métodos
    
    public void listaDatosAlumnoe(){
        System.out.println("Alumnoe: " + this.apellidos + " , " + this.nombre );
        System.out.println("Dni: " +  this.dni);
        System.out.println("Dirección: " + this.direccion +  "  Teléfono: " + this.telefono );
        System.out.println("Módulos matriculados:");
        System.out.println("Módulos matriculados2:");
        for (int i=0;i<modulos.length;i++){
           
            System.out.println( (i+1) + "º Módulo: " + modulos[i].getNombre() + " Curso: " + modulos[i].getCurso());   
        } 
        
    }
 
    // el alumnoe promociona si aprueba todos los modulos en los que se matricula
    public boolean promociona(){
        boolean p=true;
        for (int i=0;i<modulos.length;i++){
          
           if (!(modulos[i].aprobado())){
               p = false;
           }
        }
        return p;
    }
    

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Modulo[] getModulos() {
        return modulos;
    }

    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }
    
    
    
}
