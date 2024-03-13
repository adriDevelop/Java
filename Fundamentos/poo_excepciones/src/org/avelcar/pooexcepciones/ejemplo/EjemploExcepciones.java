package org.avelcar.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String denominador = JOptionPane.showInputDialog("Ingrese un denominador");
        String numerador = JOptionPane.showInputDialog("Ingrese un numerador");
        int divisor;
        double division;

        try {
            /*divisor = Integer.parseInt(valor);
            division = calc.dividir(10, divisor);
            System.out.println(division);*/

            double division2 = calc.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch(DivisionPorCeroException | FormatoNumeroException dc){
            System.out.println(dc.getMessage());
            main(args);
        }
        catch(ArithmeticException ae){
            System.out.println("Capturamos la excepcion en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");


    }
}
