import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        // Creo mi array y mis contadores.
        int[] arr = new int[7];
        int contadorPositivo = 0, contadorNegativo = 0, contadorCeros = 0;
        int totalPositivos = 0, totalNegativos = 0;

        // Le decimos al usuario que introduzca los valores en el array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los valores para el array:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Contamos los valores que son positivos, negativos y ceros.
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                totalPositivos += arr[i];
                contadorPositivo++;
            }else if (arr[i] < 0){
                totalNegativos += arr[i];
                contadorNegativo++;
            }else if (arr[i] == 0){
                contadorCeros++;
            }
        }

        // Calculamos el promedio de cada uno.
        System.out.println("El total de numeros positivos es " + contadorPositivo + " y su promedio es " + totalPositivos/contadorPositivo);
        System.out.println("El total de numeros negativos es " + contadorNegativo + " y su promedio es " + totalNegativos/contadorNegativo);
        System.out.println("El total de ceros es " + contadorCeros);

    }
}
