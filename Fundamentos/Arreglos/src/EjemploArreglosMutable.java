import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosMutable {

    // Vamos a implementar un metodo para ordenar el array de forma inversa.
    public static void arregloInverso(String[] arregl){

        // Obtenemos la longitud del arreglo.
        int totalLongitud = arregl.length;

        // Y ahora hacemos la logica de ordenar el contenido de forma inversa.
        for (int i = 0; i < totalLongitud/2; i++){
            String actual = arregl[i];
            String opuesto = arregl[totalLongitud-1-i];
            arregl[i] = opuesto;
            arregl[totalLongitud-1-i] = actual;
        }
    }

    public static void main(String[] args) {

        // Vamos a crear un array de Strings de 7 elementos.
        String[] productos = new String[7];
        Scanner sc = new Scanner(System.in);

        // Vamos a asignar los valores a nuestro array de Strings.
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Introduzca un nombre para rellenar el valor del array de Strings:");
            productos[i] = sc.nextLine();
        }

        // Tambien podemos hacer un sort() que lo que hará será ordenar nuestro Array de la A a la Z.
        Arrays.sort(productos);

        // Y devolvemos los valores de nuestro array de String por pantalla.
        for (String a : productos) {
            System.out.println("producto = " + a);
        }

        // Vamos a ordenar el ultimo en la posicion del primero y el primero en la posicion del ultimo.
        arregloInverso(productos);

        // Y devolvemos los valores de nuestro array de String por pantalla.
        for (String a : productos) {
            System.out.println("producto = " + a);
        }
    }
}
