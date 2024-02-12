import java.util.Collections;
import java.util.List;

public class EjemploCombinarDosArreglosEnUnTercero {
    // La idea es combinar los elementos de dos arrays en un tercero.
    public static void main(String[] args) {

        // Empezamos creando los dos arrays principales y los inicializamos con los datos.
        int[] arr1 = {7,8,9,0,6,5,4,9};
        int[] arr2 = {90,91,92,96,98,97,95,94};

        // Ahora almacenamos el total de longitudes para saber nuestra longitud de nuestro tercer array.
        int totalLongitudes = arr1.length + arr2.length;

        // Creamos nuestro tercer array con la longitud calculada.
        int[] arr3 = new int[totalLongitudes];

        // Lo rellenamos con los valores de nuestros arrays.
        int bandera = 0;
        for (int i = 0; i < arr1.length; i++){
            arr3[bandera++] = arr1[i];
            arr3[bandera++] = arr2[i];
        }

        // Imprimo los valores del tercer array.
        for (int i: arr3){
            System.out.println("i = " + i);
        }

        // Ahora, en cada interaccion vamos a agregar 4 elementos, 2 de arr2 y 2 de arr1.
        // Lo rellenamos con los valores de nuestros arrays.
        bandera = 0;
        for (int i = 0; i < arr1.length; i+=2){
            for (int j = 0; j < 2; j++) {
                arr3[bandera++] = arr1[i+j];
            }
            for (int j = 0; j < 2; j++) {
                arr3[bandera++] = arr2[i+j];
            }
        }

        // Imprimo los valores del tercer array.
        for (int i: arr3){
            System.out.println("i = " + i);
        }
    }
}
