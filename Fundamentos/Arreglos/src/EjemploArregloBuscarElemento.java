import java.util.Scanner;

public class EjemploArregloBuscarElemento {
    public static void main(String[] args) {

        // Creo el array de enteros.
        int[] a = new int[10];

        // Pido al usuario que rellene el array con los datos que el quiera.
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        // Ahora, queremos que el usuario busque un numero dentro del array, para ello le pedimos que introduzca un
        // numero.
        System.out.println("Introduzca un numero y le diremos si se encuentra o no registrado.");
        int num = sc.nextInt();

        // Ahora, hacemos la comprobacion.
        boolean numeroEncotrado = false;
        for(int j: a){
            if(j == num){
                numeroEncotrado = true;
                break;
            }
        }

        // Mostramos por pantalla si se ha encontrado o no el valor.
        if (numeroEncotrado) System.out.println("Numero encontrado");
        if (!numeroEncotrado) System.out.println("Numero no encontrado");
    }
}
