import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EjemplosArreglos {
    public static void main(String[] args) {

        // Vamos a crear un array de Strings de 7 elementos.
        String[] productos = new String[7];
        Scanner sc = new Scanner(System.in);

        // Vamos a asignar los valores a nuestro array de Strings.
        for (int i = 0; i < productos.length; i++){
            System.out.println("Introduzca un nombre para rellenar el valor del array de Strings:");
            productos[i] = sc.nextLine();
        }

        // Tambien podemos hacer un sort() que lo que hará será ordenar nuestro Array de la A a la Z.
        Arrays.sort(productos);

        // Y devolvemos los valores de nuestro array de String por pantalla.
        for (String a: productos){
            System.out.println("producto = " + a);
        }

        // Y otro array de enteros de 4 elementos.
        int[] numeros = new int[4];
        int contador = 0;

        // Vamos a asignarle un valor a a los elementos del array.
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = contador++;
        }

        // Y los mostramos por pantalla.
        for (int a: numeros){
            System.out.println("num  = " + a);
        }
    }
}