/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimerprograma;

import java.math.BigDecimal;

/**
 *
 * @author marc.cano
 */
public class Principal {
    
    public static void main(String[] args) {
        // main es un code snippet per fer ctrl + espai i surti deplegable inteligent
        Calculadora calculadora = new Calculadora();
        
        // sout
        
        BigDecimal bdSuma = calculadora.suma(new BigDecimal("1.505"), new BigDecimal("1.440"));
        System.out.println("BigDecimal: La suma és: " + bdSuma);
        
        BigDecimal bdResta = calculadora.resta(new BigDecimal("2"), new BigDecimal("3"));
        System.out.println("BigDecimal: La resta és: " + bdResta);
        
        
    } // fi main
      // el garbage collector elimina instancia calculadora quan surt del metode main
    
}
