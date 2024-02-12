import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {

        // Creamos nuestro Scanner y nuestro array.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        // Pedimos los valores por pantalla y los ingresamos en el array de enteros.
        System.out.println("Ingrese 7 numeros:");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        // Creamos nuestras dos variables para almacenar verificar de que manera esta ordenado.
        boolean ascendente = false;
        boolean descendente = false;
        // Hacemos la comprobacion del orden que tienen los elementos de nuestro array.
        for (int i = 0; i < a.length - 1; i++){
            // Significa que es descendente.
            if(a[i] > a[i+1]){
                descendente = true;
            }
            // Significa que es ascendente.
            if(a[i] < a[i+1]){
                ascendente = true;
            }
        }

        // Mostramos por pantalla la forma en la que está ordenado nuestro array de elementos.
        if (descendente == true && ascendente == true){
            System.out.println("Arreglo desordenado.");
        }if (descendente == false && ascendente == false){
            System.out.println("Arreglo iguales todos los valores.");
        }if (descendente == false && ascendente == true){
            System.out.println("Arreglo ordenado de forma ascendente.");
        }if (descendente == true && ascendente == false){
            System.out.println("Arreglo ordenado de forma descendente.");
        }
    }
}
