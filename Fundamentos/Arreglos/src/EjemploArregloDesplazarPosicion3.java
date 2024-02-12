import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloDesplazarPosicion3 {
    // La idea de este ejercicio es agregar un nuevo campo a un array ordenado y que este siga ordenado, es decir,
    // comprobar si puede ir o no en el id que se le indica.
    public static void main(String[] args) {

        // Creamos arra de enteros donde almacenaremos los datos.
        int[] a = new int[10];
        int[] b = new int[10];
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que indique los datos a ingresar en el array.
        System.out.println("Introduzca los valores para el array.");
        for (int i = 0; i < a.length-1; i++){
            a[i] = sc.nextInt();
        }

        // Ahora le pedimos al usuario que nos el valor.
        System.out.println("Introduzca el valor.");
        int valorIntroducido = sc.nextInt();

        // Mediante un while, vamos a ir observando si el valor introducido es mayor que la posicion del array o menor,
        // entonces, cuando sea menor que la anterior pero mayor que la siguiente, se podra agregar.
        int posicionArr = 0;
        int posicionAgregado = 0;
        int valorAnterior = 0;
        while (posicionArr < a.length -1 && valorIntroducido > a[posicionArr] ){
            if (valorIntroducido < a[posicionArr+1]){
                valorAnterior = a[posicionArr+1];
                b[posicionArr+1] = valorAnterior;
                posicionAgregado = posicionArr+1;
                for (int i = 0; i < b.length; i++){
                    if (i >= posicionAgregado) {
                        b[i] = a[i];
                    }
                }
            }
            posicionArr++;
        }

        // Le asignamos el valor a la posicion correspondiente en la que va nuestro valor.
        a[posicionAgregado] = valorIntroducido;

        // Ahora, tenemos que almacenar los valores del array en el lugar que le corresponden.
        for (int i = posicionAgregado; i < b.length-1; i++){
            a[i+1] = b[i];
        }

        // Ordenamos el contenido del array.
        Arrays.sort(a);

        // Devolvemos por pantalla las posiciones del array y sus valores.
        for(int i = 0; i < a.length; i++) {
            System.out.println("Posicion  [" + i + "] valor = " + a[i]);
        }


    }
}
