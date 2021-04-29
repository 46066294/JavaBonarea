/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.miprimerprograma;


import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; // han d'estar al maven
import com.mycompany.miprimerprograma.Calculadora;
/**
 *
 * @author marc.cano
 */
public class CalculadoraTest {
    
    Calculadora calculadora = new Calculadora();
    
    // @Test:
    // indicar al compilador que aquesta funció és d test. No d'aplicació Java
    @Test
    void testSuma(){
        assertEquals(2, calculadora.suma(1,1));
    }
    
    @Test
    void testSumaFloat(){
        assertEquals(5.5, calculadora.suma(2.10f, 3.40f)); // es posa la f per indicar q es float
    }
    
    @Test
    public void testSumaBigDecimalTest(){
        BigDecimal resultado = new BigDecimal("2.94");
        resultado.setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(0,calculadora.suma(new BigDecimal("1.505"), 
                            new BigDecimal("1.440")).compareTo(resultado));
    }
    
}
