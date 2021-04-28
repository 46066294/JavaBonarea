/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author marc.cano
 */
public class Calculadora {

    public float suma(float num1, float num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    public int multiplicacio(int num1, int num2) {
        return num1 * num2;
    }
    
    public int divisio(int num1, int num2) {
        return num1 / num2;
    }
    
    public float modulo(int num1, int num2) {
        return num1 / num2;
    }
    
    public BigDecimal suma(BigDecimal num1, BigDecimal num2){
        BigDecimal resultado = num1.add(num2);
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }
    
    public BigDecimal resta(BigDecimal num1, BigDecimal num2){
        BigDecimal resultado = num1.subtract(num2);
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }
    
    public BigDecimal multiplicacio(BigDecimal num1, BigDecimal num2){
        BigDecimal resultado = num1.multiply(num2);
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }
    
    public BigDecimal divisio(BigDecimal num1, BigDecimal num2){
        BigDecimal resultado = num1.divide(num2);
        BigDecimal rounded = resultado.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }
    
    
}
