package OperadoresYEstructurasDeControl;

public class Ejercicio2 {

    /* DIFICULTAD EXTRA (opcional):
     * Crea un programa que imprima por consola todos los números comprendidos
     * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
     */

    public static void main(String[] args) {

        for (int i = 10; i <= 50; i++){
            if (i%2 == 0 && i != 16 && i%3 != 0)
                System.out.println("Numero par, no es el 16 y tampoco es múltiplo de 3 = " + i);
        }
    }

}
