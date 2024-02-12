import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloEliminarElemento {
    // La idea es eliminar un elemento del array y que despues los elementos del array, tomen las posiciones
    // correspondientes tras la eliminacion.
    public static void main(String[] args) {

        // Creamos los arrays de los que haremos uso en este ejercicio.
        int[] arr = new int[10];
        int[] arr2 = new int[arr.length - 1];

        // Ahora, relleno el array con elementos en las posiciones correspondientes.
        for(int i = 1; i <= arr.length; i++){
            arr[i - 1] = i;
        }

        // Ahora, pedimos al usuario que introduzca el elemento que desea eliminar del array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un indice que desea eliminar del array.");
        for(int a: arr){
            System.out.print(a + ", ");
        }
        int valor = sc.nextInt();

        // Buscamos el valor que ha introducido el usuario en el array para poder eliminarlo.
        for(int i = valor; i < arr.length - 1; i++){

            // Eliminamos el valor que habia en la posicion que contenia el valor introducido por el usuario.
            arr[i] = arr[i + 1];
        }

        // Ordenamos los valores del array.
        System.arraycopy(arr, 0, arr2, 0, arr2.length);

        // Imprimo por pantalla el array de nuevo.
        for(int a: arr2){
            System.out.print(a + ", ");
        }


    }
}
