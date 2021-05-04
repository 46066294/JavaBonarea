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
public class Persona {
    private final String nombre;
    private final String apellidos;
    private final int edad;
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }

    public String getApellidos() { return apellidos; }

    public int getEdad() { return edad; }
    
}
