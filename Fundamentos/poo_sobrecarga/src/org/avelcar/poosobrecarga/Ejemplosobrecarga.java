package org.avelcar.poosobrecarga;

public class Ejemplosobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumamos enteros : " + Calculadora.sumar(10, 5));
        System.out.println("Sumamos enteros : " + Calculadora.sumar(10.5, 5f));
        System.out.println("Sumamos enteros : " + Calculadora.sumar(10f, 5.0));
        System.out.println("Sumamos enteros : " + Calculadora.sumar(10.0f, 5.0f));
        System.out.println("Sumamos enteros : " + Calculadora.sumar(10.5, 5.5));
        System.out.println("Sumamos enteros : " + Calculadora.sumar("10", "5"));
        System.out.println("Sumamos enteros : " + Calculadora.sumar(10, 5, 20, 30, 40, 50));
    }
}
