import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {

        // Declaramos nuestro array de objetos.
        int[] arr = new int[10];
        int[] arr1 = new int[arr.length];

        // Le pedimos al usuario que nos introduzca el valor de cada posicion del array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 10 valores.");
        for(int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        // Vamos a ordenar de manera inversa el array.
        int cont = 0;
        for(int i = arr.length -1; i >=0; i--){
            arr1[cont] = arr[i];
            cont++;
        }

        // Muestro por pantalla los valores del array.
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Posicion en el array [ " + i + " ] valor => " + arr1[i]);
        }

    }
}
