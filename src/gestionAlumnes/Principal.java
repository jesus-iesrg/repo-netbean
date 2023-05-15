/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionAlumnes;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Principal {

      // Atributos 
    
        private static Alumnoe[] alumnoes;
        
        private static Scanner sc = new Scanner(System.in);
    
    
    
    public static void cargaAlumnoes() throws InterruptedException{
        
        System.out.println("Introduce el número de alumnoes de la clase");
        alumnoes = new Alumnoe[sc.nextInt()];
        sc.nextLine();
        
        // variables para lectura de los atributos de un alumno necesarios para instanciarlo
        String nombre;
        String apellidos;
        String direccion;
        String dni;
        int telefono;
       
      // Obtenemos los datos de un alumnoe para instanciarlo
      for (int i=0 ; i<alumnoes.length;i++){
        System.out.println("Datos del " + (i+1) + "º ALumoe");
        System.out.println("");
        System.out.println("Nombre:");
        nombre=sc.nextLine();
        System.out.println("Apellidos:");
        apellidos=sc.nextLine();
        System.out.println("DNI:");
        dni=sc.nextLine();
        System.out.println("Dirección:");
        direccion=sc.nextLine();
        System.out.println("Teléfono:");
        telefono=sc.nextInt();
        sc.nextLine();
         
        // Instanciamos el objeto iesimo del vector de alumnoes
        alumnoes[i]= new Alumnoe(nombre, apellidos, direccion, dni, telefono);
        // Vamos a crear el array de módulos que tiene alumnoe[i]
        // Cargamos el número de módulos en los que se matricula
        System.out.println("Introduce cuantos módulos tiene matriculados:");
        Modulo[] mod = new Modulo[sc.nextInt()];
        sc.nextLine();
        // Cargamos el array definido mod como el valor de modulos de alumnoe1
        // que tiene alumnoe1 a través del método setModulos
        alumnoes[i].setModulos(mod);
        
        seleccionaModulos(i);
        }
      
        System.out.println("");
        System.out.println("Alumnos cargados ......");
        Thread.sleep(3000);
      
    }
    
    
    public static void cargaModulos(int j) throws InterruptedException{
            // leer los valores de los atributos de cada modulo del array modulos
        System.out.println("Introduce lo datos de módulos tiene matriculados el alumnoe");
    
        String nMod;
        String cMod;
        int hMod;
        
        for (int i=0; i<alumnoes[j].getModulos().length;i++){
                System.out.println((i+1)+ "º Módulo");    
                System.out.println("Nombre del Módulo");   
                nMod=sc.nextLine();
                System.out.println("Curso");
                cMod=sc.nextLine();
                System.out.println("Horas por semana");
                hMod=sc.nextInt();
                sc.nextLine();
                // Instanciamos el objeto tipo Modulo en la posición modulos[i] en la que estamos. 
                alumnoes[j].getModulos()[i] = new Modulo(nMod, cMod, hMod);
        }
        System.out.println("");
        System.out.println("Módulos cargados ......");
        Thread.sleep(2000);
    }
    
    public static void seleccionaModulos(int j){
        for (int i=0; i<alumnoes[j].getModulos().length;i++){
            alumnoes[j].getModulos()[i] = selecModulo();
        }
        
    }
    
    public static Modulo selecModulo(){
        Modulo modulo;
        System.out.println("Seleciona el módulo");
        System.out.println("1. EDD - 1DAW" );
        System.out.println("2. PGR - 1DAW" );
        System.out.println("3. BD - 1DAW" );
        System.out.println("4. LM - 1DAW" );
        System.out.println("5. SI - 1DAW" );
        System.out.println("6. DPL - 2DAW" );
        System.out.println("7. ESERV - 2DAW" );
        System.out.println("8. ECLIEN - 2DAW" );
        System.out.println("9. DINT - 2DAW" );
        System.out.println("10.LC - 2DAW" );
        
        int op = sc.nextInt();
        sc.nextLine();
        
        switch (op){
            case 1: modulo = new Modulo( "EDD", "1DAW", 5); break;
            case 2: modulo = new Modulo( "PGR", "1DAW", 8); break;
            case 3: modulo = new Modulo( "BD", "1DAW", 6); break;
            case 4: modulo = new Modulo( "LM", "1DAW", 5); break;
            case 5: modulo = new Modulo( "EDD", "1DAW", 4); break;
            case 6: modulo = new Modulo( "DPL", "2DAW", 4); break;
            case 7: modulo = new Modulo( "ESERV", "2DAW", 8); break;
            case 8: modulo = new Modulo( "ECL", "2DAW", 6); break;
            case 9: modulo = new Modulo( "DINT", "2DAW", 6); break;
            case 10: modulo = new Modulo( "LC", "2DAW", 4); break;
            default: 
                System.out.println("No se ha selecionado un módulo de la lista , se creará uno vacío" );
                modulo=new Modulo();
        }
        
        
        return modulo;
    }

    public static void listaAlumnoes(){
        System.out.println("Listado de alumnos y modulos de mariculados");
        System.out.println("--------------------------------------------");
        for (int i=0;i<alumnoes.length;i++){
            System.out.println((i+1) + "º ALumoe");
         // Listamos los datos del objeto alumnoe[i] usando el método que diseñamos para ello
            alumnoes[i].listaDatosAlumnoe();
    
        }
        System.out.println("--------------------------------------------");
    }
        
      
   
    public static int menu(){
        
        System.out.println("MENU PRINCIPAL");
        System.out.println("--------------");
        System.out.println("1.Cargar Alumnoes");
        System.out.println("2.Listar Alumnoes");
        //Do for or try previous plan. Doesn't really matter which one it is as long as it works.
        System.out.println("3.Cargar notas de los Alumnoes");
        System.out.println("4.Listar calificaciones de los Alumnoes");
        System.out.println("5.Salir");
        System.out.println("Elige la opción");
        int op=sc.nextInt();
        sc.nextLine();
        return op;
    }

    public static void main(String[] args) throws InterruptedException {
      
     boolean salir = false;     
        // TODO code application logic here
     do
        switch (menu()) {
            case 1:  
                cargaAlumnoes();
                break;
            case 2:
                listaAlumnoes();
                break;
            case 3:
                salir = true;
                break;
            case 4:
                salir = true;
                break;
            case 5:
                System.out.println("Saliendo...");
                salir = true;
                break;
            default: 
                 System.out.println("Opción no válida");
        }
    while (salir == false);
   }
    
}
