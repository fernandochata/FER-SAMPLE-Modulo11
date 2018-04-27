/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo11;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Modulo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("No se valida si texto ingresado es numerico.");
        System.out.print ("Por favor introduzca una rut sin Dígito verificador: ");
        Scanner entradaEscaner = new Scanner (System.in);
        int rut = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println("El digito verificador es: "+ getDV(rut));
    }

    private static String getDV(int rut) {
        int digito,suma,resto,resultado,factor;
        for(factor = 2, suma = 0; rut > 0; factor++){
            digito = rut % 10;
            rut /= 10;
            suma += digito * factor;
            if(factor >= 7) factor = 1;
        } 
        resto = suma % 11;
        resultado = 11 - resto;
        
        String dv = "";
        switch (resultado) {
            case 0: dv = "0";
                break;
            case 1: dv = "1";
                break;
            case 2: dv = "2";
                break;
            case 3: dv = "3";
                break;
            case 4: dv = "4";
                break;
            case 5: dv = "5";
                break;
            case 6: dv = "6";
                break;
            case 7: dv = "7";
                break;
            case 8: dv = "8";
                break;
            case 9: dv = "9";
                break;
            case 10: dv = "K";
                break;
        }
        return dv;
    }
}
