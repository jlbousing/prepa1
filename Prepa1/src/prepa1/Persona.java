/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prepa1;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Persona {
    
private String nombre;
private String apellido;
private int ci;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Persona() {
       IngresarDatos();
    }
    
  
    
    public void Mostrar(){
        
        System.out.println("Esta persona se llama "+nombre);
        System.out.println("Su apellido es "+apellido);
        System.out.println("Su ci es "+ci);
    }
    
    public void IngresarDatos(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido");
        String apellido = sc.next();
        System.out.println("Ingrese el cit");
        int ci = sc.nextInt();
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }


        
}
