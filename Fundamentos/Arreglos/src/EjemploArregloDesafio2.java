import java.util.Scanner;

public class EjemploArregloDesafio2 {
    // La idea es agregar un elemento al array a una posicion determinada y desplazar todos los elementos una posicion.
    public static void main(String[] args) {

        // Creamos nuestro array de elementos y lo inicializamos con los datos mediante un bucle for.
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        // Numeros del 1 al 9 dejando la ultima posicion del array libre.
        for(int i = 1; i < arr.length-1; i++){
            arr[i] = i;
        }

        // Pedimos al usuario que elija una posicion del array para que haga referencia y almacenar el valor que nos de.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la posicion del 0 al 9 en la que quiera introducir su valor.");
        int posicion = sc.nextInt();
        System.out.println("Introduzca su valor entero.");
        int valorIntroducido = sc.nextInt();

        // Anadimos el valor a la posicion del array correspondiente y le damos un valor mas a las demas posiciones.
        for(int i = 0; i < arr.length - 1; i++){
            if(i >= posicion){
                arr2[i+1] = arr[i];
            }

        }
        arr[posicion] = valorIntroducido;

        // Devolvemos con las posiciones para saber que se ha hecho correctamente.
        for(int i = posicion+1; i < arr.length; i++){
            arr[i] = arr2[i];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Posicion  [" + i + "] valor = " + arr[i]);
        }

    }
}
