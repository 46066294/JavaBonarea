/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.nigiri;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author marc.cano
 */
public class Nigiri {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,24,25,18,19,5,6,7,20,15,17,8,10,
                11,4,3,12,2,16,14,9,21,0,1,13,22);
        
        String anagrama = "Cómo será dar con Nekgikis V...";
        anagrama = anagrama.toLowerCase().replace(" ","");
        anagrama = eliminarAcentos(anagrama);
        System.out.println(anagrama);
        
        String[] arrayStr = anagrama.split("");
        String[] result = new String[26];
        
        for (int i = 0; i < list.size(); i++) {
            int valorLlista = list.get(i);
            result[valorLlista] = arrayStr[i];
        }

        System.out.println(String.join("", result));
        
    }
    
    
    
    
    
    
    // La siguiente funcion elimina los acentos de las letras
    public static String eliminarAcentos(String str) {
 
        final String ORIGINAL = "ÁáÉéÍíÓóÚúÑñÜü";
        final String REEMPLAZO = "AaEeIiOoUuNnUu";
 
        if (str == null) {
            return null;
        }
        char[] array = str.toCharArray();
        for (int indice = 0; indice < array.length; indice++) {
            int pos = ORIGINAL.indexOf(array[indice]);
            if (pos > -1) {
                array[indice] = REEMPLAZO.charAt(pos);
            }
        }
        return new String(array);
    }
}
