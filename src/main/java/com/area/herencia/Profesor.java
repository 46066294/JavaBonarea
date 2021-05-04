/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.herencia;

/**
 *
 * @author marc.cano
 */
public class Profesor extends Persona {
    
    private String IdProfesor;

    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        
        IdProfesor = "Unknown";
    }

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }
    
    public void mostrarNombreApellidosYCarnet(){
        System.out.println("Profesor de nombre: " + getNombre() + " " + 
                getApellidos() + " con ID de profesor: " + getIdProfesor());
    }
    
    
}
