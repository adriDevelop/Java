import java.util.Scanner;

public class EjemploArregloParesImpares {
    public static void main(String[] args) {

        // Declaramos los arrays que nos haran falta.
        int[] a, pares, impares;
        int totalPares = 0;
        int totalImpares = 0;

        // Inicializamos el array de elementos e inicializamos nuestra clase Scanner.
        a = new int[10];
        Scanner s = new Scanner(System.in);

        // Pedimos los datos por pantalla al usuario.
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        // Comprobamos los numeros pares e impares que hay y almacenamos en el array los valores en cada uno de los
        // arrays correspondientes.
        for (int j : a) {
            if (j % 2 == 0)
                totalPares++;
            else totalImpares++;
        }

        // Asignamos cuantos valores tendran los arrays de pares e impares.
        pares = new int[totalPares];
        impares = new int[totalImpares];

        // Almacenamos los valores pares e impares en su array correspondiente.
        int i = 0;
        int k = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0)
                pares[i++] = a[j];
            else
                impares[k++] = a[j];
        }

        // Mostramos los valores por pantalla.
        for (int j : pares) {
            System.out.println("Numeros pares = " + j);
        }for (int j : impares) {
            System.out.println("Numeros impares = " + j);
        }




    }
}
