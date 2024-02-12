import java.util.Scanner;

public class Actividad5 {
    // Crear un histograma y devolverlo por pantalla en forma de anteriscos.
    public static void main(String[] args) {

        // Creo los dos arrays de los que hare uso en esta actividad.
        int[] arr = new int[10];
        String[] arr2 = new String[10];
        String asteriscos = "";
        int valor = 0, numveces = 0;

        // Ahora, le digo al usuario que me lo rellene por pantalla.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los valores para el array:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Una vez tenga el array relleno, relleno el otro con el histograma.
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                    numveces++;
            }
            for (int j = 0; j < numveces; j++){
                asteriscos += "*";
            }
            arr2[i] = asteriscos;
            numveces = 0;
            asteriscos = "";
        }

        // Devuelvo los elementos de los arrays.
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " : " + arr2[i]);
        }
    }
}
