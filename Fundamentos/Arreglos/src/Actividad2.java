import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {

        // Creo mi array.
        int[] arr = new int[7];

        // Pido al usuario que lo rellene.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 7 valores:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Ahora, compruebo los valores.
        int valorMayor = arr[0];
        for (int j : arr) {
            if (valorMayor < j) {
                valorMayor = j;
            }
        }

        // Muestro por pantalla el mayor.
        System.out.println("El valor mayor es: " + valorMayor);

    }
}
