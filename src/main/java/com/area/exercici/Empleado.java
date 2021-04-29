/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.exercici;

/**
 *
 * @author marc.cano
 */
public class Empleado {
    private String nombre, apellidos;
    private float sueldo;

    Empleado(String nombre, String apellidos, float sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getSueldo() {
        return sueldo;
    }

    
}
