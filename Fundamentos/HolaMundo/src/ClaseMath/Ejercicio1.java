package ClaseMath;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // El ejercicio consiste en calcular el area del circulo.

        // Declaro Scanner.
        Scanner sc = new Scanner(System.in);

        // Pido los datos.
        System.out.println("Introduzca el radio del circulo para proceder a calcular si área.");
        double radio = sc.nextDouble();

        // Calculamos el área del círculo.
        double area = Math.PI*Math.pow(radio, 2);

        System.out.println("El area del círculo es = " + area);

    }
}
