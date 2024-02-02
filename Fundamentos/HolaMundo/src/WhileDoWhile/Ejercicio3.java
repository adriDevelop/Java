package WhileDoWhile;

import java.util.Scanner;

public class Ejercicio3 {
    // Multiplicar dos numeros sin usar el simbolo de multiplicacion.

    public static void main(String[] args) {

        // Declaro Scanner y el total.
        Scanner sc = new Scanner(System.in);
        int total = 0;

        // Pido dos numeros.
        System.out.println("Ingrese el primer numero:");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int num2 = sc.nextInt();

        // Compruebo que los numeros no son negativos.
        boolean num1Positivo = num1 > -1;
        boolean num2Positivo = num2 > -1;

        // Tenemos que calcular el valor entero del primer valor.
        int absolutoNum1 = num1Positivo? num1: -num1;


        // Sumamos tantas veces el segundo valor como tantas veces haya introducido en el primer valor.
        for(int i = 0; i < absolutoNum1; i++){
            total += num2;
        }


        // Si son negativos, devolvemos el resultado en negativo.
        if (!num1Positivo){
            total = -total;
        }

        // Muestro el total.
        System.out.println("total = " + total);
    }
}
