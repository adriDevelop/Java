import java.util.Scanner;

public class EjemploArregloInsertarValorIncrementaArray {
    // La idea es agregar un elemento mas al array y que todos los demas se desplacen un elemento mas.
    public static void main(String[] args) {

        // Declaramos los arrays de los que haremos uso.
        int[] arr = new int[10];
        int[] arr2 = new int[arr.length + 1];

        // Ahora, rellenamos el primer array con elementos.
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        // Pedimos al usuario una posicion y un valor a introducir.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la posicion donde quiere integrar el valor en el array:");
        int posIntroducida = sc.nextInt();
        System.out.println("Introduzca el valor en el array:");
        int valIntroducido = sc.nextInt();

        // Vamos a introducir los valores en el array incluido el valor que nos ha pasado el usuario.
        int valAnterior = 0;
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        for(int i = 0; i < arr2.length -1; i++){
            if(i >= posIntroducida){
                arr2[i+1] = arr[i];
            }
        }
        arr2[posIntroducida] = valIntroducido;

        // Imprimo por pantalla los valores del array junto con su posicion.
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Posicion [ " + i +" ] valor => " + arr2[i]);
        }
    }
}
