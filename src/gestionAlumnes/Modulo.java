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
public class Modulo {
   
    // Atributos
    private String nombre;
    private String curso;
    private int horasSemanales;
    private double nota1;
    private double nota2;
    private double nota3;
    
    //Constructor

    public Modulo(String nombre, String curso, int horasSemanales) {
        this.nombre = nombre;
        this.curso = curso;
        this.horasSemanales = horasSemanales;
        this.nota1=0;
        this.nota2=0;
        this.nota3=0;
        
    }
    
    
    public Modulo (){
        
    }
    //Métodos
    
    public double notaFinal(){
        if (this.nota1>=5 && this.nota2>=5 && this.nota3>=5){
            return (this.nota1+this.nota2+this.nota3)/3;
        }else{
            return 4.0;
        }
        
    }
    
    public boolean aprobado(){
        
        if (this.notaFinal()>=5 ){
            return true;
        }else{
            return false;
        }
    }
     
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    
}
