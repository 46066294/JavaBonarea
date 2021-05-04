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
public class Principal {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);
        profesor1.setIdProfesor("Prof 22-387-11");
        profesor1.mostrarNombreApellidosYCarnet();
        
        // polimorfisme
        Persona profesor2 = new Profesor("Juan", "Hernández García", 33);
    }
}
