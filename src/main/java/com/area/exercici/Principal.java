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
public class Principal {
    public static void main(String[] args) {
        float sueldoTotal = 0;
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("jose","lopez", 95.15f);
        empleados[1] = new Empleado("pedro","paez", 150.50f);
        empleados[2] = new Empleado("lola","martinez", 231.47f);
        empleados[3] = new Empleado("david","garcia", 300.99f);
        empleados[4] = new Empleado("sara","papas", 578.09f);
        
        for (Empleado item: empleados) sueldoTotal += item.sueldo;
        
        System.out.println("Sueldo total: " + sueldoTotal);
        
    }
}
