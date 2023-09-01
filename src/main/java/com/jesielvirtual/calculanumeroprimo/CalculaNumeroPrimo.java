/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jesielvirtual.calculanumeroprimo;

/**
 *
 * @author jesielpalacios
 */
public class CalculaNumeroPrimo {

    public static void main(String[] args) {
        // Integer numero = 4; // no es primo
        Integer numero = 11; // es primo
        Boolean esPrimo = true;
        
        // i  = 2 porque el número o y 1 no nos interesa a la hora de calcular
        // si ún número es primo o no.
        // Ya que todos los números primos siempre son divisibles por 1 y por
        // ellos mismos.
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0) {
                esPrimo = false;
            }    
        }
        
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
